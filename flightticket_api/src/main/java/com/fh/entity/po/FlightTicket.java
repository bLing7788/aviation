package com.fh.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;


@TableName("a_FlightTicket")
public class FlightTicket {
    @TableId(value = "id",type = IdType.AUTO)
   private Integer id;// 机票id
    @TableField("flightid")
    private Integer flightid; // 航班id
    @TableField("type")
   private Integer type;// 机票类型 1代表经济舱，2代表头等舱
    @TableField("totalcount")
   private Integer totalcount;// 票数
    @TableField("price")
  private BigDecimal price;// 票价


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlightid() {
        return flightid;
    }

    public void setFlightid(Integer flightid) {
        this.flightid = flightid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
