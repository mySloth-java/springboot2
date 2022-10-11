package com.cg.boot.mapper;

import com.cg.boot.pojo.banEmpty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface banEmptyMapper {
    //查询所有班级表信息
    List<banEmpty> getAllban();
}
