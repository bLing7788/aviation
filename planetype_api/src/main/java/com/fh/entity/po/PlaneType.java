package com.fh.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("a_plane")
public class PlaneType {
    @TableId(value = "id",type = IdType.AUTO)
   private Integer id ;//机型id
    @TableField("name")
   private String  name ;//机型名称
    @TableField("type")
   private Integer type; //机型类型(比如1代表大型，2代表中型，3代表小型)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
