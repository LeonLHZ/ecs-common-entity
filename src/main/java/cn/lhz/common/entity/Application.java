package cn.lhz.common.entity;

public class Application {
    private String appid;

    private String appVersion;

    private String appName;

    private String appPath;

    private String appPort;

    private String appAlias;

    private String appUrl;

    private String appCreateTime;

    private String isoffical;

    private String escId;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath == null ? null : appPath.trim();
    }

    public String getAppPort() {
        return appPort;
    }

    public void setAppPort(String appPort) {
        this.appPort = appPort == null ? null : appPort.trim();
    }

    public String getAppAlias() {
        return appAlias;
    }

    public void setAppAlias(String appAlias) {
        this.appAlias = appAlias == null ? null : appAlias.trim();
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl == null ? null : appUrl.trim();
    }

    public String getAppCreateTime() {
        return appCreateTime;
    }

    public void setAppCreateTime(String appCreateTime) {
        this.appCreateTime = appCreateTime == null ? null : appCreateTime.trim();
    }

    public String getIsoffical() {
        return isoffical;
    }

    public void setIsoffical(String isoffical) {
        this.isoffical = isoffical == null ? null : isoffical.trim();
    }

    public String getEscId() {
        return escId;
    }

    public void setEscId(String escId) {
        this.escId = escId == null ? null : escId.trim();
    }
}