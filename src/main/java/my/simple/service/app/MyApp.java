package my.simple.service.app;

import my.simple.service.config.MyWebServiceConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({MyWebServiceConfig.class})
public class MyApp {

    public static void main(String args[]) {
        ApplicationContext context = SpringApplication.run(MyApp.class, args);
        System.out.println("My countries web service has started");
    }
}
