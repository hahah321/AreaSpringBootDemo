package com.example.demo.dao;

import com.example.demo.entity.Area;
import java.util.List;

public interface AreaDao {
    List<Area> queryArea(); //列出区域列表
    Area queryAreaById(int areaId); //根据Id查找出具体区域
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
