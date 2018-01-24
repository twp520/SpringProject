package com.twp.springproject.entity;

import java.io.Serializable;

public class CostEntity implements Serializable {

    private Integer id; //主键
    private String name; // 资费名称
    private Double base_duration; // 基本时长
    private Double base_cost; //基本费用
    private Double unit_cost; //单位费用
    private String status; //状态
    private String descr; //描述
    private String creatime; //创建时间
    private String startime; //开始时间
    private String cost_type; //资费类别

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

    public Double getBase_duration() {
        return base_duration;
    }

    public void setBase_duration(Double base_duration) {
        this.base_duration = base_duration;
    }

    public Double getBase_cost() {
        return base_cost;
    }

    public void setBase_cost(Double base_cost) {
        this.base_cost = base_cost;
    }

    public Double getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(Double unit_cost) {
        this.unit_cost = unit_cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getCreatime() {
        return creatime;
    }

    public void setCreatime(String creatime) {
        this.creatime = creatime;
    }

    public String getStartime() {
        return startime;
    }

    public void setStartime(String startime) {
        this.startime = startime;
    }

    public String getCost_type() {
        return cost_type;
    }

    public void setCost_type(String cost_type) {
        this.cost_type = cost_type;
    }

    @Override
    public String toString() {
        return "CostEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", base_duration=" + base_duration +
                ", base_cost=" + base_cost +
                ", unit_cost=" + unit_cost +
                ", status='" + status + '\'' +
                ", descr='" + descr + '\'' +
                ", creatime='" + creatime + '\'' +
                ", startime='" + startime + '\'' +
                ", cost_type='" + cost_type + '\'' +
                '}';
    }
}
