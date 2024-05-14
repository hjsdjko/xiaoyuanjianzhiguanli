package com.entity.vo;

import com.entity.QiandingheyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 签订合约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qiandingheyue")
public class QiandingheyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 公司
     */

    @TableField(value = "gongsi_id")
    private Integer gongsiId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 合同文件
     */

    @TableField(value = "qiandingheyue_file")
    private String qiandingheyueFile;


    /**
     * 有效期限
     */

    @TableField(value = "qiandingheyue_qixian")
    private String qiandingheyueQixian;


    /**
     * 详细条款
     */

    @TableField(value = "qiandingheyue_text")
    private String qiandingheyueText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：公司
	 */
    public Integer getGongsiId() {
        return gongsiId;
    }


    /**
	 * 获取：公司
	 */

    public void setGongsiId(Integer gongsiId) {
        this.gongsiId = gongsiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：合同文件
	 */
    public String getQiandingheyueFile() {
        return qiandingheyueFile;
    }


    /**
	 * 获取：合同文件
	 */

    public void setQiandingheyueFile(String qiandingheyueFile) {
        this.qiandingheyueFile = qiandingheyueFile;
    }
    /**
	 * 设置：有效期限
	 */
    public String getQiandingheyueQixian() {
        return qiandingheyueQixian;
    }


    /**
	 * 获取：有效期限
	 */

    public void setQiandingheyueQixian(String qiandingheyueQixian) {
        this.qiandingheyueQixian = qiandingheyueQixian;
    }
    /**
	 * 设置：详细条款
	 */
    public String getQiandingheyueText() {
        return qiandingheyueText;
    }


    /**
	 * 获取：详细条款
	 */

    public void setQiandingheyueText(String qiandingheyueText) {
        this.qiandingheyueText = qiandingheyueText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
