package com.yimnlu.AML_Platform.dao;

import com.yimnlu.AML_Platform.entity.BaseMap;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yimnlu
 * @since 2020-11-21
 */
@Mapper
public interface BaseMapMapper extends BaseMapper<BaseMap> {
    List<BaseMap> _F_BASEMAP_LOCATION_(@Param("DEPARTID")String DEPARTID);
}
