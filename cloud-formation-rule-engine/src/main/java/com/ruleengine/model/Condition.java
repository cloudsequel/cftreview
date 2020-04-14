package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Condition {
    public Condition(StringLike stringLike) {
        this.stringLike = stringLike;
    }

    public Condition() {
    }


    @JsonProperty(value = "StringLike")
    private StringLike stringLike;

    public StringLike getStringLike() {
        return stringLike;
    }

    public void setStringLike(StringLike stringLike) {
        this.stringLike = stringLike;
    }
}
