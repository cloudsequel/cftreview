package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Resource {

    @JsonProperty(value = "Fn::Join")
    private List<Object> fnJoin;

    public Resource() {
    }

    public Resource(List<Object> fnJoin) {
        this.fnJoin = fnJoin;
    }

    public List<Object> getFnJoin() {
        return fnJoin;
    }

    public void setFnJoin(List<Object> fnJoin) {
        this.fnJoin = fnJoin;
    }
}
