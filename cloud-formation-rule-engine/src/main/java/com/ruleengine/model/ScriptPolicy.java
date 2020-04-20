package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScriptPolicy {

    @JsonProperty(value = "Type")
    private String type;

    @JsonProperty(value = "Properties")
    private Properties properties;

    public ScriptPolicy() {
    }

    public ScriptPolicy(String type, Properties properties) {
        this.type = type;
        this.properties = properties;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
