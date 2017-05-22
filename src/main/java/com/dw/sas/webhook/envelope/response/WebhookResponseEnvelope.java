package com.dw.sas.webhook.envelope.response;

import java.util.Map;

/**
 * This POJO class maps the JSON format of api.ai response.
 */
public class WebhookResponseEnvelope {

    private String speech;

    private String displayText;

    private String source;

    private Map<String, String> data;

    private ContextOut contextOut;

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ContextOut getContextOut() {
        return contextOut;
    }

    public void setContextOut(ContextOut contextOut) {
        this.contextOut = contextOut;
    }

    @Override
    public String toString() {
        return "WebhookResponseEnvelope{" +
                "speech='" + speech + '\'' +
                ", displayText='" + displayText + '\'' +
                ", source='" + source + '\'' +
                ", contextOut=" + contextOut +
                '}';
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
