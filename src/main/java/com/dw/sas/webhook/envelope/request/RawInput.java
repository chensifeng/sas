package com.dw.sas.webhook.envelope.request;

/**
 * This POJO class maps the JSON property "raw_input" of api.ai request.
 */
public class RawInput {

    private String query;

    private Integer input_type;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getInput_type() {
        return input_type;
    }

    public void setInput_type(Integer input_type) {
        this.input_type = input_type;
    }

    @Override
    public String toString() {
        return "RawInput{" +
                "query='" + query + '\'' +
                ", input_type=" + input_type +
                '}';
    }
}