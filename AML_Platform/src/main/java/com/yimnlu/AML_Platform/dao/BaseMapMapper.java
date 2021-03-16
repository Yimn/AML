package com.yimnlu.AML_Platform.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yimnlu.AML_Platform.entity.BaseMap;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yimnlu
 * @since 2020-11-21
 */
@Deprecated
@Mapper
public interface BaseMapMapper extends BaseMapper<BaseMap> {
    List<BaseMap> _F_BASEMAP_LOCATION_(@Param("DEPARTID") String DEPARTID);
}
