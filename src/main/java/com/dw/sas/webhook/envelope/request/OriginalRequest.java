package com.dw.sas.webhook.envelope.request;

/**
 * This POJO class maps the JSON property "originalRequest" of api.ai request.
 */
public class OriginalRequest {

    private String source;

    private Data data;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "OriginalRequest{" +
                "source='" + source + '\'' +
                ", data=" + data +
                '}';
    }
}
