package com.bk.safetyBK.module.resourceManage.controller;

import com.alibaba.fastjson.JSON;
import com.bk.safetyBK.base.BaseResult;
import com.bk.safetyBK.constant.CodeConstant;
import com.bk.safetyBK.constant.ConstParameter;
import com.bk.safetyBK.module.resourceManage.controller.VO.BatchVO;
import com.bk.safetyBK.module.resourceManage.controller.VO.DeviceVO;
import com.bk.safetyBK.module.resourceManage.controller.VO.PointVO;
import com.bk.safetyBK.module.resourceManage.repository.DO.DeviceDO;
import com.bk.safetyBK.module.resourceManage.repository.DO.PointDO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wenjiahui
 * @Description:
 * @Date: 21:51 2017/10/3
 */
//1.	远程配置 根据设备id新增监控点信息
//2.	根据监控区域id 获取监控点信息列表
//3.	根据监控区域id和监控点ids option 批量关联或取消关联
//4.	搜索监控点信息
//5.	修改监控点信息
@Api
@RestController
@RequestMapping("/pointService")
public class PointController {

//        @Autowired
//        DeviceService deviceService;

    @RequestMapping(value = "/point/add/{deviceId}",  method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<List<PointDO>> savePoint(@PathVariable("deviceId") Long deviceId) {
        System.out.println(deviceId);
        PointDO pointDO = new PointDO(2L, "num112", "test", 1, "333L", "333L", 1, 44L, 1L);
        PointDO pointDO1 = new PointDO(1L, "num112", "test", 1, "333L", "333L", 1, 44L, 1L);
        List<PointDO> list = new ArrayList<>();
        list.add(pointDO);
        list.add(pointDO1);
        return new BaseResult<List<PointDO>>(ConstParameter.DEVICE_TYPE, CodeConstant.SUCCESS,"监控点添加成功",list);
    }

    @RequestMapping(value = "/point/list/{areaId}",  method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<List<PointDO>> getPointListByAreaId(@PathVariable("areaId") Long areaId) {
        System.out.println(areaId);//检查过来的是否是组织机构id
        PointDO pointDO = new PointDO(2L, "num112", "test", 1, "333L", "333L", 1, 44L, 1L);
        PointDO pointDO1 = new PointDO(1L, "num112", "test", 1, "333L", "333L", 1, 44L, 1L);
        List<PointDO> list = new ArrayList<>();
        list.add(pointDO);
        list.add(pointDO1);
        return new BaseResult<List<PointDO>>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"通过组织机构获取设备成功",list);
    }

    @RequestMapping(value = "/point/connect/{areaId}/{option}",  method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<List<Long>> connectPointBatch(@PathVariable("areaId")Long areaId,@PathVariable("option")int option,@RequestBody String params) {
        System.out.println(params);
        BatchVO batchVO = JSON.parseObject(params, BatchVO.class);
        List<Long> ids = batchVO.getIds();
        return new BaseResult<List<Long>>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"设备关联成功",ids);
    }

    @RequestMapping(value = "/point/search/{name}",  method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<List<PointDO>> getDeviceListByName(@PathVariable("name") String name) {
        System.out.println(name);//2.检查设备信息所有字段是否为空，是否合法
        PointDO pointDO = new PointDO(2L, "num112", "test", 1, "333L", "333L", 1, 44L, 1L);
        PointDO pointDO1 = new PointDO(1L, "num112", "test", 1, "333L", "333L", 1, 44L, 1L);
        List<PointDO> list = new ArrayList<>();
        list.add(pointDO);
        list.add(pointDO1);
        return new BaseResult<List<PointDO>>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"通过名称或ip获取设备成功",list);
    }

    @RequestMapping(value = "/point/update",  method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<PointDO> updatePoint(@RequestBody String params) {
        System.out.println(params);
        PointVO pointVO = JSON.parseObject(params, PointVO.class);
        return new BaseResult<PointDO>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"监控点信息更新成功",pointVO.getPointDO());
    }
  /*  {
        "module": "resource",
            "operation": "add",
            "target": "device",
            "pointDO":
       {
        "id": 1,
            "num": "num112",
            "name": "test",
            "type": 1,
            "longitude": "333L",
            "latitude": "333L",
            "chan": 1,
            "deviceId": 44,
            "areaId": 1
    }
    }*/
}