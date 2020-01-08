package com.aaa.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TestJenkinsController
 * @description:
 * @author: WangHaoHao
 * @date: Created in 2020/1/8 16:34
 * @version: V1.0
 */
@RestController
@RequestMapping("testJenkins")
public class TestJenkinsController {
    /**
     * 打印信息
     *
     * @return
     */
    @RequestMapping("print")
    public Object printInfo() {
        Map map = new HashMap();
        map.put("code", 200);
        map.put("message", "success");
        map.put("jenkins", "CI SoftWare");
        return map;
    }

}
