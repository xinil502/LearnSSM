package cn.xinil.domain;

import java.io.Serializable;


public class User implements Serializable {
    private Integer id;
    private Integer uid;
    private String uname;
    private Integer uage;
    private String ugender;
    private String uaddress;
    private String uclass;

    public User() {
    }

    public User(Integer id, Integer uid, String uname, Integer uage, String ugender, String uaddress, String uclass) {
        this.id = id;
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
        this.ugender = ugender;
        this.uaddress = uaddress;
        this.uclass = uclass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public String getUclass() {
        return uclass;
    }

    public void setUclass(String uclass) {
        this.uclass = uclass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                ", ugender='" + ugender + '\'' +
                ", uaddress='" + uaddress + '\'' +
                ", uclass='" + uclass + '\'' +
                '}';
    }
}
