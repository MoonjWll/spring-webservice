package com.mwe.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Application {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "/app/config/springboot-webservice/real-application.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
            .properties(APPLICATION_LOCATIONS)
            .run(args);

        // 스프링부트 프로젝트가 실행될 때 프로젝트 내부 application.yml과 외부 real-application.yml 모두 불러온다.



        // SpringApplication.run(Application.class, args);
    }

}
