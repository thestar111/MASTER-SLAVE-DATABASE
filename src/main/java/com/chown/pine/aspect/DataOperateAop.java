/**
 * 文 件 名:  DataSourceAop
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2019/3/5 0005
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.chown.pine.aspect;

import com.chown.pine.context.DataSourceContextHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * <数据库数据切面操作>
 *
 * @author zping
 * @version 2019/3/5 0005
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Aspect
@Component
public class DataOperateAop
{
	/**
	 * 数据查询切面
	 */
	@Before ("execution(* com.chown.pine.mapper..*.get*(..)) || execution(* com.chown.pine.mapper..*.query*(..))")
	public void setReadDataSourceType ()
	{
		DataSourceContextHolder.read ();
		System.out.println ("dataSource切换到：Read");
	}

	/**
	 * 数据写切面
	 */
	@Before ("execution(* com.chown.pine.mapper..*.add*(..)) || execution(* com.chown.pine.mapper..*.update*(..))"
			+ "|| execution(* com.chown.pine.mapper..*.del*(..))")
	public void setWriteDataSourceType ()
	{
		DataSourceContextHolder.write ();
		System.out.println ("dataSource切换到：write");
	}
}
