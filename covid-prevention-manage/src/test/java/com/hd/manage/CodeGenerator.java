package com.hd.manage;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

/**
 * @author fqs
 * @Decription
 * @since 2023/1/30
 */
@SpringBootTest
public class CodeGenerator {
    @Test
    public void test2(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/covid_prevention?characterEncoding=utf-8&useSSL=true&serverTimezone=Asia/Shanghai", "root", "200628")
                .globalConfig(builder -> {
                    builder.author("hd") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("F:\\bishe\\backend\\CovidPrevention\\covid-prevention-manage\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.hd.manage") // 设置父包名
//                            .moduleName("mybatis-plus") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "F:\\bishe\\backend\\CovidPrevention\\covid-prevention-manage\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("health"); // 设置需要生成的表名
//                            .addTablePrefix("statistics_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
