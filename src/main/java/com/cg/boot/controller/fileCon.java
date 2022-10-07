package com.cg.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class fileCon {
    /**
     * 文件上传控制器
     * @return
     */
    @GetMapping("/upload")
    public String fileUploadCon(){
        return "file/fileUpload";
    }



}
