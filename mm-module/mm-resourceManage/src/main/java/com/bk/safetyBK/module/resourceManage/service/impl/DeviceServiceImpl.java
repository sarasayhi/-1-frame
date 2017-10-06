package com.bk.safetyBK.module.resourceManage.service.impl;

import com.bk.safetyBK.module.resourceManage.repository.DO.DeviceDO;
import com.bk.safetyBK.module.resourceManage.repository.DeviceRepository;
import com.bk.safetyBK.module.resourceManage.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceRepository deviceRepository;
    
    @Override
    public void saveDevice(DeviceDO deviceDO) {
        deviceRepository.save(deviceDO);
        
    }

    @Override
    public void updateDevice(DeviceDO deviceDO) {
        deviceRepository.save(deviceDO);
    }

    @Override
    public void deleteDeviceBatch(List<Long> ids) {
        deviceRepository.deleteDeviceBatch(ids);
    }

    @Override
    public List<DeviceDO> getDeviceByName(String name, Pageable pageable) {
        return deviceRepository.getDeviceByNameAndPage(name,pageable);
    }

    @Override
    public List<DeviceDO> getDeviceByAreaId(Long areaId, Pageable pageable) {
        return deviceRepository.getDeviceByAreaIdAndPage(areaId,pageable);
    }
}
