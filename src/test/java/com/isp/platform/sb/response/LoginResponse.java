package com.isp.platform.sb.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public class LoginResponse {
        private int userIntId;
        private String token;
        private String signature;
        private String userWebId;

        public LoginResponse() {
        }

        public LoginResponse(int userIntId, String token, String signature, String userWebId) {
                this.userIntId = userIntId;
                this.token = token;
                this.signature = signature;
                this.userWebId = userWebId;
        }

        public int getUserIntId() {
                return userIntId;
        }

        public void setUserIntId(int userIntId) {
                this.userIntId = userIntId;
        }

        public String getToken() {
                return token;
        }

        public void setToken(String token) {
                this.token = token;
        }

        public String getSignature() {
                return signature;
        }

        public void setSignature(String signature) {
                this.signature = signature;
        }

        public String getUserWebId() {
                return userWebId;
        }

        public void setUserWebId(String userWebId) {
                this.userWebId = userWebId;
        }
}
