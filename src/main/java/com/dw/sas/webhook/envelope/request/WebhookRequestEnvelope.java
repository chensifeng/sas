package com.dw.sas.webhook.envelope.request;

import java.util.Date;

/**
 * This POJO class maps the JSON format of api.ai request.
 */
public class WebhookRequestEnvelope {

    private String id;

    private Date timestamp;

    private String lang;

    private String sessionId;

    private Status status;

    private Result result;

    private OriginalRequest originalRequest;

    public OriginalRequest getOriginalRequest() {
        return originalRequest;
    }

    public void setOriginalRequest(OriginalRequest originalRequest) {
        this.originalRequest = originalRequest;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public class Status {

        private String errorType;

        private int code;

        public String getErrorType() {
            return errorType;
        }

        public void setErrorType(String errorType) {
            this.errorType = errorType;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return "Status{" +
                    "errorType='" + errorType + '\'' +
                    ", code=" + code +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "WebhookRequestEnvelope{" +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", lang='" + lang + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", status=" + status +
                ", result=" + result +
                ", originalRequest=" + originalRequest +
                '}';
    }
}
