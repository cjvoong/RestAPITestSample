package com.isp.platform.sb.request;

public class LoginRequest {

        private String sessionId;
        private String sessionSignature;
        private String installId;
        private String password;
        private String userId;

    public LoginRequest(String sessionId, String sessionSignature, String installId, String password, String userId) {
        this.sessionId = sessionId;
        this.sessionSignature = sessionSignature;
        this.installId = installId;
        this.password = password;
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionSignature() {
        return sessionSignature;
    }

    public void setSessionSignature(String sessionSignature) {
        this.sessionSignature = sessionSignature;
    }

    public String getInstallId() {
        return installId;
    }

    public void setInstallId(String installId) {
        this.installId = installId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
