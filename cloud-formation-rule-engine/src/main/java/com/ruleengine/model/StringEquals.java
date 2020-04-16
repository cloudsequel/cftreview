package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StringEquals {

    @JsonProperty(value = "aws:SourceVpc")
    private String awsSourceVpc;

    public StringEquals(String awsSourceVpc) {
        this.awsSourceVpc = awsSourceVpc;
    }

    public StringEquals() {
    }

    public String getAwsSourceVpc() {
        return awsSourceVpc;
    }

    public void setAwsSourceVpc(String awsSourceVpc) {
        this.awsSourceVpc = awsSourceVpc;
    }
}
