package com.example.jeboot.dao;

import com.example.jeboot.base.BaseMapper;
import com.example.jeboot.entity.TTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface TTestMapper  extends BaseMapper<TTest,TTest> {

    int  batchList(@Param("list") List<TTest> list);

    int insertSelectiveOne(TTest tTest);
}