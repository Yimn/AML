package com.yimnlu.AML_Platform.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yimnlu.AML_Platform.dao.BaseMapMapper;
import com.yimnlu.AML_Platform.dto.location;
import com.yimnlu.AML_Platform.entity.BaseMap;
import com.yimnlu.AML_Platform.service.BaseMapService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

import static com.yimnlu.AML_Platform.executor.DICT.DEFAULT_DEPART_ID;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yimnlu
 * @since 2020-11-21
 */
@Deprecated
@Slf4j
@Service
public class BaseMapServiceImpl extends ServiceImpl<BaseMapMapper, BaseMap> implements BaseMapService {
    @Resource
    BaseMapMapper baseMapMapper;

    public HashMap<String, location> init_map(@RequestParam(value = "DEPARTID", defaultValue = DEFAULT_DEPART_ID) String DEPARTID) {
        return handle_map(baseMapMapper._F_BASEMAP_LOCATION_(DEPARTID));
    }

    private HashMap<String, location> handle_map(List<BaseMap> list) {
        HashMap<String, location> temp = new HashMap<>();
        for (BaseMap baseMap : list) {
//            HashMap<String ,String> _temp = new HashMap<>();
//            _temp.put(baseMap.getLongitude(),baseMap.getLatitude());
            temp.put(baseMap.getCnName(), new location(baseMap.getLongitude(), baseMap.getLongitude()));
        }
        return temp;
    }
}
