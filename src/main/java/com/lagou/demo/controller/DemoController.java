package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouAutowired;
import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@LagouController
@LagouRequestMapping("/demo")
public class DemoController {


    @LagouAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     * @param request
     * @param response
     * @param username
     * @return
     */
    @LagouRequestMapping("/query")
    public String query(HttpServletRequest request, HttpServletResponse response,String username) {
        return demoService.get(username);
    }

    @LagouRequestMapping("/query1")
    @Security({"zhangsan"})
    public String securityRole1(HttpServletRequest request, HttpServletResponse response,String username) {
        return demoService.get(username);
    }

    @LagouRequestMapping("/query2")
    @Security({"lisi","lisi1"})
    public String securityRole2(HttpServletRequest request, HttpServletResponse response,String username) {
        return demoService.get(username);
    }
}
