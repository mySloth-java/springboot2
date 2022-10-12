package com.cg.boot.mapper;

import com.cg.boot.pojo.zhuanEmpty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface zhuanEmptyMapper {
    //全查询所有专业信息
    List<zhuanEmpty> getAllZhuan();
    //根据Id查询专业信息
    zhuanEmpty getIdZhuan(@Param("zhuanId") Integer zhuanId);


    //添加专业信息
    int zhuanInsert(zhuanEmpty zhuanEmpty);

    //修改专业信息
    int zhuanUpdate(zhuanEmpty zhuanEmpty);


}
