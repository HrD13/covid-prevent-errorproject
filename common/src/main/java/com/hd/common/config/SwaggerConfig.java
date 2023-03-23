package com.hd.common.config;

/**
 * @author fqs
 * @Decription
 * @since 2023/1/30
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.data.util.Predicates;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

//访问路径：http://localhost:8081/swagger-ui/index.html
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //    配置多个docket即实现多个分组，每个团队成员配置自己的docket实例即可
//    @Bean
//    public Docket docketA(){
//        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
//    }

    //    需要配置swagger的docket实例
    @Bean
    public Docket docket(Environment environment){
//        根据生产环境决定是否启动swagger
        Profiles profiles = Profiles.of("dev","test");
//          environment.acceptsProfiles(profiles); 判断是否在指定生产环境中
        Boolean flag = environment.acceptsProfiles(profiles);

        Docket docket =  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .enable(flag)   //是否启动swagger
//                start 设置指定扫描位置的请求
                /*
                扫描有指定注解的请求方法（如：GetMapping.class=》只扫描有GetMapping注解的请求）
                RequestHandlerSelectors.withMethodAnnotation（）
                扫描有指定注解的类（如：GetMapping.class=》只扫描有@RestController注解的请求）
                RequestHandlerSelectors.withClassAnnotation（）
                 */
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hd"))
//                .paths(Predicates.negate(PathSelectors.regex("/admin/.*")))
                .paths(Predicates.negate(PathSelectors.regex("/error.*")))
                .build()
//                end
                .groupName("WebApi");
        return docket;
    }

    private ApiInfo getApiInfo(){
        Contact DEFAULT_CONTACT = new Contact(
                "风起时",
                "",
                "2461211221@qq.com");
        return new ApiInfo(
                "风起时的SwaggerAPI文档",
                "没有翅膀，所有努力奔跑！",
                "1.0",
                "urn:tos",
                DEFAULT_CONTACT,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }
}
