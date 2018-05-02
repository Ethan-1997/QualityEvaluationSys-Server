package com.qualityevaluationsys.demo.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class Later implements Serializable {
    private Integer lid;

    /**
     * 请假时间
     */
    private String ltime;

    /**
     * 请假天数
     */
    private Integer lday;

    /**
     * 原因
     */
    private String lreasion;

    /**
     * 批准人
     */
    private String lapprover;

    private String sid;

    /**
     * 学生姓名
     */
    private String sname;

    /**
     * 学生班级
     */
    private String sclass;

    private static final long serialVersionUID = 1L;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public Integer getLday() {
        return lday;
    }

    public void setLday(Integer lday) {
        this.lday = lday;
    }

    public String getLreasion() {
        return lreasion;
    }

    public void setLreasion(String lreasion) {
        this.lreasion = lreasion;
    }

    public String getLapprover() {
        return lapprover;
    }

    public void setLapprover(String lapprover) {
        this.lapprover = lapprover;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
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
        Later other = (Later) that;
        return (this.getLid() == null ? other.getLid() == null : this.getLid().equals(other.getLid()))
            && (this.getLtime() == null ? other.getLtime() == null : this.getLtime().equals(other.getLtime()))
            && (this.getLday() == null ? other.getLday() == null : this.getLday().equals(other.getLday()))
            && (this.getLreasion() == null ? other.getLreasion() == null : this.getLreasion().equals(other.getLreasion()))
            && (this.getLapprover() == null ? other.getLapprover() == null : this.getLapprover().equals(other.getLapprover()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getSclass() == null ? other.getSclass() == null : this.getSclass().equals(other.getSclass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLid() == null) ? 0 : getLid().hashCode());
        result = prime * result + ((getLtime() == null) ? 0 : getLtime().hashCode());
        result = prime * result + ((getLday() == null) ? 0 : getLday().hashCode());
        result = prime * result + ((getLreasion() == null) ? 0 : getLreasion().hashCode());
        result = prime * result + ((getLapprover() == null) ? 0 : getLapprover().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getSclass() == null) ? 0 : getSclass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lid=").append(lid);
        sb.append(", ltime=").append(ltime);
        sb.append(", lday=").append(lday);
        sb.append(", lreasion=").append(lreasion);
        sb.append(", lapprover=").append(lapprover);
        sb.append(", sid=").append(sid);
        sb.append(", sname=").append(sname);
        sb.append(", sclass=").append(sclass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}