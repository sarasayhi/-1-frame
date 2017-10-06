package com.bk.safetyBK.base;

import java.util.Date;

/**
 * @Author: wenjiahui
 * @Description:
 * @Date: 4:17 2017/10/4
 */
public class BaseEntity {
    protected Date createTime;
    protected Date updateTime;
    protected int isDeleted;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
