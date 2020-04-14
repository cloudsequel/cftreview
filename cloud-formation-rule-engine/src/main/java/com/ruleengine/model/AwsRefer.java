package com.ruleengine.model;

import java.util.List;

public class AwsRefer {

    private List<String> list;

    public AwsRefer() {
    }

    public AwsRefer(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
