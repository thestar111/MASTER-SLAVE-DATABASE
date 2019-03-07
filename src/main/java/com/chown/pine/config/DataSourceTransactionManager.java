/**
 * 文 件 名:  DataSourceTransactionManager
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2019/3/4 0004
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.chown.pine.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * <主数据源配置事务>
 *
 * @author zping
 * @version 2019/3/4 0004
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Configuration
@EnableTransactionManagement
public class DataSourceTransactionManager extends DataSourceTransactionManagerAutoConfiguration
{
	/**
	 * 自定义事务
	 * MyBatis自动参与到spring事务管理中，无需额外配置，
	 * 只要org.mybatis.spring.SqlSessionFactoryBean引用的数据源与DataSourceTransactionManager引用的数据源一致即可，
	 * 否则事务管理会不起作用。
	 *
	 * @return
	 */
	@Resource (name = "writeDataSource")
	private DataSource dataSource;

	@Bean (name = "transactionManager")
	public org.springframework.jdbc.datasource.DataSourceTransactionManager transactionManagers ()
	{
		System.out.println ("-------------------- transactionManager init ---------------------");
		return new org.springframework.jdbc.datasource.DataSourceTransactionManager (dataSource);
	}
}
