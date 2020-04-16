package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Condition {

    public Condition() {
    }

    public Condition(StringLike stringLike, StringEquals stringEquals) {
        this.stringLike = stringLike;
        this.stringEquals = stringEquals;
    }

    @JsonProperty(value = "StringLike")
    private StringLike stringLike;

    @JsonProperty(value = "StringEquals")
    private StringEquals stringEquals;


    public StringLike getStringLike() {
        return stringLike;
    }

    public void setStringLike(StringLike stringLike) {
        this.stringLike = stringLike;
    }

    public StringEquals getStringEquals() {
        if (null==stringEquals) return null;
        return stringEquals;
    }

    public void setStringEquals(StringEquals stringEquals) {
        this.stringEquals = stringEquals;
    }
}
