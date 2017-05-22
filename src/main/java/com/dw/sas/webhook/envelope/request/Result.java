package com.dw.sas.webhook.envelope.request;

import java.util.List;
import java.util.Map;

/**
 * This POJO class maps the JSON property "result" of api.ai request.
 */
public class Result {

    private Map<String, String> parameters;

    private List<String> contexts;

    private String resolvedQuery;

    private String source;

    private String score;

    private String speech;

    private Fulfillment fulfillment;

    private boolean actionIncomplete;

    private String action;

    private Metadata metadata;

    private OriginalRequest originalRequest;

    public OriginalRequest getOriginalRequest() {
        return originalRequest;
    }

    public void setOriginalRequest(OriginalRequest originalRequest) {
        this.originalRequest = originalRequest;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public class Metadata {
        private String intentId;

        private boolean webhookForSlotFillingUsed;

        private String intentName;

        private boolean webhookUsed;

        public String getIntentId() {
            return intentId;
        }

        public void setIntentId(String intentId) {
            this.intentId = intentId;
        }

        public boolean isWebhookForSlotFillingUsed() {
            return webhookForSlotFillingUsed;
        }

        public void setWebhookForSlotFillingUsed(boolean webhookForSlotFillingUsed) {
            this.webhookForSlotFillingUsed = webhookForSlotFillingUsed;
        }

        public String getIntentName() {
            return intentName;
        }

        public void setIntentName(String intentName) {
            this.intentName = intentName;
        }

        public boolean isWebhookUsed() {
            return webhookUsed;
        }

        public void setWebhookUsed(boolean webhookUsed) {
            this.webhookUsed = webhookUsed;
        }

        @Override
        public String toString() {
            return "Metadata{" +
                    "intentId='" + intentId + '\'' +
                    ", webhookForSlotFillingUsed=" + webhookForSlotFillingUsed +
                    ", intentName='" + intentName + '\'' +
                    ", webhookUsed=" + webhookUsed +
                    '}';
        }
    }

    public List<String> getContexts() {
        return contexts;
    }

    public void setContexts(List<String> contexts) {
        this.contexts = contexts;
    }

    public String getResolvedQuery() {
        return resolvedQuery;
    }

    public void setResolvedQuery(String resolvedQuery) {
        this.resolvedQuery = resolvedQuery;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public boolean isActionIncomplete() {
        return actionIncomplete;
    }

    public void setActionIncomplete(boolean actionIncomplete) {
        this.actionIncomplete = actionIncomplete;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "Result{" +
                "parameters=" + parameters +
                ", contexts=" + contexts +
                ", resolvedQuery='" + resolvedQuery + '\'' +
                ", source='" + source + '\'' +
                ", score='" + score + '\'' +
                ", speech='" + speech + '\'' +
                ", fulfillment=" + fulfillment +
                ", actionIncomplete=" + actionIncomplete +
                ", action='" + action + '\'' +
                ", metadata=" + metadata +
                '}';
    }
}
