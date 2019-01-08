package com.example.jeboot.dao;

import com.example.jeboot.entity.TCcoreIdentity;

public interface TCcoreIdentityMapper {
    int deleteByPrimaryKey(Long oid);

    int insert(TCcoreIdentity record);

    int insertSelective(TCcoreIdentity record);

    TCcoreIdentity selectByPrimaryKey(Long oid);

    int updateByPrimaryKeySelective(TCcoreIdentity record);

    int updateByPrimaryKey(TCcoreIdentity record);
}