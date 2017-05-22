package com.dw.sas.webhook;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.dw.sas.webhook.envelope.request.WebhookRequestEnvelope;
import com.dw.sas.webhook.envelope.response.WebhookResponseEnvelope;

/**
 * This controller handles POST request from Api.Ai.
 */
@Controller
@RequestMapping("/webhook")
public class ApiAiIntentsHandler {

    @RequestMapping(value = "/envelope", method = RequestMethod.POST)
    public ResponseEntity<WebhookResponseEnvelope> testEnvelope(@RequestBody WebhookRequestEnvelope request) {
        ResponseFactory responseFactory = new ResponseFactory();
        return new ResponseEntity<>(responseFactory.create(request.getResult()), HttpStatus.OK);
    }

}
