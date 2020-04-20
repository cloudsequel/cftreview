package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PolicyDocument {

    @JsonProperty(value = "Statement")
    private List<Statement> statement;

    public PolicyDocument() {
    }

    public PolicyDocument(List<Statement> statement) {
        this.statement = statement;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }
}
