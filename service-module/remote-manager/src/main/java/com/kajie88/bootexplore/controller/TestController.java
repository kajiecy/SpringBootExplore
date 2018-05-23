package com.kajie88.bootexplore.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("showParam")
    public String testInter(){
        return "Hello Spring Boot12346";
    }
}
