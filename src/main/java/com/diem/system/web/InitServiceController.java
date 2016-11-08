package com.diem.system.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 初始化
 * Created by wangRenJun on 2016-11-07
 */
@Controller
public class InitServiceController {
    @RequestMapping("/init.htm")
    public void init(HttpServletRequest request , HttpServletResponse response){
        try {
            PrintWriter writer = response.getWriter();
            writer.print("this is a good idea");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
