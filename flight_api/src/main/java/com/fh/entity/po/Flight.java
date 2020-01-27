package com.fh.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
@TableName("a_flight")
public class Flight {
    @TableId(value = "id",type = IdType.AUTO)
  private  Integer id;// 航班id
    @TableField("name")
    private  String name;// 航班名称
    @TableField("typeid")
    private Integer typeid;// 机型id
    @TableField("starttime")
    private Date starttime;// 起飞时间
    @TableField("endtime")
    private Date endtime;// 到大时间
    @TableField("starTterminalid")
    private Integer starTterminalid;// 出发机场航站楼id
    @TableField("endTerminalid")
    private Integer endTerminalid; //到大机场航站楼id

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

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getStarTterminalid() {
        return starTterminalid;
    }

    public void setStarTterminalid(Integer starTterminalid) {
        this.starTterminalid = starTterminalid;
    }

    public Integer getEndTerminalid() {
        return endTerminalid;
    }

    public void setEndTerminalid(Integer endTerminalid) {
        this.endTerminalid = endTerminalid;
    }
}
