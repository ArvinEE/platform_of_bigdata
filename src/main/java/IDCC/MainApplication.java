package IDCC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description: springboot启动类，固定形式，无需改变
 * @author: Lai Zhouhao
 * @time: 2020/10/26 20:06
 */
@SpringBootApplication
@MapperScan("IDCC.mapper")
@EnableSwagger2
public class MainApplication {
    public static void main(String args[]){
        SpringApplication.run(MainApplication.class,args);
    }
}
