package com.bk.safetyBK.module.resourceManage.controller.VO;

import com.bk.safetyBK.base.BaseVO;

import java.util.List;

public class BatchVO extends BaseVO{
    private List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}
