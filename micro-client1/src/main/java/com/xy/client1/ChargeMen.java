package com.xy.client1;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.util.Date;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
@ExcelTarget(value="学生")
public class ChargeMen implements java.io.Serializable{


    @Excel(name = "姓名", height = 20, width = 30)
    private String name;
    @Excel(name = "时间时间",exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date hah;
    @Excel(name = "开始时间", height = 20, width = 30)
    private String startTime;
    @Excel(name = "结束时间", height = 20, width = 30)
    private String endTime;
    @Excel(name = "时效", height = 20, width = 30)
    private String landTime;

    public Date getHah() {
        return hah;
    }

    public void setHah(Date hah) {
        this.hah = hah;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLandTime() {
        return landTime;
    }

    public void setLandTime(String landTime) {
        this.landTime = landTime;
    }
}
