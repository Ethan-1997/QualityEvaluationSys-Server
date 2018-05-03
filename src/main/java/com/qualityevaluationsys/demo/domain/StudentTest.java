package com.qualityevaluationsys.demo.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class StudentTest implements Serializable {
    private Integer id;

    /**
     * 考试编号
     */
    private String tid;

    private String sid;

    /**
     * 试卷名称
     */
    private String tname;

    /**
     * 发布日期
     */
    private String tdate;

    /**
     * 试卷完成状态（T/F）
     */
    private String sstate;

    /**
     * 考试成绩
     */
    private Integer sgrade;

    private String ttype;

    private Byte display;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTdate() {
        return tdate;
    }

    public void setTdate(String tdate) {
        this.tdate = tdate;
    }

    public String getSstate() {
        return sstate;
    }

    public void setSstate(String sstate) {
        this.sstate = sstate;
    }

    public Integer getSgrade() {
        return sgrade;
    }

    public void setSgrade(Integer sgrade) {
        this.sgrade = sgrade;
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public Byte getDisplay() {
        return display;
    }

    public void setDisplay(Byte display) {
        this.display = display;
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
        StudentTest other = (StudentTest) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getTname() == null ? other.getTname() == null : this.getTname().equals(other.getTname()))
            && (this.getTdate() == null ? other.getTdate() == null : this.getTdate().equals(other.getTdate()))
            && (this.getSstate() == null ? other.getSstate() == null : this.getSstate().equals(other.getSstate()))
            && (this.getSgrade() == null ? other.getSgrade() == null : this.getSgrade().equals(other.getSgrade()))
            && (this.getTtype() == null ? other.getTtype() == null : this.getTtype().equals(other.getTtype()))
            && (this.getDisplay() == null ? other.getDisplay() == null : this.getDisplay().equals(other.getDisplay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        result = prime * result + ((getTdate() == null) ? 0 : getTdate().hashCode());
        result = prime * result + ((getSstate() == null) ? 0 : getSstate().hashCode());
        result = prime * result + ((getSgrade() == null) ? 0 : getSgrade().hashCode());
        result = prime * result + ((getTtype() == null) ? 0 : getTtype().hashCode());
        result = prime * result + ((getDisplay() == null) ? 0 : getDisplay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tid=").append(tid);
        sb.append(", sid=").append(sid);
        sb.append(", tname=").append(tname);
        sb.append(", tdate=").append(tdate);
        sb.append(", sstate=").append(sstate);
        sb.append(", sgrade=").append(sgrade);
        sb.append(", ttype=").append(ttype);
        sb.append(", display=").append(display);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}