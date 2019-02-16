package com.xy.client1.Executor;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: 线程类，通过实现callball接口并重写call()方法实现有返回的线程类
 * @date ${date} ${time}
 * ${tags}
 */
public class MyCallable implements Callable<Object> {

    private CyclicBarrier cyclicBarrier;

    //通过有参构造注入taskNum参数
    private String taskNum;

    MyCallable(String taskNum,CyclicBarrier cyclicBarrier) {
        this.taskNum = taskNum;
        this.cyclicBarrier=cyclicBarrier;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(">>>" + taskNum + "任务启动");
        Date dateTmp1 = new Date();
        Thread.sleep(1000);
        Date dateTmp2 = new Date();
        long time = dateTmp2.getTime() - dateTmp1.getTime();
        System.out.println(">>>" + taskNum + "任务终止");
        //cyclicBarrier.await();
        return taskNum + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
    }
}
