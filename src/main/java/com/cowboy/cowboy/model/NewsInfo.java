package com.cowboy.cowboy.model;

import java.util.Date;

public class NewsInfo {
    private Long newsId;

    private String newsName;

    private String nFile;

    private String mFile;

    private String createBy;

    private String updateBy;

    private Date createTime;

    private Date updateTime;

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName == null ? null : newsName.trim();
    }

    public String getnFile() {
        return nFile;
    }

    public void setnFile(String nFile) {
        this.nFile = nFile == null ? null : nFile.trim();
    }

    public String getmFile() {
        return mFile;
    }

    public void setmFile(String mFile) {
        this.mFile = mFile == null ? null : mFile.trim();
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