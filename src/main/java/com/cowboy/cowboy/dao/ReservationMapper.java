package com.cowboy.cowboy.dao;

import com.cowboy.cowboy.model.Reservation;
import com.cowboy.cowboy.model.ReservationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReservationMapper {
    int countByExample(ReservationExample example);

    int deleteByExample(ReservationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reservation record);

    int insertSelective(Reservation record);

    List<Reservation> selectByExample(ReservationExample example);

    Reservation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reservation record, @Param("example") ReservationExample example);

    int updateByExample(@Param("record") Reservation record, @Param("example") ReservationExample example);

    int updateByPrimaryKeySelective(Reservation record);

    int updateByPrimaryKey(Reservation record);
}