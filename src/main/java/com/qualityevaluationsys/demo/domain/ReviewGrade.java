package com.qualityevaluationsys.demo.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class ReviewGrade implements Serializable {
    private Integer id;

    /**
     * 评定类别
     */
    private String type;

    /**
     * 评价者
     */
    private Integer uno;

    /**
     * 学生编号
     */
    private String sid;

    private Integer grade1;

    private Integer grade2;

    private Integer grade3;

    private Integer grade4;

    private Integer grade5;

    private Integer grade6;

    private Integer grade7;

    private Integer grade8;

    private Integer grade9;

    private String text;

    private String submitstatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUno() {
        return uno;
    }

    public void setUno(Integer uno) {
        this.uno = uno;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Integer getGrade1() {
        return grade1;
    }

    public void setGrade1(Integer grade1) {
        this.grade1 = grade1;
    }

    public Integer getGrade2() {
        return grade2;
    }

    public void setGrade2(Integer grade2) {
        this.grade2 = grade2;
    }

    public Integer getGrade3() {
        return grade3;
    }

    public void setGrade3(Integer grade3) {
        this.grade3 = grade3;
    }

    public Integer getGrade4() {
        return grade4;
    }

    public void setGrade4(Integer grade4) {
        this.grade4 = grade4;
    }

    public Integer getGrade5() {
        return grade5;
    }

    public void setGrade5(Integer grade5) {
        this.grade5 = grade5;
    }

    public Integer getGrade6() {
        return grade6;
    }

    public void setGrade6(Integer grade6) {
        this.grade6 = grade6;
    }

    public Integer getGrade7() {
        return grade7;
    }

    public void setGrade7(Integer grade7) {
        this.grade7 = grade7;
    }

    public Integer getGrade8() {
        return grade8;
    }

    public void setGrade8(Integer grade8) {
        this.grade8 = grade8;
    }

    public Integer getGrade9() {
        return grade9;
    }

    public void setGrade9(Integer grade9) {
        this.grade9 = grade9;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubmitstatus() {
        return submitstatus;
    }

    public void setSubmitstatus(String submitstatus) {
        this.submitstatus = submitstatus;
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
        ReviewGrade other = (ReviewGrade) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUno() == null ? other.getUno() == null : this.getUno().equals(other.getUno()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getGrade1() == null ? other.getGrade1() == null : this.getGrade1().equals(other.getGrade1()))
            && (this.getGrade2() == null ? other.getGrade2() == null : this.getGrade2().equals(other.getGrade2()))
            && (this.getGrade3() == null ? other.getGrade3() == null : this.getGrade3().equals(other.getGrade3()))
            && (this.getGrade4() == null ? other.getGrade4() == null : this.getGrade4().equals(other.getGrade4()))
            && (this.getGrade5() == null ? other.getGrade5() == null : this.getGrade5().equals(other.getGrade5()))
            && (this.getGrade6() == null ? other.getGrade6() == null : this.getGrade6().equals(other.getGrade6()))
            && (this.getGrade7() == null ? other.getGrade7() == null : this.getGrade7().equals(other.getGrade7()))
            && (this.getGrade8() == null ? other.getGrade8() == null : this.getGrade8().equals(other.getGrade8()))
            && (this.getGrade9() == null ? other.getGrade9() == null : this.getGrade9().equals(other.getGrade9()))
            && (this.getText() == null ? other.getText() == null : this.getText().equals(other.getText()))
            && (this.getSubmitstatus() == null ? other.getSubmitstatus() == null : this.getSubmitstatus().equals(other.getSubmitstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUno() == null) ? 0 : getUno().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getGrade1() == null) ? 0 : getGrade1().hashCode());
        result = prime * result + ((getGrade2() == null) ? 0 : getGrade2().hashCode());
        result = prime * result + ((getGrade3() == null) ? 0 : getGrade3().hashCode());
        result = prime * result + ((getGrade4() == null) ? 0 : getGrade4().hashCode());
        result = prime * result + ((getGrade5() == null) ? 0 : getGrade5().hashCode());
        result = prime * result + ((getGrade6() == null) ? 0 : getGrade6().hashCode());
        result = prime * result + ((getGrade7() == null) ? 0 : getGrade7().hashCode());
        result = prime * result + ((getGrade8() == null) ? 0 : getGrade8().hashCode());
        result = prime * result + ((getGrade9() == null) ? 0 : getGrade9().hashCode());
        result = prime * result + ((getText() == null) ? 0 : getText().hashCode());
        result = prime * result + ((getSubmitstatus() == null) ? 0 : getSubmitstatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", uno=").append(uno);
        sb.append(", sid=").append(sid);
        sb.append(", grade1=").append(grade1);
        sb.append(", grade2=").append(grade2);
        sb.append(", grade3=").append(grade3);
        sb.append(", grade4=").append(grade4);
        sb.append(", grade5=").append(grade5);
        sb.append(", grade6=").append(grade6);
        sb.append(", grade7=").append(grade7);
        sb.append(", grade8=").append(grade8);
        sb.append(", grade9=").append(grade9);
        sb.append(", text=").append(text);
        sb.append(", submitstatus=").append(submitstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}