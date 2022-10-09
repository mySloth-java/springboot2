package com.cg.boot.controller;

import com.cg.boot.mapper.classUserMapper;
import com.cg.boot.pojo.classUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class userCon {
    @Autowired
    private classUserMapper classUserMapper;
    //班级学生的增删改查跳转
    @GetMapping("/classCRUD")
    public String classCRUDCon(){
        return "work/classCRUD";
    }

    //查询所有学生表
    @GetMapping("/classSelect")
    public String classSelectCon( Model model){
        List<classUser> allUser = classUserMapper.getAllUser();
        model.addAttribute("allUser",allUser);
        return "work/classSelect";
    }

    //跳转添加学生表
    @GetMapping("/classToInsert")
    public String classToInsertCon(){
        return "work/classInsert";
    }
    //添加学生
    @PostMapping("/classInsert")
    public String classInsertCon(classUser classUser){
        classUserMapper.classInsert(classUser);
        return "redirect:/classSelect";
    }

    //跳转修改学生表
    @GetMapping("/classToUpdate/{classId}")
    public String classToUpdateCon(@PathVariable("classId") Integer classId,Model model){
//        List<classUser> idUser = classUserMapper.getIdUser(classId);
        classUser idUser = classUserMapper.getIdUser(classId);
        model.addAttribute("idUser",idUser);
        return "work/classUpdate";
    }
    //修改学生表
    @PostMapping("/classUpdate")
    public String classUpdateCon(classUser classUser){
        classUserMapper.classUpdate(classUser);
        return "redirect:/classSelect";
    }

    //删除学生信息
    @GetMapping("/classDelete/{classId}")
    public String classDeleteCon(@PathVariable("classId") Integer classId){
        classUserMapper.classDelete(classId);
        return "redirect:/classSelect";
    }


}
