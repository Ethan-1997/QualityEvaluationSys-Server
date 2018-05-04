package com.qualityevaluationsys.demo;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import org.junit.Test;

import java.util.TimeZone;

public class ZoneTest {
    @Test
    public void contextLoads() {
        System.out.println(TimeZone.getDefault());

    }

    @Test
    public void test(){
        System.out.println("=======decode=======");

        String s="[0,{data:1}]";
        Object obj=JSONValue.parse(s);
        JSONArray array=(JSONArray)obj;
        JSONObject obj2=(JSONObject)array.get(1);
        System.out.println(obj2.get("data"));

    }
}
