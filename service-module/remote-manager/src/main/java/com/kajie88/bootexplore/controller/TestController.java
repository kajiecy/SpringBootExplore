package com.kajie88.bootexplore.controller;

import com.kajie88.util.excel.ReadWriteExcel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author kajie
 * Date: 2018/5/18 0018
 * Time: 9:49
 */
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("showParam")
    public String testInter(){
        return "测试自动部署4";
    }
    @RequestMapping("readExcel")
    public String readExcel(){
        File f = new File("D://test.xls");
        try {
            List<List<String>> list = ReadWriteExcel.readExcel(f);
            System.out.println(list.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "测试自动部署4";
    }
}
