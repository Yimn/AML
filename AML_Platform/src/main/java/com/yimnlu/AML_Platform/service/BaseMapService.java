package com.yimnlu.AML_Platform.service;

import com.yimnlu.AML_Platform.dto.location;
import com.yimnlu.AML_Platform.entity.BaseMap;
import com.baomidou.mybatisplus.service.IService;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

import static com.yimnlu.AML_Platform.executor.DICT.DEFAULT_DEPART_ID;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yimnlu
 * @since 2020-11-21
 */
public interface BaseMapService extends IService<BaseMap> {
    HashMap<String, location> init_map(@RequestParam(value = "DEPARTID",defaultValue = DEFAULT_DEPART_ID)String DEPARTID);
}
