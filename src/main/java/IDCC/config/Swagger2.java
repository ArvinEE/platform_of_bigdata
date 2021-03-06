package IDCC.config;
import io.swagger.annotations.Api;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import  org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import  springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import  springfox.documentation.swagger2.annotations.EnableSwagger2;
//swagger2的配置文件，在项目的启动类的同级文件建立
//@Configuration
//@EnableSwagger2
////是否开启swagger，正式环境一般是需要关闭的.
//@ConditionalOnProperty(name = "swagger.enable",  havingValue = "true")
//public class Swagger2 {
//    // swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                // 为当前包路径
//                .apis(RequestHandlerSelectors.basePackage("IDCC.controller")).paths(PathSelectors.any())
//                .build();
//    }
//    // 构建 api文档的详细信息函数,注意这里的注解引用的是哪个
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                // 页面标题
//                .title("Swagger2测试API")
//                // 创建人信息
//                .contact(new Contact("Lai Zhouhao",  "",  "1406936162@qq.com"))
//                // 版本号
//                .version("1.0")
//                // 描述
//                .description("API 描述")
//                .build();
//    }
//}
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//                .apis(RequestHandlerSelectors.basePackage("edu.uni.example.controller"))
                // 扫描使用了@Api注解的类
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot利用swagger构建api文档")
                .contact(new Contact("Lai Zhouhao",  "",  "1406936162@qq.com"))
                .description("#")
                .termsOfServiceUrl("#")
                .version("1.0")
                .build();
    }
}