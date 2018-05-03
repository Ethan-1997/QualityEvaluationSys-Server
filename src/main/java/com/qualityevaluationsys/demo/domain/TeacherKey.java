package com.qualityevaluationsys.demo.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class TeacherKey implements Serializable {
    private Integer tno;

    private Integer cid;

    private static final long serialVersionUID = 1L;

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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
        TeacherKey other = (TeacherKey) that;
        return (this.getTno() == null ? other.getTno() == null : this.getTno().equals(other.getTno()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTno() == null) ? 0 : getTno().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tno=").append(tno);
        sb.append(", cid=").append(cid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}