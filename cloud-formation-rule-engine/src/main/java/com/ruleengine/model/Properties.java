package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties {
    @JsonProperty(value = "Bucket")
    private Bucket bucket;
    @JsonProperty(value = "PolicyDocument")
    private PolicyDocument policyDocument;

    public Properties() {
    }

    public Properties(Bucket bucket, PolicyDocument policyDocument) {
        this.bucket = bucket;
        this.policyDocument = policyDocument;
    }

    public Bucket getBucket() {
        return bucket;
    }

    public void setBucket(Bucket bucket) {
        this.bucket = bucket;
    }

    public PolicyDocument getPolicyDocument() {
        return policyDocument;
    }

    public void setPolicyDocument(PolicyDocument policyDocument) {
        this.policyDocument = policyDocument;
    }
}
