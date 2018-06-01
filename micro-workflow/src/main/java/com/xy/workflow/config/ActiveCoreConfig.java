package com.xy.workflow.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.netflix.discovery.converters.Auto;
import org.openwebflow.alarm.impl.MailMessageNotifier;
import org.openwebflow.alarm.impl.TaskAlarmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

/**
 * FileName: ActiveCoreConfig
 * Author: liusg
 * Date: 2018-06-01 18:44
 * Desc: 用以配置工作流引擎的基本配置信息
 */
@Configuration
//@ComponentScan(basePackages = "*")
@Component
public class ActiveCoreConfig {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String  username;

    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.druid.initialSize}")
    private Integer initialSize;
    @Value("${spring.datasource.druid.maxActive}")
    private Integer maxActive;

    @Value("${spring.datasource.druid.minIdle}")
    private Integer minIdle;
    @Value("${alarm.mail.template}")
    private Resource alarmMailTemplate;


  /*  @Autowired
    private DruidDataSource druidDataSource;
*/
 // private DruidDataSource druidDataSource;
/*    @Autowired
    private TaskAlarmServiceImpl taskAlarmService;

    @Autowired
    private MailMessageNotifier mailMessageNotifier;*/


    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    /*数据库连接池配置*/
    //@Bean(destroyMethod ="close")
    @Bean(destroyMethod = "close", initMethod = "init")
    public DruidDataSource activitiDataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setInitialSize(initialSize);
        druidDataSource.setMaxActive(maxActive);
        druidDataSource.setMinIdle(minIdle);
        return  druidDataSource;
    }

/*    @Bean
    public TaskAlarmServiceImpl myTaskAlarmService(){
        taskAlarmService.setPeriodInAdvance("P2D");
    }

    @Bean
    public MailMessageNotifier getMessageNotifier(){
        mailMessageNotifier.setSubjectTemplate("请尽快处理#{'$'}{task.name}任务");
        mailMessageNotifier.setMessageTemplateResource(alarmMailTemplate);
        mail.
    }*/
    //platformTransactionManager 为springboot默认初始化好的对象,此处暂时使用默认的事物管理器
/*    public DataSourceTransactionManager setTransactionManager(){
        dataSourceTransactionManager.setDataSource(druidDataSource);
        return dataSourceTransactionManager;
    }*/




}