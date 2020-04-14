package com.ruleengine.model;

import java.util.List;

public class ErrorMessges {
    public ErrorMessges(List<String> messages) {
        this.messages = messages;
    }

    public ErrorMessges() {
    }

    private List<String> messages;

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
