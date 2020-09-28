package com.cowboy.cowboy.dao;

import com.cowboy.cowboy.model.ClerkInfo;
import com.cowboy.cowboy.model.ClerkInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClerkInfoMapper {
    int countByExample(ClerkInfoExample example);

    int deleteByExample(ClerkInfoExample example);

    int deleteByPrimaryKey(Long clkId);

    int insert(ClerkInfo record);

    int insertSelective(ClerkInfo record);

    List<ClerkInfo> selectByExample(ClerkInfoExample example);

    ClerkInfo selectByPrimaryKey(Long clkId);

    int updateByExampleSelective(@Param("record") ClerkInfo record, @Param("example") ClerkInfoExample example);

    int updateByExample(@Param("record") ClerkInfo record, @Param("example") ClerkInfoExample example);

    int updateByPrimaryKeySelective(ClerkInfo record);

    int updateByPrimaryKey(ClerkInfo record);
}