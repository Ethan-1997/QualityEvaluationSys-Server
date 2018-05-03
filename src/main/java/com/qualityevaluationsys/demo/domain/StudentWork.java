package com.qualityevaluationsys.demo.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class StudentWork implements Serializable {
    /**
     * 学生作业编号
     */
    private Integer id;

    private Integer wid;

    private String sid;

    private String uptime;

    /**
     * 提交状态
     */
    private String submitstatus;

    /**
     * 作业列表
     */
    private String filelist;

    private Integer grade;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getSubmitstatus() {
        return submitstatus;
    }

    public void setSubmitstatus(String submitstatus) {
        this.submitstatus = submitstatus;
    }

    public String getFilelist() {
        return filelist;
    }

    public void setFilelist(String filelist) {
        this.filelist = filelist;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StudentWork other = (StudentWork) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWid() == null ? other.getWid() == null : this.getWid().equals(other.getWid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getUptime() == null ? other.getUptime() == null : this.getUptime().equals(other.getUptime()))
            && (this.getSubmitstatus() == null ? other.getSubmitstatus() == null : this.getSubmitstatus().equals(other.getSubmitstatus()))
            && (this.getFilelist() == null ? other.getFilelist() == null : this.getFilelist().equals(other.getFilelist()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWid() == null) ? 0 : getWid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getUptime() == null) ? 0 : getUptime().hashCode());
        result = prime * result + ((getSubmitstatus() == null) ? 0 : getSubmitstatus().hashCode());
        result = prime * result + ((getFilelist() == null) ? 0 : getFilelist().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wid=").append(wid);
        sb.append(", sid=").append(sid);
        sb.append(", uptime=").append(uptime);
        sb.append(", submitstatus=").append(submitstatus);
        sb.append(", filelist=").append(filelist);
        sb.append(", grade=").append(grade);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}