package com.example.jeboot.dao;

import com.example.jeboot.base.BaseMapper;
import com.example.jeboot.entity.TCcoreIdentity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TCcoreIdentityMapper extends BaseMapper<TCcoreIdentity,TCcoreIdentity> {

    int batchInsert(List<TCcoreIdentity> list);
}