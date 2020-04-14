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
    private Date createdAt;

    public AwsPolicy() {
    }

    public AwsPolicy(String type, String property, Date date) {
        this.property = property;
        this.type = type;
        this.createdAt = date;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
