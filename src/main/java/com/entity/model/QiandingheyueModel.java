package com.entity.model;

import com.entity.QiandingheyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 签订合约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QiandingheyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 公司
     */
    private Integer gongsiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 合同文件
     */
    private String qiandingheyueFile;


    /**
     * 有效期限
     */
    private String qiandingheyueQixian;


    /**
     * 详细条款
     */
    private String qiandingheyueText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：公司
	 */
    public Integer getGongsiId() {
        return gongsiId;
    }


    /**
	 * 设置：公司
	 */
    public void setGongsiId(Integer gongsiId) {
        this.gongsiId = gongsiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：合同文件
	 */
    public String getQiandingheyueFile() {
        return qiandingheyueFile;
    }


    /**
	 * 设置：合同文件
	 */
    public void setQiandingheyueFile(String qiandingheyueFile) {
        this.qiandingheyueFile = qiandingheyueFile;
    }
    /**
	 * 获取：有效期限
	 */
    public String getQiandingheyueQixian() {
        return qiandingheyueQixian;
    }


    /**
	 * 设置：有效期限
	 */
    public void setQiandingheyueQixian(String qiandingheyueQixian) {
        this.qiandingheyueQixian = qiandingheyueQixian;
    }
    /**
	 * 获取：详细条款
	 */
    public String getQiandingheyueText() {
        return qiandingheyueText;
    }


    /**
	 * 设置：详细条款
	 */
    public void setQiandingheyueText(String qiandingheyueText) {
        this.qiandingheyueText = qiandingheyueText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
