package com.qfedu;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableHasor()
@EnableHasorWeb()
@SpringBootApplication(scanBasePackages = {"com.qfedu"})
public class DatawayDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatawayDemoApplication.class, args);
    }

}
