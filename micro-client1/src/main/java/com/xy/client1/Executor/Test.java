package com.xy.client1.Executor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: 使用ExecutorService、Callable、Future实现有返回结果的线程
 * <p>
 * ExecutorService、Callable、Future三个接口实际上都是属于Executor框架。返回结果的线程是在JDK1.5中引入的新特征，有了这种特征就不需要再为了得到返回值而大费周折了。而且自己实现了也可能漏洞百出。
 * <p>
 * 可返回值的任务必须实现Callable接口。类似的，无返回值的任务必须实现Runnable接口。
 * <p>
 * 执行Callable任务后，可以获取一个Future的对象，在该对象上调用get就可以获取到Callable任务返回的Object了。
 * <p>
 * 注意：get方法是阻塞的，即：线程无返回结果，get方法会一直等待。
 * <p>
 * 再结合线程池接口ExecutorService就可以实现传说中有返回结果的多线程了。
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("----程序开始运行----");
        Date date1 = new Date();
        final CountDownLatch latch = new CountDownLatch(4);


        int taskSize = 5;
 /*    Java通过Executors提供四种线程池，分别为：
        newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
        newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
        newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
        newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。*/
        //fixme 创建定长的线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        //创建有多个返回值得任务
        List<Future> futureList = new ArrayList<>();
        CyclicBarrier cyclicBarrier=new CyclicBarrier(4);
        for (int i = 0; i < taskSize; i++) {
            Callable c = new MyCallable(i + "",cyclicBarrier);
            latch.countDown();
            // 执行任务并获取Future对象
            Future f = pool.submit(c);
            futureList.add(f);
        }

        //关闭线程池
        pool.shutdown();

        // 获取所有并发任务的运行结果
        for (Future f : futureList) {
            // 从Future对象上获取任务的返回值，并输出到控制台
            try {
                System.out.println(">>>" + f.get().toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        Date date2 = new Date();
        System.out.println("----程序结束运行----，程序运行时间【"
                + (date2.getTime() - date1.getTime()) + "毫秒】");
    }

}
