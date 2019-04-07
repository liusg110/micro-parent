package com.xy.client1.doman.po;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.poi.ss.formula.functions.T;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class GosnUtil {

    private String json;

    public String toJson() {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.serializeNulls().create();
        //fixme 默认的构造方法是不系列化null的属性的
        //Gson1 gson = new Gson();
        return gson.toJson(this);
    }
    public <T> T form(Class<T> t) {
        Gson gson = new Gson();
        return gson.fromJson(json, t);
    }
}
