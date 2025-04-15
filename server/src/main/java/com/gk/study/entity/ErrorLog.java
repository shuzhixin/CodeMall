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
@Table(name="b_error_log")
@TableName("b_error_log")
public class ErrorLog implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",comment = "主键")
    public Long id;
    @TableField
    @Column
    public String ip;
    @TableField
    @Column
    public String url;
    @TableField
    @Column
    public String method;
    @TableField
    @Column
    public String content;
    @TableField
    @Column(name="log_time")
    public String logTime;

}
