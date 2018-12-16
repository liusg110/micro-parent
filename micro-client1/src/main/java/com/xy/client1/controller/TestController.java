package com.xy.client1.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.xy.client1.ChargeMen;
import com.xy.client1.ExcelUtil;
import com.xy.client1.Test;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * @Title: TestController
 * @Description: TODO
 * @author liusg
 * @date 2018/5/8 15:21
 * @version V1.0
 */
@RestController
public class TestController {



    @RequestMapping(value = "api/{test}/{1}")
    public String test1(@PathVariable(value = "test")String test,@PathVariable(value = "1")String param){
        System.out.println("---------port------------8762");
        return "---------port------------8762---";
    }

    @RequestMapping(value = "excel/test2")
    public void test2(HttpServletResponse response){
        List<Test> testList=new ArrayList<>();
        for(int i=0;i<4;i++){
            Test test=new Test();
            test.setOrderNo("code"+i);
            test.setOrderName("名称"+i);
            test.setStartName("发起人"+i);
            List<ChargeMen> menList=new ArrayList<>();
            for(int j=0;j<3;j++){
                ChargeMen men=new ChargeMen();
                men.setName("负责人"+i+j);
                men.setStartTime(System.currentTimeMillis()/1000+"");
                men.setHah(new Date(System.currentTimeMillis()));
                menList.add(men);
            }
            test.setMenStr(menList);
            testList.add(test);
        }

        List<ChargeMen> menList=new ArrayList<>();
        for(int j=0;j<3;j++){
            ChargeMen men=new ChargeMen();
            men.setName("负责人h" +
                    ""+j);
            men.setStartTime(System.currentTimeMillis()/1000+"");
            menList.add(men);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("title",new ExportParams("标题","sheet1"));
        map.put("entity",ChargeMen.class);
        new ChargeMen();
        map.put("data",menList);

        Map<String,Object> map2=new HashMap<>();
        ExportParams params = new ExportParams("工单自由流时效统计", "工单自由流");
        params.setStyle(ExcelStyleUtil.class);
        map2.put("title",params);
        map2.put("entity",Test.class);
        map2.put("data",testList);
        List<Map<String,Object>> mapList=new ArrayList<>();
        mapList.add(map);
        mapList.add(map2);



/*        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("2412312", "测试secondTile", "测试"),
                Test.class, testList);*/

        Workbook workbook = ExcelExportUtil.exportExcel(mapList, ExcelType.HSSF);
        try {
            ExcelUtil.export(response, workbook, "TEST.xls");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
