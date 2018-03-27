package cn.vpclub.graduation.project;

/*
* 描述：provider主函数
* 作者：王少军
* 日期：2018年03月15日
* */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;

@MapperScan("cn.vpclub.graduation.project.mapper*")
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(
                ProviderApplication.class);
        application.addListeners(
                new ApplicationPidFileWriter("app.pid"));
        application.run(args);
    }

}

