package com.gk.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.Data;

import java.io.Serializable;

@Data
@Table(name="b_order")
@TableName("b_order")
public class Order implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",comment = "主键")
    public Long id;
    @TableField
    @Column
    public String status;
    @TableField
    @Column(name="order_time")
    public String orderTime;
    @TableField
    @Column(name="pay_time")
    public String payTime;
    @TableField
    @Column(name="thing_id")
    public String thingId;
    @TableField
    @Column(name="user_id")
    public String userId;
    @TableField
    @Column
    public String count;
    @TableField
    @Column(name="order_number")
    public String orderNumber; // 订单编号
    @TableField
    @Column(name="receiver_address")
    public String receiverAddress;
    @TableField
    @Column(name="receiver_name")
    public String receiverName;
    @TableField
    @Column(name="receiver_phone")
    public String receiverPhone;
    @TableField
    @Column
    public String remark;

    @TableField(exist = false)
    public String username; // 用户名
    @TableField(exist = false)
    public String title; // 商品名称
    @TableField(exist = false)
    public String cover; // 商品封面
    @TableField(exist = false)
    public String price; // 商品价格

}
