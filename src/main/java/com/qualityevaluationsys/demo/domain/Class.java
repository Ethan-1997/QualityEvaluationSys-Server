package com.qualityevaluationsys.demo.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class Class implements Serializable {
    private Integer cid;

    /**
     * 班级名称
     */
    private String cname;

    /**
     * 班级专业
     */
    private String profession;

    /**
     * 班主任
     */
    private String headTeacher;

    private Integer headTeacherId;

    /**
     * 学长
     */
    private String schoolYear;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(String headTeacher) {
        this.headTeacher = headTeacher;
    }

    public Integer getHeadTeacherId() {
        return headTeacherId;
    }

    public void setHeadTeacherId(Integer headTeacherId) {
        this.headTeacherId = headTeacherId;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
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
        Class other = (Class) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getProfession() == null ? other.getProfession() == null : this.getProfession().equals(other.getProfession()))
            && (this.getHeadTeacher() == null ? other.getHeadTeacher() == null : this.getHeadTeacher().equals(other.getHeadTeacher()))
            && (this.getHeadTeacherId() == null ? other.getHeadTeacherId() == null : this.getHeadTeacherId().equals(other.getHeadTeacherId()))
            && (this.getSchoolYear() == null ? other.getSchoolYear() == null : this.getSchoolYear().equals(other.getSchoolYear()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getProfession() == null) ? 0 : getProfession().hashCode());
        result = prime * result + ((getHeadTeacher() == null) ? 0 : getHeadTeacher().hashCode());
        result = prime * result + ((getHeadTeacherId() == null) ? 0 : getHeadTeacherId().hashCode());
        result = prime * result + ((getSchoolYear() == null) ? 0 : getSchoolYear().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", cname=").append(cname);
        sb.append(", profession=").append(profession);
        sb.append(", headTeacher=").append(headTeacher);
        sb.append(", headTeacherId=").append(headTeacherId);
        sb.append(", schoolYear=").append(schoolYear);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}