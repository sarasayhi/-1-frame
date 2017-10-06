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
    private String num;
    private String name;
    private int type;
    private String IPAddress;
    private int port;
    private String userName;
    private String password;
    private int nchan;
    private Long areaId;
    private int deleted;

    //    @TableGenerator(name="id",allocationSize=1)
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy=GenerationType.IDENTITY)

    public DeviceDO() {
        System.out.print("test");
    }

    @Id
    @SequenceGenerator(name="id_generator", sequenceName="id_sequence", initialValue = 28)
    @GeneratedValue(generator = "id_generator")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "num",length = 64)
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Column(name = "name",length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "type",length = 64)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Column(name = "IP",length = 15)
    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    @Column(name = "port",length = 4)
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    @Column(name = "username",length = 64)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Column(name = "password",length = 64)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "nchan",length = 5)
    public int getNchan() {
        return nchan;
    }

    public void setNchan(int nchan) {
        this.nchan = nchan;
    }
    @Column(name = "areaId",length = 64)
    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }
    @Column(name = "deleted",length = 1)
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