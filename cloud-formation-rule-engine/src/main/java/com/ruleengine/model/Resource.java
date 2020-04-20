package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resource {

    @JsonProperty(value = "Fn::Join")
    private Object fnJoin;

    public Resource() {
    //Default constructor
    }

    public Object getFnJoin() {
        return fnJoin;
    }

    public void setFnJoin(Object fnJoin) {
        this.fnJoin = fnJoin;
    }
}
