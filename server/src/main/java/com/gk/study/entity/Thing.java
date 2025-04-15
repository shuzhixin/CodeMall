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
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

@Data
@Table(name="b_thing")
@TableName("b_thing")
public class Thing implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column(name = "id",comment = "主键")
    public Long id;
    @TableField
    @Column
    public String title;
    @TableField
    @Column
    public String cover;
    @TableField
    @Column
    public String description;
    @TableField
    @Column
    public String price;
    @TableField
    @Column
    public String status;
    @TableField
    @Column(name="create_time")
    public String createTime;
    @TableField
    @Column
    public String repertory;
    @TableField
    @Column
    public String score;
    @TableField
    @Column
    public String pv;
    @TableField
    @Column(name="recommend_count")
    public String recommendCount;
    @TableField
    @Column(name="wish_count")
    public String wishCount;
    @TableField
    @Column(name="collect_count")
    public String collectCount;
    @TableField
    @Column(name="classification_id")
    public Long classificationId;

    @TableField(exist = false)
    public List<Long> tags; // 标签

    @TableField(exist = false)
    public MultipartFile imageFile;

}
