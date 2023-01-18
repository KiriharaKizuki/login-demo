package com.seuwxxh.logindemo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author luowb
**/
@Configuration
public class LoginDataSourceConfig {
    @Bean(name="loginDataSource")
    public DataSource getLoginDataSource(){
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://lwbmljx.club:3306/demo")
                .username("srtp")
                .password("0okMju7ygVfr4")
                .build();
    }

    @Bean("loginSqlSessionFactory")
    public SqlSessionFactory loginSqlSessionFactory(
            @Qualifier("loginDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapping/*.xml"));
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean("loginTransactionManger")
    public DataSourceTransactionManager loginTransactionManger(
            @Qualifier("loginDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean("loginSqlSessionTemplate")
    public SqlSessionTemplate loginSqlSessionTemplate(
            @Qualifier("loginSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
