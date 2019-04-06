package com.phi.service.model;

import org.springframework.data.annotation.Id;

public class Document {
    @Id
    private String id;
    private String owner;
    private String meta; // encrypted
    private String body; // encrypted

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
