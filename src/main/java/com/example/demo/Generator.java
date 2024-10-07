package com.example.demo;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generator {
   public static void main(String[] args) throws Exception {
      List<String> warnings = new ArrayList();
      boolean overwrite = true;
      InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
      ConfigurationParser cp = new ConfigurationParser(warnings);
      Configuration config = cp.parseConfiguration(is);
      is.close();
      DefaultShellCallback callback = new DefaultShellCallback(overwrite);
      MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
      myBatisGenerator.generate((ProgressCallback)null);
      Iterator var8 = warnings.iterator();

      while(var8.hasNext()) {
         String warning = (String)var8.next();
         System.out.println(warning);
      }

   }
}
