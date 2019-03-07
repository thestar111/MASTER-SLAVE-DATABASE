/**
 * 文 件 名:  AdMapper
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2019/3/6 0006
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.chown.pine.mapper;

import com.chown.pine.entity.Ad;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author zping
 * @version 2019/3/6 0006
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface AdMapper
{
	/**
	 * 增加广告
	 *
	 * @tags return void
	 */
	int add (Ad ad);

	/**
	 * 根据广告Id查询广告 供管理平台使用
	 *
	 * @tags @param adId
	 * @tags @return
	 * return Ad
	 */
	Ad queryAdById (String advertisementId);
}
