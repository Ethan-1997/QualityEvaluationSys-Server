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
    private String atime;

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


    public String getAtime() {
        return atime;
    }

    public void setAtime(String atime) {
        this.atime = atime;
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