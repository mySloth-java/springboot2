package com.cg.boot.mapper;

import com.cg.boot.pojo.banEmpty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface banEmptyMapper {
    //查询所有班级表信息
    List<banEmpty> getAllBan();

    //根据班级Id查询班级信息
    banEmpty getIdBan(@Param("banId") Integer banId);

    //修改班级表
    int banUpdate(banEmpty banEmpty);

    //添加班级表信息
    int banInsert(banEmpty banEmpty);
}
