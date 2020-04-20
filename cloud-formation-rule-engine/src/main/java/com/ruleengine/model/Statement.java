package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Statement {


    @JsonProperty(value = "Action")
    private List<String> actionn;

    @JsonProperty(value = "Effect")
    private String effect;

    @JsonProperty(value = "Resource")
    private Resource resource;


    @JsonProperty(value = "Principal")
    private String principal;

    @JsonProperty(value = "Condition")
    private Condition condition;

    public Statement() {
    }

    public Statement(List<String> actionn, String effect, Resource resource, String principal, Condition condition) {
        this.actionn = actionn;
        this.effect = effect;
        this.resource = resource;
        this.principal = principal;
        this.condition = condition;
    }

    public List<String> getActionn() {
        return actionn;
    }

    public void setActions(List<String> action) {
        this.actionn = action;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
