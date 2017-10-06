package com.bk.safetyBK.module.resourceManage.controller;

import com.alibaba.fastjson.JSON;
import com.bk.safetyBK.base.BaseResult;
import com.bk.safetyBK.constant.CodeConstant;
import com.bk.safetyBK.constant.ConstParameter;
import com.bk.safetyBK.module.resourceManage.controller.VO.BatchVO;
import com.bk.safetyBK.module.resourceManage.controller.VO.DeviceVO;
import com.bk.safetyBK.module.resourceManage.repository.DO.DeviceDO;
import com.bk.safetyBK.module.resourceManage.repository.DO.PointDO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wenjiahui
 * @Description:
 * @Date: 21:51 2017/10/3
 */
@Api
@RestController
@RequestMapping("/pointService")
public class PointController {

//        @Autowired
//        DeviceService deviceService;

    @RequestMapping(value = "/point/add",  method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<PointDO> savePoint(@RequestBody String params) {
        System.out.println(params);
        PointDO pointDO = JSON.parseObject(params, PointDO.class);
        return new BaseResult<PointDO>(ConstParameter.DEVICE_TYPE, CodeConstant.SUCCESS,"设备添加成功",null);
    }

    @RequestMapping(value = "/point/update",  method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<PointDO> updatePoint(@RequestBody String params) {
        PointDO pointDO = JSON.parseObject(params, PointDO.class);
        return new BaseResult<PointDO>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"更新设备成功",null);
    }

    @RequestMapping(value = "/point/connect/{areaId}/{option}",  method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<List<Long>> connectPointBatch(@RequestBody String params) {
        BatchVO batchVO = JSON.parseObject(params, BatchVO.class);
        System.out.println("test");
        List<Long> ids = batchVO.getIds();
        return new BaseResult<List<Long>>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"设备删除成功",ids);
    }

    @RequestMapping(value = "/point/list/{areaId}",  method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<List<PointDO>> getPointListByAreaId(@PathVariable("areaId") Long areaId) {
        System.out.println(areaId);//检查过来的是否是组织机构id
        return new BaseResult<List<PointDO>>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"通过组织机构获取设备成功",null);
    }

    @RequestMapping(value = "/device/search/{name}",  method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult<List<PointDO>> getDeviceListByName(@PathVariable("name") String name) {
        System.out.println(name);//2.检查设备信息所有字段是否为空，是否合法
        return new BaseResult<List<PointDO>>(ConstParameter.DEVICE_TYPE,CodeConstant.SUCCESS,"通过名称或ip获取设备成功",null);
    }
}