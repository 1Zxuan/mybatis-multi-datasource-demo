package com.louzx.demo.mapper;

import com.louzx.multidatasource.annotation.DataSource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DataSource("db2")
public interface IDemoDB2Mapper {

    void save();
}
