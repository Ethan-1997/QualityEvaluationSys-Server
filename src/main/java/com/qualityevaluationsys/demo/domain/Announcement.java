package com.qualityevaluationsys.demo.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Announcement implements Serializable {
    private Integer ano;

    /**
     * 标题
     */
    private String atitle;

    /**
     * 内容
     */
    private String acontent;

    /**
     * 发布时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date atime;

    private static final long serialVersionUID = 1L;

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getAtitle() {
        return atitle;
    }

    public void setAtitle(String atitle) {
        this.atitle = atitle;
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
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
        Announcement other = (Announcement) that;
        return (this.getAno() == null ? other.getAno() == null : this.getAno().equals(other.getAno()))
            && (this.getAtitle() == null ? other.getAtitle() == null : this.getAtitle().equals(other.getAtitle()))
            && (this.getAcontent() == null ? other.getAcontent() == null : this.getAcontent().equals(other.getAcontent()))
            && (this.getAtime() == null ? other.getAtime() == null : this.getAtime().equals(other.getAtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAno() == null) ? 0 : getAno().hashCode());
        result = prime * result + ((getAtitle() == null) ? 0 : getAtitle().hashCode());
        result = prime * result + ((getAcontent() == null) ? 0 : getAcontent().hashCode());
        result = prime * result + ((getAtime() == null) ? 0 : getAtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ano=").append(ano);
        sb.append(", atitle=").append(atitle);
        sb.append(", acontent=").append(acontent);
        sb.append(", atime=").append(atime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}