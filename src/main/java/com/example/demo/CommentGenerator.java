package com.example.demo;

import java.util.Properties;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

public class CommentGenerator extends DefaultCommentGenerator {
   private boolean addRemarkComments = false;
   private static final String EXAMPLE_SUFFIX = "Example";
   private static final String API_MODEL_PROPERTY_FULL_CLASS_NAME = "io.swagger.annotations.ApiModelProperty";

   public void addConfigurationProperties(Properties properties) {
      super.addConfigurationProperties(properties);
      this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
   }

   public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
      String remarks = introspectedColumn.getRemarks();
      if (this.addRemarkComments && StringUtility.stringHasValue(remarks) && remarks.contains("\"")) {
         remarks = remarks.replace("\"", "'");
      }

   }

   private void addFieldJavaDoc(Field field, String remarks) {
      field.addJavaDocLine("/**");
      String[] remarkLines = remarks.split(System.getProperty("line.separator"));
      String[] var4 = remarkLines;
      int var5 = remarkLines.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String remarkLine = var4[var6];
         field.addJavaDocLine(" * " + remarkLine);
      }

      this.addJavadocTag(field, false);
      field.addJavaDocLine(" */");
   }

   public void addJavaFileComment(CompilationUnit compilationUnit) {
      super.addJavaFileComment(compilationUnit);
      if (!compilationUnit.isJavaInterface() && !compilationUnit.getType().getFullyQualifiedName().contains("Example")) {
         compilationUnit.addImportedType(new FullyQualifiedJavaType("io.swagger.annotations.ApiModelProperty"));
      }

   }
}
