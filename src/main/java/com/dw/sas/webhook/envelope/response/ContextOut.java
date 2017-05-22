package com.dw.sas.webhook.envelope.response;

import java.util.Map;

/**
 * This POJO class maps the JSON property "contextOut" of api.ai response.
 */
public class ContextOut {

    private String name;

    private Integer lifespan;

    private Map<String, String> parameters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLifespan() {
        return lifespan;
    }

    public void setLifespan(Integer lifespan) {
        this.lifespan = lifespan;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "ContextOut{" +
                "name='" + name + '\'' +
                ", lifespan=" + lifespan +
                ", parameters=" + parameters +
                '}';
    }
}
