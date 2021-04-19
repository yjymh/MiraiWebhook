package com.yjymh.miraiwebhook.utils;

import com.alibaba.fastjson.JSON;
import com.yjymh.miraiwebhook.entity.Response;

import java.util.HashMap;

public class ResponseUtil {

    // 设置返回数据
    public static String setResponse(Response resp) {
        return JSON.toJSONString(new HashMap<Integer, String>() {{
            put(resp.getCode(), resp.getDesc());
        }});
    }

}
