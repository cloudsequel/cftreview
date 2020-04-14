package com.ruleengine.model;

import java.util.List;

public class Action {
    private List<String> string;

    public Action() {
    }

    public Action(List<String> string) {
        this.string = string;
    }

    public List<String> getString() {
        return string;
    }

    public void setString(List<String> string) {
        this.string = string;
    }
}
