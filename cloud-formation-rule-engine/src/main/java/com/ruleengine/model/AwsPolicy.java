package com.ruleengine.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AwsPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String type;

    @Column(length = 4000)
    private String property;

    private String fileName;

    private Date createdAt;

    public AwsPolicy(String type, String jsonStr, String fileName, Date date) {
        this.type = type;
        this.property = jsonStr;
        this.fileName = fileName;
        this.createdAt = date;
    }

    public AwsPolicy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
