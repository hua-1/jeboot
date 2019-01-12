package com.example.jeboot.dao;

import com.example.jeboot.entity.TCcoreIdentity;
import com.example.jeboot.entity.TTest;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TCcoreIdentityMapper  {

    int deleteByPrimaryKey(Long oid);

    int insert(TCcoreIdentity tCcoreIdentity);

    int insertSelective(TCcoreIdentity tCcoreIdentity);

    TTest selectByPrimaryKey(Long oid);

    int updateByPrimaryKeySelective(TCcoreIdentity tCcoreIdentity);

    int updateByPrimaryKey(TCcoreIdentity tCcoreIdentity);

    int batchInsert(List<TCcoreIdentity> list);


}