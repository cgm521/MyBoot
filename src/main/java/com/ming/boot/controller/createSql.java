package com.ming.boot.controller;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author cgm
 * @date 2017/12/14.
 */
public class createSql {
    public DataSource createDataSource(String driver, String url,
                                       String userName, String password) {
        try {
            //创建ComboPooledDataSource
            ComboPooledDataSource comboPooledDataSource=new ComboPooledDataSource();
            //设置相应参数
            comboPooledDataSource.setDriverClass(driver);
            comboPooledDataSource.setJdbcUrl(url);
            comboPooledDataSource.setUser(userName);
            comboPooledDataSource.setPassword(password);
            //设置最小连接个数
            comboPooledDataSource.setMinPoolSize(5);
            //设置最大连接个数
            comboPooledDataSource.setMaxPoolSize(50);
            //设置最大空闲时间
            comboPooledDataSource.setMaxIdleTime(5000);
            //返回数据源对象
            return comboPooledDataSource;
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return null;
    }
}
