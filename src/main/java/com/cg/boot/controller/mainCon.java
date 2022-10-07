package com.cg.boot.controller;

import com.cg.boot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;

@Controller
public class mainCon {

    /**功能1
     * 负责页面跳转
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String indexCon(){
        //调用底层数据库判断用户是否成功登录


        return "LoginIndex";
    }

    /**功能2-1
     * 登录跳转页面
     * @return
     * 此时存在的问题1：当页面刷新时会再次请求登录页面的资源
     *      防止表单重复提交，使用重定向解决
     */
    @PostMapping(value = "/login")
    public String loginSuccessCon(User user, Model model,HttpSession session){
        if(user.getLogName()!=null&&"123".equals(user.getLogPassword())){
            //保存登录的页面
            session.setAttribute("logUser",user);
            return "redirect:/index";
        }

        //设置共享域，给予登录错误提示，错误信息的提取在html页面完成
        model.addAttribute("error","账号或密码错误");
        return "LoginIndex";
    }

    /**功能2-2
     * 实际登录页面
     * @return
     */

    @GetMapping("/index")
    public String toLoginSuccessCon(HttpSession session,Model model){
        //判断是否登录
        //交给拦截器控制
//        Object logUser = session.getAttribute("logUser");
//        if(logUser!=null){
//            return "mainIndex";
//        }else {
//            model.addAttribute("error","请先登录再访问");
//            return "LoginIndex";
//        }

        //写法2：拦截器控制
        return "mainIndex";

    }



}
