package com.bk.safetyBK.module.resourceManage.controller.VO;

import com.bk.safetyBK.base.BaseVO;
import com.bk.safetyBK.module.resourceManage.repository.DO.DeviceDO;
import com.bk.safetyBK.module.resourceManage.repository.DO.PointDO;

public class PointVO extends BaseVO {
    private PointDO pointDO;

    public PointDO getPointDO() {
        return pointDO;
    }

    public void setPointDO(PointDO pointDO) {
        this.pointDO = pointDO;
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
