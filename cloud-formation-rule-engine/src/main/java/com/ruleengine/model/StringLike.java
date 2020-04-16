package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StringLike {

    @JsonProperty(value = "aws:Referer")
    private List<String> awsReferer;

    @JsonProperty(value = "aws:SourceVpc")
    private String awsSourceVpc;

    public StringLike() {
    }

    public StringLike(List<String> awsReferer, String awsSourceVpc) {
        this.awsReferer = awsReferer;
        this.awsSourceVpc = awsSourceVpc;
    }

    public List<String> getAwsReferer() {
        if (null==awsReferer) return null;
        return awsReferer;
    }

    public void setAwsReferer(List<String> awsReferer) {
        this.awsReferer = awsReferer;
    }

    public String getAwsSourceVpc() {
        return awsSourceVpc;
    }

    public void setAwsSourceVpc(String awsSourceVpc) {
        this.awsSourceVpc = awsSourceVpc;
    }
}
