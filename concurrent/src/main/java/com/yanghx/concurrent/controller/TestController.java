package com.yanghx.concurrent.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.Retention;

/**
 * 测试
 *
 * @author yangHX
 * createTime  2019/5/3 22:22
 */
@Controller
@Slf4j
public class TestController {


    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "test";
    }

}
