package com.qxglsys.formal.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonData {

    private boolean ret;

    private String msg;

    private String text;

    private String error;

    public JsonData(boolean ret){
        this.ret=ret;
    }

    public static JsonData success(String msg,String text){
        JsonData jsonData=new JsonData(true);
        jsonData.msg=msg;
        jsonData.text=text;
        return jsonData;
    }

    public static JsonData failed(String msg,String error){
        JsonData jsonData=new JsonData(false);
        jsonData.msg=msg;
        jsonData.error=error;
        return jsonData;
    }
}
