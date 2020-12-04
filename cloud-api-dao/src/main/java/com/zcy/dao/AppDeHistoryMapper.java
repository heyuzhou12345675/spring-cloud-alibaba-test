package com.zcy.dao;


import com.zcy.entity.AppDeHistory;
import com.zcy.entity.AppDeHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppDeHistoryMapper {
    long countByExample(AppDeHistoryExample example);

    int deleteByExample(AppDeHistoryExample example);

    int insert(AppDeHistory record);

    int insertSelective(AppDeHistory record);

    List<AppDeHistory> selectByExample(AppDeHistoryExample example);

    int updateByExampleSelective(@Param("record") AppDeHistory record, @Param("example") AppDeHistoryExample example);

    int updateByExample(@Param("record") AppDeHistory record, @Param("example") AppDeHistoryExample example);
}