package com.cowboy.cowboy.model;

import java.util.Date;

public class ClerkInfo {
    private Long clkId;

    private String name;

    private String age;

    private String hweight;

    private String face;

    private String style;

    private String slarartists;

    private String badHabits;

    private String favoriteFood;

    private String skill;

    private String nComment;

    private String introduction;

    private String nFile;

    private String tel;

    private String attendanceAddress;

    private String attendanceAtime;

    private String grade;

    private String createBy;

    private String updateBy;

    private Date createTime;

    private Date updateTime;

    public Long getClkId() {
        return clkId;
    }

    public void setClkId(Long clkId) {
        this.clkId = clkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getHweight() {
        return hweight;
    }

    public void setHweight(String hweight) {
        this.hweight = hweight == null ? null : hweight.trim();
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getSlarartists() {
        return slarartists;
    }

    public void setSlarartists(String slarartists) {
        this.slarartists = slarartists == null ? null : slarartists.trim();
    }

    public String getBadHabits() {
        return badHabits;
    }

    public void setBadHabits(String badHabits) {
        this.badHabits = badHabits == null ? null : badHabits.trim();
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood == null ? null : favoriteFood.trim();
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getnComment() {
        return nComment;
    }

    public void setnComment(String nComment) {
        this.nComment = nComment == null ? null : nComment.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getnFile() {
        return nFile;
    }

    public void setnFile(String nFile) {
        this.nFile = nFile == null ? null : nFile.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAttendanceAddress() {
        return attendanceAddress;
    }

    public void setAttendanceAddress(String attendanceAddress) {
        this.attendanceAddress = attendanceAddress == null ? null : attendanceAddress.trim();
    }

    public String getAttendanceAtime() {
        return attendanceAtime;
    }

    public void setAttendanceAtime(String attendanceAtime) {
        this.attendanceAtime = attendanceAtime == null ? null : attendanceAtime.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}