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
@Table(name="b_address")
@TableName("b_address")
public class Address implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",comment = "主键")
    public Long id;
    @TableField
    @Column(name = "name")
    public String name;
    @TableField
    @Column(name = "mobile")
    public String mobile;
    @TableField
    @Column(name = "description")
    public String description;
    @TableField
    @Column(name = "def")
    public String def; // 默认
    @TableField
    @Column(name = "create_time")
    public String createTime;
    @TableField
    @Column(name = "user_id")
    public String userId;

}
