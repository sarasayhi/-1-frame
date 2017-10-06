package com.bk.safetyBK.module.resourceManage.repository;

import com.bk.safetyBK.module.resourceManage.repository.DO.DeviceDO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wenjiahui
 * @Description:
 * @Date: 0:45 2017/10/4
 */

@Repository
public interface DeviceRepository extends PagingAndSortingRepository<DeviceDO, Long> {

    @Modifying
    @Query("update Device d set d.deleted = true where d.id in :ids")
    void deleteDeviceBatch(@Param("ids") List<Long> ids);

    @Query(value = "select d from Device d where d.deleted = false and d.areaId = :areaId")
    List<DeviceDO> getDeviceByAreaIdAndPage(@Param("areaId") Long areaId, Pageable pageable);

    @Query(value = "select d from Device d where d.deleted = false and d.name like %:name% or d.IPAddress like %:name%")
    List<DeviceDO> getDeviceByNameAndPage(@Param("name") String name, Pageable pageable);
}