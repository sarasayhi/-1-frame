package com.bk.safetyBK.module.resourceManage.controller.VO;

import com.bk.safetyBK.base.BaseVO;
import com.bk.safetyBK.module.resourceManage.repository.DO.DeviceDO;

public class PointVO extends BaseVO {
    private DeviceDO deviceDO;

    public DeviceDO getDeviceDO() {
        return deviceDO;
    }

    public void setDeviceDO(DeviceDO deviceDO) {
        this.deviceDO = deviceDO;
    }

    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", module=").append(module);
        sb.append(", operation=").append(operation);
        sb.append(", module=").append(module);
        sb.append(", target=").append(target);
        sb.append("]");
        return sb.toString() + super.toString();
    }*/


}
