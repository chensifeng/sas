package com.dw.sas.webhook.envelope.request;

import java.util.List;

/**
 * This POJO class maps the JSON property "data" of api.ai request.
 */
public class Data {

    private List<Input> inputs;

    public List<Input> getInputs() {
        return inputs;
    }

    public void setInputs(List<Input> inputs) {
        this.inputs = inputs;
    }

    private User user;

    private Conversation conversation;

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public class Conversation {

        private String conversation_id;

        private Integer type;

        private String conversation_token;

        public String getConversation_id() {
            return conversation_id;
        }

        public void setConversation_id(String conversation_id) {
            this.conversation_id = conversation_id;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getConversation_token() {
            return conversation_token;
        }

        public void setConversation_token(String conversation_token) {
            this.conversation_token = conversation_token;
        }

        @Override
        public String toString() {
            return "Conversation{" +
                    "conversation_id='" + conversation_id + '\'' +
                    ", type=" + type +
                    ", conversation_token='" + conversation_token + '\'' +
                    '}';
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public class User {

        private String user_id;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        @Override
        public String toString() {
            return "User{" +
                    "user_id='" + user_id + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Data{" +
                "inputs=" + inputs +
                ", user=" + user +
                ", conversation=" + conversation +
                '}';
    }
}
