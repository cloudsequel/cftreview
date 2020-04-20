package com.ruleengine.model;

import java.util.List;

public class ErrorMessges {

    private List<String> messages;

    public ErrorMessges(List<String> messages) {
        this.messages = messages;
    }

    public ErrorMessges() {
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
