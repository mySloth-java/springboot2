package com.cg.boot.controller;

import com.cg.boot.mapper.banEmptyMapper;
import com.cg.boot.mapper.xiEmptyMapper;
import com.cg.boot.mapper.yearEmptyMapper;
import com.cg.boot.pojo.banEmpty;
import com.cg.boot.pojo.xiEmpty;
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
    @Autowired
    private banEmptyMapper banEmptyMapper;
    @Autowired
    private xiEmptyMapper xiEmptyMapper;

    //系统一的功能跳转
    @GetMapping("/systemOne")
    public String systemCon(){
        return "work/yearTable/systemOne";
    }

    /**
     * 4个表的查询功能
     * @param model:添加共享域
     * @return
     */
    //查询所有年级表
    @GetMapping("/yearSelect")
    public String yearSelectCon(Model model){
        List<yearEmpty> allYear = yearEmptyMapper.getAllYear();
        model.addAttribute("allYear",allYear);
        return "work/yearTable/yearSelect";
    }

    //查询所有班级表，需要重写，查询包括多表联查
    @GetMapping("/banSelect")
    public String banSelectCon(Model model){
        List<banEmpty> allBan = banEmptyMapper.getAllBan();
        model.addAttribute("allBan",allBan);
        return "work/banTable/banSelect";
    }

    //查询所有系别表
    @GetMapping("/xiSelect")
    public String xiSelectCon(Model model){
        List<xiEmpty> allXi = xiEmptyMapper.getAllXi();
        model.addAttribute("allXi",allXi);
        return "work/xiTable/xiSelect";
    }

    /**
     * 添加功能
     * @return
     */

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

    //跳转到添加班级表


    //添加班级表

    //跳转到添加系别表
    @GetMapping("/xiToInsert")
    public String xiToInsertCon(){
        return "work/xiTable/xiInsert";
    }
    //添加系别表信息
    @PostMapping("/xiInsert")
    public String xiInsertCon(xiEmpty xiEmpty){
        xiEmptyMapper.xiInsert(xiEmpty);
        return "redirect:/xiSelect";
    }

    /**
     * 修改功能
     * @param yearId:年级id
     * @param model:添加共享域
     * @return
     */
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

    //跳转修改班级信息

    //修改班级信息

    //跳转修改系别表信息
    @GetMapping("/xiToUpdate/{xiId}")
    public String xiToUpdateCon(@PathVariable("xiId") Integer xiId,Model model){
        xiEmpty idXi = xiEmptyMapper.getIdXi(xiId);
        model.addAttribute("idXi",idXi);
        return "work/xiTable/xiUpdate";
    }
    //修改系别表信息
    @PostMapping("/xiUpdate")
    public String xiUpdate(xiEmpty xiEmpty){
        xiEmptyMapper.xiUpdate(xiEmpty);
        return "redirect:/xiSelect";
    }


}
