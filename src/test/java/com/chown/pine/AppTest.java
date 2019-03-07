/**
 * 文 件 名:  AppTest
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2019/3/6 0006
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.chown.pine;

import com.chown.pine.boot.ApplicationBootstrap;
import com.chown.pine.entity.Ad;
import com.chown.pine.mapper.AdMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author zping
 * @version 2019/3/6 0006
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@RunWith (SpringRunner.class)
@SpringBootTest (classes = ApplicationBootstrap.class)
public class AppTest
{

	@Autowired
	private AdMapper adMapper;

	@Test
	public void contextLoad ()
	{
		Ad ad = adMapper.queryAdById ("2018071700106475000241494948");
		System.out.println (ad);
	}
}
