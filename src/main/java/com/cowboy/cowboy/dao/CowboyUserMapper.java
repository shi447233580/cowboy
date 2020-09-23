package com.cowboy.cowboy.dao;

import com.cowboy.cowboy.model.CowboyUser;
import com.cowboy.cowboy.model.CowboyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CowboyUserMapper {
    int countByExample(CowboyUserExample example);

    int deleteByExample(CowboyUserExample example);

    int insert(CowboyUser record);

    int insertSelective(CowboyUser record);

    List<CowboyUser> selectByExample(CowboyUserExample example);

    int updateByExampleSelective(@Param("record") CowboyUser record, @Param("example") CowboyUserExample example);

    int updateByExample(@Param("record") CowboyUser record, @Param("example") CowboyUserExample example);
}