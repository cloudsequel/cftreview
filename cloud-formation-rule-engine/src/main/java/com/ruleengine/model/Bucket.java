package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class
Bucket {

    @JsonProperty(value = "Ref")
    private String ref;

    public Bucket(String ref) {
        this.ref = ref;
    }

    public Bucket() {
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
