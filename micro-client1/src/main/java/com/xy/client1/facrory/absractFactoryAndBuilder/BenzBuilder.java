package com.xy.client1.facrory.absractFactoryAndBuilder;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public interface BenzBuilder {

    void addCarBody();

    void addWheel();

    Benz buildBenz();

}
