package com.clf.validator.model;

import java.util.List;

public class PolicyDocument {
    private List<Statement> statement;

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }
}
