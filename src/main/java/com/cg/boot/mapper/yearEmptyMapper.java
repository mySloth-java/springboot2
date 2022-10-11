package com.cg.boot.mapper;

import com.cg.boot.pojo.yearEmpty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface yearEmptyMapper {
    //查询全部年级信息
    List<yearEmpty> getAllYear();
    //根据年级Id查询年级信息
    yearEmpty getIdYear(@Param("yearId") Integer yearId);

    //修改年级信息
    int yearUpdate(yearEmpty yearEmpty);

    //添加年级信息
    int yearInsert(yearEmpty yearEmpty);
}
