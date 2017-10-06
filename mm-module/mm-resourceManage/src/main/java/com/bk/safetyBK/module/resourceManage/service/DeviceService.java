package com.bk.safetyBK.module.resourceManage.service;

import com.bk.safetyBK.module.resourceManage.repository.DO.DeviceDO;

import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * @Author: wenjiahui
 * @Description:
 * @Date: 0:47 2017/10/4
 */
public interface DeviceService {

    public void saveDevice(DeviceDO deviceDO);

    public void updateDevice(DeviceDO deviceDO);

    public void deleteDeviceBatch(List<Long> ids);

    public List<DeviceDO> getDeviceByName(String name, Pageable pageable);
//    public List<DeviceDO> getDeviceByName(String name, int pageNum, int pageSize);

//    public List<DeviceDO> getDeviceByAreaId(int areaId, int pageNum, int pageSize);
    public List<DeviceDO> getDeviceByAreaId(Long areaId, Pageable pageable);


//1.	添加设备
//2.	批量删除设备
//3.	获取设备列表 分页
//4.	搜索设备列表
//5.	修改设备信息
//
}
