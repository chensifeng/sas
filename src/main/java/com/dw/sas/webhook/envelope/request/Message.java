package com.dw.sas.webhook.envelope.request;

/**
 * This POJO class maps the JSON format of api.ai request.
 */
public class Message {

    private String speech;

    private Integer type;

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Message{" +
                "speech='" + speech + '\'' +
                ", type=" + type +
                '}';
    }
}
