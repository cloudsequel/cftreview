package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Resource {

    @JsonProperty(value = "Fn::Join")
    private Object fnJoin;

    public Resource() {
    }

    public Object getFnJoin() {
        return fnJoin;
    }

    public void setFnJoin(Object fnJoin) {
        this.fnJoin = fnJoin;
    }
}
