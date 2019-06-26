package com.example.h2databasedemo.model;

import java.util.List;

public class ResponseResult {

    private Integer status;
    private String message;
    private List data;

    public ResponseResult(Integer status, String message, List data){
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public List getData(){
        return data;
    }

    public void setData(List data){
        this.data = data;
    }

}
