package com.gk.study.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Table(name="b_op_log")
@TableName("b_op_log")
public class OpLog implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",comment = "主键")
    public Long id;
    @TableField
    @Column(name="re_ip")
    public String reIp;
    @TableField
    @Column(name="re_time")
    public String reTime;
    @TableField
    @Column(name="re_ua")
    public String reUa;
    @TableField
    @Column(name="re_url")
    public String reUrl;
    @TableField
    @Column(name="re_method")
    public String reMethod;
    @TableField
    @Column(name="re_content")
    public String reContent;
    @TableField
    @Column(name="access_time")
    public String accessTime;

}
