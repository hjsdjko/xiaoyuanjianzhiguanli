package com.entity.view;

import com.entity.ToudiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 简历投递
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("toudi")
public class ToudiView extends ToudiEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 jianli
			/**
			* 简历 的 用户
			*/
			private Integer jianliYonghuId;
			/**
			* 简历唯一编号
			*/
			private String jianliUuidNumber;
			/**
			* 简历名称
			*/
			private String jianliName;
			/**
			* 姓名
			*/
			private String jianliXingming;
			/**
			* 求职方向
			*/
			private Integer jianliTypes;
				/**
				* 求职方向的值
				*/
				private String jianliValue;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 手机号
			*/
			private String jianliPhone;
			/**
			* 照片
			*/
			private String jianliPhoto;
			/**
			* 教育经历
			*/
			private String jiaoyuText;
			/**
			* 实习或工作经历
			*/
			private String shixiText;
			/**
			* 个人介绍
			*/
			private String gerenText;

		//级联表 zhaopin
			/**
			* 招聘信息名称
			*/
			private String zhaopinName;
			/**
			* 招聘信息照片
			*/
			private String zhaopinPhoto;
			/**
			* 薪资待遇
			*/
			private String zhaopinDaiyu;
			/**
			* 上班地点
			*/
			private String zhaopinAddress;
			/**
			* 联系人
			*/
			private String lianxirenName;
			/**
			* 招聘电话
			*/
			private String zhaopinPhone;
			/**
			* 招聘岗位
			*/
			private Integer zhaopinTypes;
				/**
				* 招聘岗位的值
				*/
				private String zhaopinValue;
			/**
			* 招聘人数
			*/
			private Integer zhaopinRenshuNumber;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 招聘信息详情
			*/
			private String zhaopinContent;

	public ToudiView() {

	}

	public ToudiView(ToudiEntity toudiEntity) {
		try {
			BeanUtils.copyProperties(this, toudiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set jianli
					/**
					* 获取：简历 的 用户
					*/
					public Integer getJianliYonghuId() {
						return jianliYonghuId;
					}
					/**
					* 设置：简历 的 用户
					*/
					public void setJianliYonghuId(Integer jianliYonghuId) {
						this.jianliYonghuId = jianliYonghuId;
					}

					/**
					* 获取： 简历唯一编号
					*/
					public String getJianliUuidNumber() {
						return jianliUuidNumber;
					}
					/**
					* 设置： 简历唯一编号
					*/
					public void setJianliUuidNumber(String jianliUuidNumber) {
						this.jianliUuidNumber = jianliUuidNumber;
					}
					/**
					* 获取： 简历名称
					*/
					public String getJianliName() {
						return jianliName;
					}
					/**
					* 设置： 简历名称
					*/
					public void setJianliName(String jianliName) {
						this.jianliName = jianliName;
					}
					/**
					* 获取： 姓名
					*/
					public String getJianliXingming() {
						return jianliXingming;
					}
					/**
					* 设置： 姓名
					*/
					public void setJianliXingming(String jianliXingming) {
						this.jianliXingming = jianliXingming;
					}
					/**
					* 获取： 求职方向
					*/
					public Integer getJianliTypes() {
						return jianliTypes;
					}
					/**
					* 设置： 求职方向
					*/
					public void setJianliTypes(Integer jianliTypes) {
						this.jianliTypes = jianliTypes;
					}


						/**
						* 获取： 求职方向的值
						*/
						public String getJianliValue() {
							return jianliValue;
						}
						/**
						* 设置： 求职方向的值
						*/
						public void setJianliValue(String jianliValue) {
							this.jianliValue = jianliValue;
						}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 手机号
					*/
					public String getJianliPhone() {
						return jianliPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setJianliPhone(String jianliPhone) {
						this.jianliPhone = jianliPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getJianliPhoto() {
						return jianliPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setJianliPhoto(String jianliPhoto) {
						this.jianliPhoto = jianliPhoto;
					}
					/**
					* 获取： 教育经历
					*/
					public String getJiaoyuText() {
						return jiaoyuText;
					}
					/**
					* 设置： 教育经历
					*/
					public void setJiaoyuText(String jiaoyuText) {
						this.jiaoyuText = jiaoyuText;
					}
					/**
					* 获取： 实习或工作经历
					*/
					public String getShixiText() {
						return shixiText;
					}
					/**
					* 设置： 实习或工作经历
					*/
					public void setShixiText(String shixiText) {
						this.shixiText = shixiText;
					}
					/**
					* 获取： 个人介绍
					*/
					public String getGerenText() {
						return gerenText;
					}
					/**
					* 设置： 个人介绍
					*/
					public void setGerenText(String gerenText) {
						this.gerenText = gerenText;
					}
















				//级联表的get和set zhaopin

					/**
					* 获取： 招聘信息名称
					*/
					public String getZhaopinName() {
						return zhaopinName;
					}
					/**
					* 设置： 招聘信息名称
					*/
					public void setZhaopinName(String zhaopinName) {
						this.zhaopinName = zhaopinName;
					}
					/**
					* 获取： 招聘信息照片
					*/
					public String getZhaopinPhoto() {
						return zhaopinPhoto;
					}
					/**
					* 设置： 招聘信息照片
					*/
					public void setZhaopinPhoto(String zhaopinPhoto) {
						this.zhaopinPhoto = zhaopinPhoto;
					}
					/**
					* 获取： 薪资待遇
					*/
					public String getZhaopinDaiyu() {
						return zhaopinDaiyu;
					}
					/**
					* 设置： 薪资待遇
					*/
					public void setZhaopinDaiyu(String zhaopinDaiyu) {
						this.zhaopinDaiyu = zhaopinDaiyu;
					}
					/**
					* 获取： 上班地点
					*/
					public String getZhaopinAddress() {
						return zhaopinAddress;
					}
					/**
					* 设置： 上班地点
					*/
					public void setZhaopinAddress(String zhaopinAddress) {
						this.zhaopinAddress = zhaopinAddress;
					}
					/**
					* 获取： 联系人
					*/
					public String getLianxirenName() {
						return lianxirenName;
					}
					/**
					* 设置： 联系人
					*/
					public void setLianxirenName(String lianxirenName) {
						this.lianxirenName = lianxirenName;
					}
					/**
					* 获取： 招聘电话
					*/
					public String getZhaopinPhone() {
						return zhaopinPhone;
					}
					/**
					* 设置： 招聘电话
					*/
					public void setZhaopinPhone(String zhaopinPhone) {
						this.zhaopinPhone = zhaopinPhone;
					}
					/**
					* 获取： 招聘岗位
					*/
					public Integer getZhaopinTypes() {
						return zhaopinTypes;
					}
					/**
					* 设置： 招聘岗位
					*/
					public void setZhaopinTypes(Integer zhaopinTypes) {
						this.zhaopinTypes = zhaopinTypes;
					}


						/**
						* 获取： 招聘岗位的值
						*/
						public String getZhaopinValue() {
							return zhaopinValue;
						}
						/**
						* 设置： 招聘岗位的值
						*/
						public void setZhaopinValue(String zhaopinValue) {
							this.zhaopinValue = zhaopinValue;
						}
					/**
					* 获取： 招聘人数
					*/
					public Integer getZhaopinRenshuNumber() {
						return zhaopinRenshuNumber;
					}
					/**
					* 设置： 招聘人数
					*/
					public void setZhaopinRenshuNumber(Integer zhaopinRenshuNumber) {
						this.zhaopinRenshuNumber = zhaopinRenshuNumber;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 招聘信息详情
					*/
					public String getZhaopinContent() {
						return zhaopinContent;
					}
					/**
					* 设置： 招聘信息详情
					*/
					public void setZhaopinContent(String zhaopinContent) {
						this.zhaopinContent = zhaopinContent;
					}



}
