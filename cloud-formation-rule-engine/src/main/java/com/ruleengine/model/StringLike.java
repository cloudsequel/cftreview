package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StringLike {

    @JsonProperty(value = "aws:Referer")
    private List<String> awsReferer;

    public StringLike(List<String> awsReferer) {
        this.awsReferer = awsReferer;
    }

    public StringLike() {
    }

    public List<String> getAwsReferer() {
        return awsReferer;
    }

    public void setAwsReferer(List<String> awsReferer) {
        this.awsReferer = awsReferer;
    }
}
