/**
 * 文 件 名:  ApplicationBootstrap
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2019/3/1 0001
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.chown.pine.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author zping
 * @version 2019/3/1 0001
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.chown.pine")
public class ApplicationBootstrap
{
	public static void main (String[] args)
	{
		SpringApplication.run (ApplicationBootstrap.class, args);
	}
}
