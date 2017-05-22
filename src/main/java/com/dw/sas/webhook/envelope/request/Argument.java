package com.dw.sas.webhook.envelope.request;

/**
 * This POJO class maps the JSON property "argument" of api.ai request.
 */
public class Argument {

    private String text_value;

    private String raw_text;

    private String name;

    public String getText_value() {
        return text_value;
    }

    public void setText_value(String text_value) {
        this.text_value = text_value;
    }

    public String getRaw_text() {
        return raw_text;
    }

    public void setRaw_text(String raw_text) {
        this.raw_text = raw_text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Argument{" +
                "text_value='" + text_value + '\'' +
                ", raw_text='" + raw_text + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}