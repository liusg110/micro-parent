package com.xy.client1.controller;

import com.xy.client1.doman.po.ScheduleJobPo;
import org.quartz.CronTrigger;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;

/**
 * @Title: TestController
 * @Description: TODO
 * @author liusg
 * @date 2018/5/8 15:21
 * @version V1.0
 */
@RestController
public class TestController {
    @Autowired
    private Scheduler scheduler;



/*    *//**
     * 项目启动时，初始化定时器
     *//*
    @PostConstruct
    public void init(){
        List<ScheduleJobPo> scheduleJobList = schedulerJobDao.queryList(new HashMap<>());
        for(ScheduleJobPo scheduleJob : scheduleJobList){
            CronTrigger cronTrigger = ScheduleUtils.getCronTrigger(scheduler, scheduleJob.getJobId());
            //如果不存在，则创建
            if(cronTrigger == null) {
                ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
            }else {
                ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
            }
        }
    }*/


    @RequestMapping(value = "api/{test}/{1}")
    public String test1(@PathVariable(value = "test")String test,@PathVariable(value = "1")String param){
        System.out.println("---------port------------8762");




        return "---------port------------8762---";
    }
}
