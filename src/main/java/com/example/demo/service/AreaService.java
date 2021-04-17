package com.example.demo.service;

import com.example.demo.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> getAreaList();
    Area getAreaById(int areaId);
    boolean addArea(Area area); //增加区域信息
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);

}
