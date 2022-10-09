package com.cg.boot.mapper;

import com.cg.boot.pojo.classUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface classUserMapper {
    //查询全部班级学生信息
    List<classUser> getAllUser();
    //根据Id查询学生信息
//    List<classUser> getIdUser(@Param("classId") Integer classId);
    classUser getIdUser(@Param("classId") Integer classId);

    //修改学生信息
//    错误代码
//    int classUpdate(@Param("classId") Integer classId);
    int classUpdate(classUser classUser);
    //添加学生信息
    int classInsert(classUser classUser);

    //删除学生信息
    int classDelete(@Param("classId") Integer classId);



}
