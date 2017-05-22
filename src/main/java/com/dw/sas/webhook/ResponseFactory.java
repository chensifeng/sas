package com.dw.sas.webhook;

import java.util.Map;
import com.dw.sas.webhook.envelope.request.Result;
import com.dw.sas.webhook.envelope.response.WebhookResponseEnvelope;

/**
 * This factory class creates response according to action.
 */
class ResponseFactory {

    WebhookResponseEnvelope create(Result result) {
        if (result == null) {
            throw new IllegalArgumentException("request result is empty");
        }

        switch (result.getAction()) {
            case "latestHeadlines":
                return getResponseFromLatestHeadline();
            case "latestHeadlinesFromCategory":
                return getResponseFromLatestHeadlinesFromCategory(result.getParameters());
            case "latestHeadlinesFromKeyword":
                return getResponseFromLatestHeadlinesFromKeyword(result.getParameters());
            default:
                throw new IllegalArgumentException("Unsupported action");
        }
    }

    private WebhookResponseEnvelope getResponseFromLatestHeadline() {
        WebhookResponseEnvelope response = new WebhookResponseEnvelope();
        String speech = "The latest news is about Donal Trump.";
        response.setSpeech(speech);
        response.setDisplayText("Displayed " + speech);
        response.setSource("dw-news");
        return response;
    }

    private WebhookResponseEnvelope getResponseFromLatestHeadlinesFromCategory(Map<String, String> parameters) {
        String category = parameters.get("category");
        WebhookResponseEnvelope response = new WebhookResponseEnvelope();
        String speech = "The latest news is of category " + category + " is about China";
        response.setSpeech(speech);
        response.setDisplayText("Displayed " + speech);
        response.setSource("dw-news");
        return response;
    }

    private WebhookResponseEnvelope getResponseFromLatestHeadlinesFromKeyword(Map<String, String> parameters) {
        String keyword = parameters.get("keyword");
        WebhookResponseEnvelope response = new WebhookResponseEnvelope();
        String speech = "The latest news is of keyword " + keyword + " is about politics";
        response.setSpeech(speech);
        response.setDisplayText("Displayed " + speech);
        response.setSource("dw-news");
        return response;
    }
}
