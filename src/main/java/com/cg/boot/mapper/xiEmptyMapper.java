package com.cg.boot.mapper;

import com.cg.boot.pojo.xiEmpty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface xiEmptyMapper {
    //查询全部系别信息
    List<xiEmpty> getAllXi();
    //根据系别Id查询系别信息
    xiEmpty getIdXi(@Param("xiId") Integer xiId);

    //修改系别信息
    int xiUpdate(xiEmpty xiEmpty);

    //添加系别信息
    int xiInsert(xiEmpty xiEmpty);
}
