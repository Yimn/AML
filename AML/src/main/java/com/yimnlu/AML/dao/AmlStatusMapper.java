package com.yimnlu.AML.dao;

import com.yimnlu.AML.entity.AmlStatus;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author luyimin
 * @since 2021-03-10
 */
@Mapper
public interface AmlStatusMapper extends BaseMapper<AmlStatus> {
    void InitStatus();
    AmlStatus ReachStatus(String FUNC_NAME);
    List<AmlStatus> ReachAllStatus();
    void UpdateFuncStatus(int STATUS,String FUNC_NAME);
}
