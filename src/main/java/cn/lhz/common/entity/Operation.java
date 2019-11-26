package cn.lhz.common.entity;

public class Operation {
    private String opId;

    private String opName;

    private String opDescription;

    private String opContent;

    private String opCreateTime;

    private String appId;

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId == null ? null : opId.trim();
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName == null ? null : opName.trim();
    }

    public String getOpDescription() {
        return opDescription;
    }

    public void setOpDescription(String opDescription) {
        this.opDescription = opDescription == null ? null : opDescription.trim();
    }

    public String getOpContent() {
        return opContent;
    }

    public void setOpContent(String opContent) {
        this.opContent = opContent == null ? null : opContent.trim();
    }

    public String getOpCreateTime() {
        return opCreateTime;
    }

    public void setOpCreateTime(String opCreateTime) {
        this.opCreateTime = opCreateTime == null ? null : opCreateTime.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }
}