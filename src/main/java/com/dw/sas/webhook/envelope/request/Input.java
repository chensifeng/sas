package com.dw.sas.webhook.envelope.request;

import java.util.List;

/**
 * This POJO class maps the JSON property "input" of api.ai request.
 */
public class Input {

    private List<RawInput> raw_inputs;

    private String intent;

    private List<Argument> arguments;

    public List<RawInput> getRaw_inputs() {
        return raw_inputs;
    }

    public void setRaw_inputs(List<RawInput> raw_inputs) {
        this.raw_inputs = raw_inputs;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public List<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(List<Argument> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "Input{" +
                "raw_inputs=" + raw_inputs +
                ", intent='" + intent + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
