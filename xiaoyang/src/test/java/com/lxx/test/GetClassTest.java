package com.lxx.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class GetClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContextLoaderListener();
		new CharacterEncodingFilter();
		new DispatcherServlet();
		new BasicDataSource();
		new SqlSessionFactoryBean();
		new MapperScannerConfigurer();
		new DataSourceTransactionManager();
	}

}
