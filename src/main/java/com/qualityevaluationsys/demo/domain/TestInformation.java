package com.qualityevaluationsys.demo.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class TestInformation implements Serializable {
    /**
     * 试卷编号
     */
    private String tid;

    private String tname;

    /**
     * 问题类型
     */
    private String ttype;

    /**
     * 问题内容
     */
    private String tcontent;

    /**
     * 问题答案
     */
    private String tanswer;

    /**
     * 学生答案
     */
    private String tuseranswer;

    /**
     * 单选多选选项
     */
    private String toption;

    /**
     * 试卷类型
     */
    private String testtype;

    /**
     * 试卷是否显示
     */
    private String display;

    private static final long serialVersionUID = 1L;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public String getTcontent() {
        return tcontent;
    }

    public void setTcontent(String tcontent) {
        this.tcontent = tcontent;
    }

    public String getTanswer() {
        return tanswer;
    }

    public void setTanswer(String tanswer) {
        this.tanswer = tanswer;
    }

    public String getTuseranswer() {
        return tuseranswer;
    }

    public void setTuseranswer(String tuseranswer) {
        this.tuseranswer = tuseranswer;
    }

    public String getToption() {
        return toption;
    }

    public void setToption(String toption) {
        this.toption = toption;
    }

    public String getTesttype() {
        return testtype;
    }

    public void setTesttype(String testtype) {
        this.testtype = testtype;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
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
        TestInformation other = (TestInformation) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getTname() == null ? other.getTname() == null : this.getTname().equals(other.getTname()))
            && (this.getTtype() == null ? other.getTtype() == null : this.getTtype().equals(other.getTtype()))
            && (this.getTcontent() == null ? other.getTcontent() == null : this.getTcontent().equals(other.getTcontent()))
            && (this.getTanswer() == null ? other.getTanswer() == null : this.getTanswer().equals(other.getTanswer()))
            && (this.getTuseranswer() == null ? other.getTuseranswer() == null : this.getTuseranswer().equals(other.getTuseranswer()))
            && (this.getToption() == null ? other.getToption() == null : this.getToption().equals(other.getToption()))
            && (this.getTesttype() == null ? other.getTesttype() == null : this.getTesttype().equals(other.getTesttype()))
            && (this.getDisplay() == null ? other.getDisplay() == null : this.getDisplay().equals(other.getDisplay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        result = prime * result + ((getTtype() == null) ? 0 : getTtype().hashCode());
        result = prime * result + ((getTcontent() == null) ? 0 : getTcontent().hashCode());
        result = prime * result + ((getTanswer() == null) ? 0 : getTanswer().hashCode());
        result = prime * result + ((getTuseranswer() == null) ? 0 : getTuseranswer().hashCode());
        result = prime * result + ((getToption() == null) ? 0 : getToption().hashCode());
        result = prime * result + ((getTesttype() == null) ? 0 : getTesttype().hashCode());
        result = prime * result + ((getDisplay() == null) ? 0 : getDisplay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", tname=").append(tname);
        sb.append(", ttype=").append(ttype);
        sb.append(", tcontent=").append(tcontent);
        sb.append(", tanswer=").append(tanswer);
        sb.append(", tuseranswer=").append(tuseranswer);
        sb.append(", toption=").append(toption);
        sb.append(", testtype=").append(testtype);
        sb.append(", display=").append(display);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}