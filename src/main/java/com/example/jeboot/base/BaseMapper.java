package com.example.jeboot.base;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseMapper<ID, T> {
    int deleteByPrimaryKey(Long oid);

    int insert(ID record);

    int insertSelective(ID record);

    T selectByPrimaryKey(Long oid);

    int updateByPrimaryKeySelective(ID record);

    int updateByPrimaryKey(ID record);
}
