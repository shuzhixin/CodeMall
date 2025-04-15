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
@Table(name="b_comment")
@TableName("b_comment")
public class Comment implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",comment = "主键")
    public Long id;
    @TableField
    @Column
    public String content;
    @TableField
    @Column(name="comment_time")
    public String commentTime;
    @TableField
    @Column(name="like_count")
    public String likeCount;
    @TableField
    @Column(name="user_id")
    public String userId;
    @TableField(exist = false)
    public String username; // 用户名
    @TableField
    @Column(name="thing_id")
    public String thingId;
    @TableField(exist = false)
    public String title; // 商品名称
    @TableField(exist = false)
    public String cover; // 商品封面

}
