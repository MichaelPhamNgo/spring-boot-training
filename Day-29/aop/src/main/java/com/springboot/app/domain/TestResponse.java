package com.springboot.app.domain;

import lombok.Data;

@Data
public class TestResponse {
    private int statusCode;
    private String msg;

    public TestResponse(int statusCode, String msg) {
        this.statusCode = statusCode;
        this.msg = msg;
    }
}
