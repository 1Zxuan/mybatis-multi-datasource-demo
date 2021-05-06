package com.louzx.demo.mapper;

import com.louzx.multidatasource.annotation.DataSource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DataSource("db1")
public interface IDemoDB1Mapper {

    void save();
}
