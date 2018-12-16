package com.xy.client1;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.util.List;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
@ExcelTarget("OrderEntity")
public class Test implements java.io.Serializable{
    @Excel(name = "工单编码",needMerge = true,imageType = 2,mergeVertical=true)
    private String orderNo;
    @Excel(name="工单名称",needMerge = true)
    private String orderName;

    @Excel(name = "发起人",needMerge = true)
    private String startName;
    @ExcelCollection(name = "处理人")
    private List<ChargeMen> menStr;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getStartName() {
        return startName;
    }

    public void setStartName(String startName) {
        this.startName = startName;
    }

    public List<ChargeMen> getMenStr() {
        return menStr;
    }

    public void setMenStr(List<ChargeMen> menStr) {
        this.menStr = menStr;
    }
}
