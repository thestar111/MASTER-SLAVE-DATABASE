/**
 * 文 件 名:  DataSourceContextHolder
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2019/3/1 0001
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.chown.pine.context;

import com.chown.pine.cons.DataSourceType;

/**
 * <本地线程全局变量>
 *
 * @author zping
 * @version 2019/3/1 0001
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class DataSourceContextHolder
{
	/**
	 * 本地现场变量
	 */
	private static final ThreadLocal<String> local = new ThreadLocal<String> ();

	/**
	 * 获取本地变量
	 *
	 * @return
	 */
	public static ThreadLocal<String> getLocal ()
	{
		return local;
	}

	/**
	 * 读可能是多个库
	 */
	public static void read ()
	{
		System.out.println ("reader reader reader ...... ");
		local.set (DataSourceType.read.getType ());
	}

	/**
	 * 写只有一个库
	 */
	public static void write ()
	{
		System.out.println ("write write write ...... ");
		local.set (DataSourceType.write.getType ());
	}

	/**
	 * 获取JDBC类型
	 *
	 * @return
	 */
	public static String getJdbcType ()
	{
		return local.get ();
	}
}
