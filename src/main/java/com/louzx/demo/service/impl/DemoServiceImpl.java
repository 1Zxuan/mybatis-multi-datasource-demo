package com.louzx.demo.service.impl;

import com.louzx.demo.mapper.IDemoDB1Mapper;
import com.louzx.demo.mapper.IDemoDB2Mapper;
import com.louzx.demo.service.IDemoService;
import com.louzx.multidatasource.annotation.Transaction;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoServiceImpl implements IDemoService {

    @Resource
    private IDemoDB1Mapper demoDB1Mapper;
    @Resource
    private IDemoDB2Mapper demoDB2Mapper;

    @Override
    @Transaction(values = "db1")
    public void DB() {
        demoDB1Mapper.save();
    }

    @Override
    @Transaction(values = {"db1", "db2"})
    public void multiDB() {
        demoDB1Mapper.save();
        demoDB2Mapper.save();
    }
}
