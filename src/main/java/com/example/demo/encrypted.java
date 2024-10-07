package com.example.demo;

import io.xjar.XCryptos;

public class encrypted {
   public static void main(String[] args) {
      try {
         XCryptos.encryption().from("F:\\maplestoryWorldVote\\target\\demo-0.0.1-SNAPSHOT.jar").use("xiaohu123").include("/**/*.class").to("F:\\maplestoryWorldVote\\target\\encrypted.jar");
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}
