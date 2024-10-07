package com.example.demo;

import cn.hutool.json.JSONObject;
import cn.hutool.json.XML;
import com.ejlchina.okhttps.HTTP;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class task {
   public void doTest() {
   }

   public static void main(String[] args) {
      HTTP http = HTTP.builder().build();
      String response = http.sync("https://gtop100.com/home/report2?siteid=100813&pass=jsq2nimen&date=2022-07-02&pingusername=739355420").get().getBody().toString();
      JSONObject jsonObject = XML.toJSONObject(response);
      System.out.println(jsonObject.toString());
      JSONObject data = jsonObject.getJSONObject("data");
      System.out.println(data.get("errorcode"));
      if (data.getInt("errorcode") == 8) {
         System.out.println("无新数据");
      }

      JSONObject entry = data.getJSONObject("entries").getJSONObject("entry");
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
      Date date = null;

      try {
         date = sdf.parse(entry.getStr("time"));
         System.out.println(new Timestamp(date.getTime()));
      } catch (ParseException var9) {
         var9.printStackTrace();
      }

      System.out.println(data.getJSONObject("entries").toString());
      System.out.println(date);
   }
}
