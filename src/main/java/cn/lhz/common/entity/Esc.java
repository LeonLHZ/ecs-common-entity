package cn.lhz.common.entity;

public class Esc extends BaseEntity{
    private static final long serialVersionUID = -863530744135205551L;
    private String escId;

    private String escPublicIp;

    private String escName;

    private String escAlias;

    private String escUsername;

    private String escPassword;

    private String escPort;

    private String escManufactor;

    private String escCreateTime;

    private String userId;

    public String getEscId() {
        return escId;
    }

    public void setEscId(String escId) {
        this.escId = escId == null ? null : escId.trim();
    }

    public String getEscPublicIp() {
        return escPublicIp;
    }

    public void setEscPublicIp(String escPublicIp) {
        this.escPublicIp = escPublicIp == null ? null : escPublicIp.trim();
    }

    public String getEscName() {
        return escName;
    }

    public void setEscName(String escName) {
        this.escName = escName == null ? null : escName.trim();
    }

    public String getEscAlias() {
        return escAlias;
    }

    public void setEscAlias(String escAlias) {
        this.escAlias = escAlias == null ? null : escAlias.trim();
    }

    public String getEscUsername() {
        return escUsername;
    }

    public void setEscUsername(String escUsername) {
        this.escUsername = escUsername == null ? null : escUsername.trim();
    }

    public String getEscPassword() {
        return escPassword;
    }

    public void setEscPassword(String escPassword) {
        this.escPassword = escPassword == null ? null : escPassword.trim();
    }

    public String getEscPort() {
        return escPort;
    }

    public void setEscPort(String escPort) {
        this.escPort = escPort == null ? null : escPort.trim();
    }

    public String getEscManufactor() {
        return escManufactor;
    }

    public void setEscManufactor(String escManufactor) {
        this.escManufactor = escManufactor == null ? null : escManufactor.trim();
    }

    public String getEscCreateTime() {
        return escCreateTime;
    }

    public void setEscCreateTime(String escCreateTime) {
        this.escCreateTime = escCreateTime == null ? null : escCreateTime.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    @Override
    public String toString()
    {
        return "Esc{" +
                "escId='" + escId + '\'' +
                ", escPublicIp='" + escPublicIp + '\'' +
                ", escName='" + escName + '\'' +
                ", escAlias='" + escAlias + '\'' +
                ", escUsername='" + escUsername + '\'' +
                ", escPassword='" + escPassword + '\'' +
                ", escPort='" + escPort + '\'' +
                ", escManufactor='" + escManufactor + '\'' +
                ", escCreateTime='" + escCreateTime + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}