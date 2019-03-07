package com.chown.pine.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <广告>
 *
 * @author weiwenfeng
 * @version 2017年7月14日
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Getter
@Setter
public class Ad implements Serializable
{
	/**
	 * 广告编号
	 */
	private String advertisementId;

	/**
	 * 广告名称
	 */
	private String advertisementName;

	/**
	 * 广告链接
	 */
	private String advertisementUrl;

	/**
	 * 广告图片
	 */
	private String imgUrl;

	/**
	 * 创建时间
	 */
	private String createTime;

	/**
	 * 广告状态(0 : 禁用  1：有效)
	 */
	private String isValid;

	/**
	 * 广告类型(1：外链  2：应用   3：栏目  4：启动页广告 5 ：landingPage广告 6：套餐类型 7 : 交互式广告)
	 */
	private String advertisementType;

	/**
	 * 目标编号
	 */
	private String targetId;

	/**
	 * 备注
	 */
	private String memo;

	/**
	 * 扩展字段1
	 */
	private String ext1;

	/**
	 * 扩展字段2
	 */
	private String ext2;

	@Override
	public String toString ()
	{
		final StringBuilder sb = new StringBuilder ("Ad{");
		sb.append ("advertisementId='").append (advertisementId).append ('\'');
		sb.append (", advertisementName='").append (advertisementName).append ('\'');
		sb.append (", advertisementUrl='").append (advertisementUrl).append ('\'');
		sb.append (", imgUrl='").append (imgUrl).append ('\'');
		sb.append (", createTime='").append (createTime).append ('\'');
		sb.append (", isValid='").append (isValid).append ('\'');
		sb.append (", advertisementType='").append (advertisementType).append ('\'');
		sb.append (", targetId='").append (targetId).append ('\'');
		sb.append (", memo='").append (memo).append ('\'');
		sb.append (", ext1='").append (ext1).append ('\'');
		sb.append (", ext2='").append (ext2).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}
}
