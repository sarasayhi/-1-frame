package com.bk.safetyBK.module.resourceManage.controller;

import com.alibaba.fastjson.JSON;
import com.bk.safetyBK.base.BaseResult;
import com.bk.safetyBK.constant.CodeConstant;
import com.bk.safetyBK.constant.ConstParameter;
import com.bk.safetyBK.module.resourceManage.controller.VO.BatchVO;
import com.bk.safetyBK.module.resourceManage.controller.VO.DeviceVO;
import com.bk.safetyBK.module.resourceManage.repository.DO.DeviceDO;
import com.bk.safetyBK.module.resourceManage.repository.DeviceRepository;
import com.bk.safetyBK.module.resourceManage.service.DeviceService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wenjiahui
 * @Description:
 * @Date: 21:51 2017/10/3
 */
//1.	添加设备
//2.	批量删除设备
//3.	获取设备列表 分页
//4.	搜索设备列表
//5.	修改设备信息
@Api
@RestController
@RequestMapping("/deviceService")
public class DeviceController {

        @Autowired
        DeviceService deviceService;
    @RequestMapping(value = "/test",  method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String saveDevice1() {
        System.out.println("test");
        return "设备添加成功";
//       异常： 1.参数不合法 2.不存机构 3.保存不成功
    }

    @RequestMapping(value = "/device/add",  method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<DeviceDO> saveDevice(@RequestBody String params) {
        System.out.println(params);
        DeviceVO deviceVO = JSON.parseObject(params, DeviceVO.class);

//        //2.检查设备信息所有字段是否为空，是否合法 ip地址
//        Device device = JSON.parseObject(s, Device.class);
        //3.检查组织机构id是否合法、存在
//        4.执行保存
//        deviceService.saveDevice(device);
        return new BaseResult<DeviceDO>(ConstParameter.DEVICE_TYPE, CodeConstant.SUCCESS,"设备添加成功",deviceVO.getDeviceDO());
//       异常： 1.参数不合法 2.不存机构 3.保存不成功
    }

    @RequestMapping(value = "/device/update",  method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<DeviceDO> updateDevice(@RequestBody String params) {
        //1.json字符串转换为对象时做异常处理
        DeviceVO deviceVO = JSON.parseObject(params, DeviceVO.class);
        //2.检查设备信息所有字段是否为空，是否合法
//        DeviceDO deviceDO = deviceVO.getDeviceDO();
//        deviceService.updateDevice(device);
        //3.检查组织机构id是否合法、存在
        return new BaseResult<DeviceDO>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"更新设备成功",deviceVO.getDeviceDO());
    }

    @RequestMapping(value = "/device/delete",  method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<List<Long>> delDeviceBatch(@RequestBody String params) {
        //1.json字符串转换为对象时做异常处理
        BatchVO batchVO = JSON.parseObject(params, BatchVO.class);
        //2.检查设备信息所有字段是否为空，是否合法
        System.out.println("test");
        List<Long> ids = batchVO.getIds();
        //3.检查组织机构id是否合法、存在 + 检查设备ids是否属于同一个组织机构id
//        deviceService.delDeviceBatch(ids);
//        返回删除设备信息
        return new BaseResult<List<Long>>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"设备删除成功",ids);
    }

    @RequestMapping(value = "/device/list/{areaId}",  method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<List<DeviceDO>> getDeviceListByAreaId(@PathVariable("areaId") Long areaId) {
        //1.json字符串转换为对象时做异常处理
        System.out.println(areaId);//检查过来的是否是组织机构id
        //2.检查设备信息所有字段是否为空，是否合法
        DeviceDO deviceDO = new DeviceDO("nn", "name", 5, "10.6.134.116", 8080, "22", "pwd", 2,1L,0);
        DeviceDO deviceDO1 = new DeviceDO("nn", "name", 5, "10.6.134.116", 8080, "22", "pwd", 2,1L,0);
        List<DeviceDO> list = new ArrayList<>();
        list.add(deviceDO);
        list.add(deviceDO1);
        //3.检查组织机构id是否合法、存在
//            DeviceBO deviceBO = new DeviceBO(singleVO.getPageable(),singleVO.getData());
//        List<Device> list = deviceService.getDeviceListByAreaId(deviceBO);
        return new BaseResult<List<DeviceDO>>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"通过组织机构获取设备成功",list);
    }

    @RequestMapping(value = "/device/search/{name}",  method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<List<DeviceDO>> getDeviceListByName(@PathVariable("name") String name) {
        //1.json字符串转换为对象时做异常处理
        System.out.println(name);//2.检查设备信息所有字段是否为空，是否合法
        //3.检查组织机构id是否合法、存在
//            DeviceBO deviceBO = new DeviceBO(singleVO.getPageable(),singleVO.getData());
//        List<Device> list = deviceService.getDeviceListByName(deviceBO);
        DeviceDO deviceDO = new DeviceDO("nn", "name", 5, "10.6.134.116", 8080, "22", "pwd", 2,1L,0);
        DeviceDO deviceDO1 = new DeviceDO("nn", "name", 5, "10.6.134.116", 8080, "22", "pwd", 2,1L,0);
        List<DeviceDO> list = new ArrayList<>();
        list.add(deviceDO);
        list.add(deviceDO1);
        return new BaseResult<List<DeviceDO>>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"通过名称或ip获取设备成功",list);
    }
}