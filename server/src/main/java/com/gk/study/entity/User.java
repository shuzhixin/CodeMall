package com.gk.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

@Data
@Table(name="b_user")
@TableName("b_user")
public class User implements Serializable {
    public static final int NormalUser = 1;
    public static final int DemoUser = 2;
    public static final int AdminUser = 3;

    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @Column(name = "id", comment = "主键")
    public Long id;

    @TableField
    @Column
    public String username;
    @TableField
    @Column
    public String password;
    @TableField(exist = false)
    public String rePassword;
    @TableField
    @Column
    public String nickname;
    @TableField
    @Column
    public String mobile;
    @TableField
    @Column
    public String email;
    @TableField
    @Column
    public String description;
    @TableField
    @Column
    public String role;
    @TableField
    @Column
    public String status;
    @TableField
    @Column
    public String score;
    @TableField
    @Column
    public String avatar;
    @TableField(exist = false)
    public MultipartFile avatarFile;
    @TableField
    @Column
    public String token;
    @TableField
    @Column(name="create_time")
    public String createTime;
    @TableField
    @Column(name="push_email")
    public String pushEmail;
    @TableField
    @Column(name="push_switch")
    public String pushSwitch;



}
