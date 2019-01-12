package com.example.jeboot.base;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseMapper<ID, T> {
    int deleteByPrimaryKey(Long oid);

    int insert(ID record);

    int insertSelective(ID record);

    T selectByPrimaryKey(Long oid);

    int updateByPrimaryKeySelective(ID record);

    int updateByPrimaryKey(ID record);
}
