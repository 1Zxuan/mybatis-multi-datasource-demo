package com.louzx.demo.mapper;

import com.louzx.multidatasource.annotation.DataSource;
import com.louzx.multidatasource.annotation.MultiDataSource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DataSource("db2")
public interface IDemoDB2Mapper extends MultiDataSource {

    void save();
}
