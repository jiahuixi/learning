package com.learning.userRegister.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/main")
public class MainController {
	@RequestMapping("/index")
	public String index(HashMap<String, Object> map) {
        //获取配置文件中的信息vv
        //传到template模板中（会把模板中能找到的所有的ftl文件中的名称都替换掉）
        map.put("hello", "欢迎进入HTML页面");
        //返回页面hello.ftl
        return "main/index";
	}
}
