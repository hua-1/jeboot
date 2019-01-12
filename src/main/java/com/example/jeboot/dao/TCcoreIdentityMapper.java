package com.example.jeboot.dao;

import com.example.jeboot.base.BaseMapper;
import com.example.jeboot.entity.TCcoreIdentity;
import com.example.jeboot.entity.TTest;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TCcoreIdentityMapper extends BaseMapper<TCcoreIdentity,TCcoreIdentity> {

    int batchInsert(List<TCcoreIdentity> list);


}