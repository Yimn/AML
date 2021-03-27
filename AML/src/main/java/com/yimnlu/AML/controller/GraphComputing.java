package com.yimnlu.AML.controller;

import com.yimnlu.AML.dao.GraphComputingMapper;
import com.yimnlu.AML.dto.ACCTBaseDetail;
import com.yimnlu.AML.entity.AmlDTA;
import com.yimnlu.Graph.Graph;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/GraphComputing")
@Slf4j
@Api(tags = "GraphComputing", value = "GraphComputing")
public class GraphComputing {
    public List<ACCTBaseDetail> list;
    public Map<Integer, List<ACCTBaseDetail>> mapLength = new HashMap<>();
    @Resource
    GraphComputingMapper graphComputingMapper;

    void CalGraph(Map<Integer, List<ACCTBaseDetail>> source,List<ACCTBaseDetail> list, int index, int length) {
        for (int i = index; i < list.size(); i++) {
            ACCTBaseDetail origin = list.get(i);
            System.out.print("head ");
            System.out.print(list.get(index).getACCT_ID() + " -> " + list.get(index).getCTPY_ACCT_ID());
            CalGraph_Deep(source,list, list.get(index).getCTPY_ACCT_ID(), ++index, 1, origin);
            System.out.println();
        }
    }

    void CalGraph_Deep(Map<Integer, List<ACCTBaseDetail>> source,List<ACCTBaseDetail> list, String target, int index, int length, ACCTBaseDetail origin) {
        length++;
        for (int i = index; i < list.size(); i++) {
            if (target.equals(list.get(index).getACCT_ID())) {
                System.out.print(" -> " + list.get(index).getACCT_ID() + " -> " + list.get(index).getCTPY_ACCT_ID());
                CalGraph_Deep(source,list, list.get(index).getCTPY_ACCT_ID(), ++i, length, origin);
            }
        }
        if (length > 1) {
            if (source.containsKey(length)) {
                source.get(length).add(origin);
            } else {
                source.put(length, new LinkedList<>());
            }
            source.get(length).add(origin);
        }
    }

    @PostConstruct
    @ApiOperation(value = "show", notes = "show")
    @GetMapping("/update")
    public void update() {
        Graph<String> graph = new Graph();
        list = graphComputingMapper.d1();

        for (ACCTBaseDetail acctBaseDetail : list) {
            graph.addEdge(acctBaseDetail.getACCT_ID(), acctBaseDetail.getCTPY_ACCT_ID(), false);
        }

        log.info("Analysing Suspect Graph Datasource>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        CalGraph(mapLength,list, 0, 0);
//        log.info("Analysing All Data Graph Datasource>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        List<ACCTBaseDetail> list1 = graphComputingMapper.d2();
//        CalGraph(list1, 0, 0);
//        log.info("---------------------------------------------------------------------");

        // print the graph.
        System.out.println("Graph:\n"
                + graph.toString());

        // gives the no of vertices in the graph.
        graph.getVertexCount();

        // gives the no of edges in the graph.
        graph.getEdgesCount(false);
        // tells whether the edge is present or not.
        //graph.hasEdge();

        // tells whether vertex is present or not
        //graph.hasVertex();
        log.info(mapLength.toString());
    }

    @ApiOperation(value = "show", notes = "show")
    @GetMapping("/returnHashMap")
    public Map returnHashMap() {
        update();
        return mapLength;
    }

    @ApiOperation(value = "show", notes = "show")
    @GetMapping("/returnMaxLength")
    public int returnMaxLength() {
        return mapLength.size();
    }

    @ApiOperation(value = "show", notes = "show")
    @GetMapping("/returnMap")
    public List<ACCTBaseDetail> returnMap(Integer integer, String workdate) {
        if (integer == null)
            integer = 2;
        if (workdate != null) {
            Map<Integer, List<ACCTBaseDetail>> map = new HashMap<>();
            List<ACCTBaseDetail> temp = graphComputingMapper.d3(workdate);
            Graph<String> graph = new Graph();
            for (ACCTBaseDetail acctBaseDetail : temp) {
                graph.addEdge(acctBaseDetail.getACCT_ID(), acctBaseDetail.getCTPY_ACCT_ID(), false);
            }

            log.info("Analysing Suspect Graph Datasource>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            CalGraph(map,temp, 0, 0);
            log.info(map.toString());
            return map.get(integer);
        } else
            return mapLength.get(integer);
    }

    @ApiOperation(value = "show", notes = "show")
    @GetMapping("/QueryByACCTID")
    public List<AmlDTA> QueryByACCTID(String s) {
        return graphComputingMapper.QueryByAcctID(s);
    }

}
