package com.ruleengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class S3BucketPolicy {
    private List<String> errorMessages;
    public S3BucketPolicy() {
    }

    public List<String> getErrorMessages() {
        if (null==errorMessages){
            System.out.println("888888888888");
            return new ArrayList<String>();
        }
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        System.out.println("errorMessages=================");
        System.out.println(errorMessages);
        this.errorMessages = errorMessages;
    }

    public S3BucketPolicy(List<String> errorMessages, String type, Properties properties) {
        this.errorMessages = errorMessages;
        this.type = type;
        this.properties = properties;
    }

    @JsonProperty(value = "Type")
    private String type;
    @JsonProperty(value = "Properties")
    private Properties properties;

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
