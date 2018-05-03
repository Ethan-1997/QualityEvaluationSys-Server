package com.qualityevaluationsys.demo.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class StudentGrade implements Serializable {
    private Integer id;

    private Integer sstatus;

    private String sid;

    private String scharacter;

    private String professional;

    private String thinking;

    private String midtest;

    private String lasttest1;

    private String lasttest2;

    private String lasttest3;

    private String lasttest4;

    private String lasttest5;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSstatus() {
        return sstatus;
    }

    public void setSstatus(Integer sstatus) {
        this.sstatus = sstatus;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getScharacter() {
        return scharacter;
    }

    public void setScharacter(String scharacter) {
        this.scharacter = scharacter;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getThinking() {
        return thinking;
    }

    public void setThinking(String thinking) {
        this.thinking = thinking;
    }

    public String getMidtest() {
        return midtest;
    }

    public void setMidtest(String midtest) {
        this.midtest = midtest;
    }

    public String getLasttest1() {
        return lasttest1;
    }

    public void setLasttest1(String lasttest1) {
        this.lasttest1 = lasttest1;
    }

    public String getLasttest2() {
        return lasttest2;
    }

    public void setLasttest2(String lasttest2) {
        this.lasttest2 = lasttest2;
    }

    public String getLasttest3() {
        return lasttest3;
    }

    public void setLasttest3(String lasttest3) {
        this.lasttest3 = lasttest3;
    }

    public String getLasttest4() {
        return lasttest4;
    }

    public void setLasttest4(String lasttest4) {
        this.lasttest4 = lasttest4;
    }

    public String getLasttest5() {
        return lasttest5;
    }

    public void setLasttest5(String lasttest5) {
        this.lasttest5 = lasttest5;
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
        StudentGrade other = (StudentGrade) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSstatus() == null ? other.getSstatus() == null : this.getSstatus().equals(other.getSstatus()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getScharacter() == null ? other.getScharacter() == null : this.getScharacter().equals(other.getScharacter()))
            && (this.getProfessional() == null ? other.getProfessional() == null : this.getProfessional().equals(other.getProfessional()))
            && (this.getThinking() == null ? other.getThinking() == null : this.getThinking().equals(other.getThinking()))
            && (this.getMidtest() == null ? other.getMidtest() == null : this.getMidtest().equals(other.getMidtest()))
            && (this.getLasttest1() == null ? other.getLasttest1() == null : this.getLasttest1().equals(other.getLasttest1()))
            && (this.getLasttest2() == null ? other.getLasttest2() == null : this.getLasttest2().equals(other.getLasttest2()))
            && (this.getLasttest3() == null ? other.getLasttest3() == null : this.getLasttest3().equals(other.getLasttest3()))
            && (this.getLasttest4() == null ? other.getLasttest4() == null : this.getLasttest4().equals(other.getLasttest4()))
            && (this.getLasttest5() == null ? other.getLasttest5() == null : this.getLasttest5().equals(other.getLasttest5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSstatus() == null) ? 0 : getSstatus().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getScharacter() == null) ? 0 : getScharacter().hashCode());
        result = prime * result + ((getProfessional() == null) ? 0 : getProfessional().hashCode());
        result = prime * result + ((getThinking() == null) ? 0 : getThinking().hashCode());
        result = prime * result + ((getMidtest() == null) ? 0 : getMidtest().hashCode());
        result = prime * result + ((getLasttest1() == null) ? 0 : getLasttest1().hashCode());
        result = prime * result + ((getLasttest2() == null) ? 0 : getLasttest2().hashCode());
        result = prime * result + ((getLasttest3() == null) ? 0 : getLasttest3().hashCode());
        result = prime * result + ((getLasttest4() == null) ? 0 : getLasttest4().hashCode());
        result = prime * result + ((getLasttest5() == null) ? 0 : getLasttest5().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sstatus=").append(sstatus);
        sb.append(", sid=").append(sid);
        sb.append(", scharacter=").append(scharacter);
        sb.append(", professional=").append(professional);
        sb.append(", thinking=").append(thinking);
        sb.append(", midtest=").append(midtest);
        sb.append(", lasttest1=").append(lasttest1);
        sb.append(", lasttest2=").append(lasttest2);
        sb.append(", lasttest3=").append(lasttest3);
        sb.append(", lasttest4=").append(lasttest4);
        sb.append(", lasttest5=").append(lasttest5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}