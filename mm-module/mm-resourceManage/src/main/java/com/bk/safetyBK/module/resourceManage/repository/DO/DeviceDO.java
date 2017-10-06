package com.bk.safetyBK.module.resourceManage.repository.DO;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: wenjiahui
 * @Description:
 * @Date: 0:45 2017/10/4
 */

@Entity
@Table(name = "device")
public class DeviceDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="id_generator", sequenceName="id_sequence", initialValue = 28)
    @GeneratedValue(generator = "id_generator")
    private Long id;
    @Column(name = "num",length = 64)
    private String num;
    @Column(name = "name",length = 64)
    private String name;
    @Column(name = "type",length = 64)
    private int type;
    @Column(name = "IP",length = 15)
    private String IPAddress;
    @Column(name = "port",length = 4)
    private int port;
    @Column(name = "username",length = 64)
    private String userName;
    @Column(name = "password",length = 64)
    private String password;
    @Column(name = "nchan",length = 5)
    private int nchan;
    @Column(name = "areaId",length = 64)
    private Long areaId;
    @Column(name = "deleted",length = 1)
    private int deleted;

    //    @TableGenerator(name="id",allocationSize=1)
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy=GenerationType.IDENTITY)

    public DeviceDO() {
        System.out.print("test");
    }

    public DeviceDO(String num, String name, int type, String IPAddress, int port, String userName, String password, int nchan, Long areaId, int deleted) {
        this.num = num;
        this.name = name;
        this.type = type;
        this.IPAddress = IPAddress;
        this.port = port;
        this.userName = userName;
        this.password = password;
        this.nchan = nchan;
        this.areaId = areaId;
        this.deleted = deleted;
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

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNchan() {
        return nchan;
    }

    public void setNchan(int nchan) {
        this.nchan = nchan;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", num=").append(num);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", IPAddress=").append(IPAddress);
        sb.append(", port=").append(port);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", nchan=").append(nchan);
        sb.append(", areaId=").append(areaId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }*/
}