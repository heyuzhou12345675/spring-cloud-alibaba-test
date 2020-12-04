package com.zcy.entity;

import java.util.Date;

public class AppDeHistory {
    private String id;

    private String cArticleId;

    private String cUserId;

    private String cTitle;

    private String cNewHttp;

    private String cChannel;

    private String cLanguage;

    private String cMenuId;

    private String cType;

    private Date tTime;

    private String cCountry;

    private String cLinkCount;

    private String appChannelUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getcArticleId() {
        return cArticleId;
    }

    public void setcArticleId(String cArticleId) {
        this.cArticleId = cArticleId == null ? null : cArticleId.trim();
    }

    public String getcUserId() {
        return cUserId;
    }

    public void setcUserId(String cUserId) {
        this.cUserId = cUserId == null ? null : cUserId.trim();
    }

    public String getcTitle() {
        return cTitle;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle == null ? null : cTitle.trim();
    }

    public String getcNewHttp() {
        return cNewHttp;
    }

    public void setcNewHttp(String cNewHttp) {
        this.cNewHttp = cNewHttp == null ? null : cNewHttp.trim();
    }

    public String getcChannel() {
        return cChannel;
    }

    public void setcChannel(String cChannel) {
        this.cChannel = cChannel == null ? null : cChannel.trim();
    }

    public String getcLanguage() {
        return cLanguage;
    }

    public void setcLanguage(String cLanguage) {
        this.cLanguage = cLanguage == null ? null : cLanguage.trim();
    }

    public String getcMenuId() {
        return cMenuId;
    }

    public void setcMenuId(String cMenuId) {
        this.cMenuId = cMenuId == null ? null : cMenuId.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public Date gettTime() {
        return tTime;
    }

    public void settTime(Date tTime) {
        this.tTime = tTime;
    }

    public String getcCountry() {
        return cCountry;
    }

    public void setcCountry(String cCountry) {
        this.cCountry = cCountry == null ? null : cCountry.trim();
    }

    public String getcLinkCount() {
        return cLinkCount;
    }

    public void setcLinkCount(String cLinkCount) {
        this.cLinkCount = cLinkCount == null ? null : cLinkCount.trim();
    }

    public String getAppChannelUrl() {
        return appChannelUrl;
    }

    public void setAppChannelUrl(String appChannelUrl) {
        this.appChannelUrl = appChannelUrl == null ? null : appChannelUrl.trim();
    }
}