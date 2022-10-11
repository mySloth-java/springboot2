package com.cg.boot.controller;

import com.cg.boot.mapper.yearEmptyMapper;
import com.cg.boot.pojo.yearEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class systemOneCon {
    /**
     * java高级系统一4个表的控制器
     */
    @Autowired
    private yearEmptyMapper yearEmptyMapper;

    //系统一的功能跳转
    @GetMapping("/systemOne")
    public String systemCon(){
        return "work/yearTable/systemOne";
    }

    //查询所有年级表
    @GetMapping("/yearSelect")
    public String yearSelectCon(Model model){
        List<yearEmpty> allYear = yearEmptyMapper.getAllYear();
        model.addAttribute("allYear",allYear);
        return "work/yearTable/yearSelect";
    }
    //查询所有班级表
    @GetMapping("/banSelect")
    public String banSelectCon(Model model){

        return "work/banTable/banSelect";
    }

    //跳转到添加年级信息
    @GetMapping("/yearToInsert")
    public String yearToInsertCon(){
        return "work/yearTable/yearInsert";
    }
    //添加年级信息
    @PostMapping("/yearInsert")
    public String yearInsertCon(yearEmpty yearEmpty){
        yearEmptyMapper.yearInsert(yearEmpty);
        return "redirect:/yearSelect";
    }

    //跳转修改年级信息
    @GetMapping("/yearToUpdate/{yearId}")
    public String yearToUpdateCon(@PathVariable("yearId") Integer yearId,Model model){
        yearEmpty idYear = yearEmptyMapper.getIdYear(yearId);
        model.addAttribute("idYear",idYear);
        return "work/yearTable/yearUpdate";
    }
    //修改年级信息
    @PostMapping("/yearUpdate")
    public String yearUpdateCon(yearEmpty yearEmpty){
        yearEmptyMapper.yearUpdate(yearEmpty);
        return "redirect:/yearSelect";
    }


}
