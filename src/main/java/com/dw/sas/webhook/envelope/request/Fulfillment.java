package com.dw.sas.webhook.envelope.request;

import java.util.List;

/**
 * This POJO class maps the JSON format of api.ai request.
 */
public class Fulfillment {

    private List<Message> messages;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    private String speech;

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    @Override
    public String toString() {
        return "Fulfillment{" +
                "messages=" + messages +
                ", speech='" + speech + '\'' +
                '}';
    }
}