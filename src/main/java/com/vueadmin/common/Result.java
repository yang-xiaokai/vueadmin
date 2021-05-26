package com.vueadmin.common;

import lombok.Data;

import java.io.Serializable;
@Data
public class Result implements Serializable {

    //返回值 200 成功 400 异常
    private int code;
    //消息
    private String msg;

    private Object data;

    public static  Result succ(Object data){
        return succ(200,"操作成功",data);
    }

    public static  Result succ(int code,String msg,Object data){
        Result r= new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return  r;
    }
    public static  Result fai(String msg){
        return fail(400,"操作失败",null);
    }
    public static  Result fail(int code,String msg,Object data){
        Result r= new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return  r;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
