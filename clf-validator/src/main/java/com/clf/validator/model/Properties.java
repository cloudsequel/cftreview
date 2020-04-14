package com.clf.validator.model;

public class Properties {
    private Bucket bucket;
    private PolicyDocument policyDocument;

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
