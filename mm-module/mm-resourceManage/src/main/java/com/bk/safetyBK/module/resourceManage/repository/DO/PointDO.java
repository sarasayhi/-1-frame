package com.bk.safetyBK.module.resourceManage.repository.DO;

import java.io.Serializable;

/**
 * @Author: wenjiahui
 * @Description:
 * @Date: 0:45 2017/10/4
 */
public class PointDO implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    private String num;
    private String name;
    private int type;
    private String longitude;
    private String latitude;
    private int chan;
    private Long deviceId;
    private Long areaId;

    public PointDO(Long id, String num, String name, int type, String longitude, String latitude, int chan, Long deviceId, Long areaId) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.type = type;
        this.longitude = longitude;
        this.latitude = latitude;
        this.chan = chan;
        this.deviceId = deviceId;
        this.areaId = areaId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public int getChan() {
        return chan;
    }

    public void setChan(int chan) {
        this.chan = chan;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", num=").append(num);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", chan=").append(chan);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", areaId=").append(areaId);
//        sb.append(", createTime=").append(createTime);
//        sb.append(", updateTime=").append(updateTime);
//        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}
