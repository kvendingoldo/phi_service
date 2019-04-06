package com.phi.service.model;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;
    private String meta; // encrypted

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }
}
