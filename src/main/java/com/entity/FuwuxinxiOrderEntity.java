package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.poi.hslf.record.CString;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 服务申请
 *
 * @author 
 * @email
 */
@TableName("fuwuxinxi_order")
public class FuwuxinxiOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FuwuxinxiOrderEntity() {

	}

	public FuwuxinxiOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;

    /**
     * 活动类型的值
     */
    //private String fuwuxinxiOrderValue;

    /**
     * 服务信息
     */
    @TableField(value = "fuwuxinxi_id")

    private Integer fuwuxinxiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 参加人数
     */
    @TableField(value = "fuwuxinxi_order_number")

    private Integer fuwuxinxiOrderNumber;

    /**
     * 活动类型
     */
    @TableField(value = "fuwuxinxi_order_types")

    private Integer fuwuxinxiOrderTypes;


    /**
     * 备注
     */
    @TableField(value = "fuwuxinxi_order_text")

    private String fuwuxinxiOrderText;


    /**
     * 申请状态
     */
    @TableField(value = "fuwuxinxi_order_yesno_types")

    private Integer fuwuxinxiOrderYesnoTypes;


    /**
     * 申请结果
     */
    @TableField(value = "fuwuxinxi_order_yesno_text")

    private String fuwuxinxiOrderYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：服务信息
	 */
    public Integer getFuwuxinxiId() {
        return fuwuxinxiId;
    }
    /**
	 * 获取：服务信息
	 */

    public void setFuwuxinxiId(Integer fuwuxinxiId) {
        this.fuwuxinxiId = fuwuxinxiId;
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
	 * 设置：参加人数
	 */
    public Integer getFuwuxinxiOrderNumber() {
        return fuwuxinxiOrderNumber;
    }
    /**
	 * 获取：参加人数
	 */

    public void setFuwuxinxiOrderNumber(Integer fuwuxinxiOrderNumber) {
        this.fuwuxinxiOrderNumber = fuwuxinxiOrderNumber;
    }

    /**
     * 设置：活动类型
     */
    public Integer getFuwuxinxiOrderTypes() {
        return fuwuxinxiOrderTypes;
    }
    /**
     * 获取：活动类型
     */

    public void setFuwuxinxiOrderTypes(Integer fuwuxinxiOrderTypes) {
        this.fuwuxinxiOrderTypes = fuwuxinxiOrderTypes;
    }

    /**
     * 设置：活动类型Text
     */
    //public String getFuwuxinxiOrderValue() {
        //return fuwuxinxiOrderValue;
    //}
    /**
     * 获取：活动类型Text
     */

    //public void setFuwuxinxiOrderValue(String fuwuxinxiOrderValue) {
        //this.fuwuxinxiOrderValue = fuwuxinxiOrderValue;
    //}


    /**
	 * 设置：备注
	 */
    public String getFuwuxinxiOrderText() {
        return fuwuxinxiOrderText;
    }
    /**
	 * 获取：备注
	 */

    public void setFuwuxinxiOrderText(String fuwuxinxiOrderText) {
        this.fuwuxinxiOrderText = fuwuxinxiOrderText;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getFuwuxinxiOrderYesnoTypes() {
        return fuwuxinxiOrderYesnoTypes;
    }
    /**
	 * 获取：申请状态
	 */

    public void setFuwuxinxiOrderYesnoTypes(Integer fuwuxinxiOrderYesnoTypes) {
        this.fuwuxinxiOrderYesnoTypes = fuwuxinxiOrderYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getFuwuxinxiOrderYesnoText() {
        return fuwuxinxiOrderYesnoText;
    }
    /**
	 * 获取：申请结果
	 */

    public void setFuwuxinxiOrderYesnoText(String fuwuxinxiOrderYesnoText) {
        this.fuwuxinxiOrderYesnoText = fuwuxinxiOrderYesnoText;
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

    @Override
    public String toString() {
        return "FuwuxinxiOrder{" +
            "id=" + id +
            ", fuwuxinxiId=" + fuwuxinxiId +
            ", yonghuId=" + yonghuId +
            ", fuwuxinxiOrderNumber=" + fuwuxinxiOrderNumber +
            ", fuwuxinxiOrderText=" + fuwuxinxiOrderText +
            ", fuwuxinxiOrderYesnoTypes=" + fuwuxinxiOrderYesnoTypes +
            ", fuwuxinxiOrderYesnoText=" + fuwuxinxiOrderYesnoText + ", fuwuxinxiOrderTypes=" + fuwuxinxiOrderTypes +

                ", createTime=" + createTime +
        "}";
    }
}
