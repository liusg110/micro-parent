package com.xy.client1.strategyAndSimopleFactory;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public enum StrategyEnum {

    A(1,"类型A"),
    B(2,"类型B"),
    C(3,"类型C"),
    D(4,"类型D"),
    ;

    private Integer code;
    private String msg;

    StrategyEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }}


