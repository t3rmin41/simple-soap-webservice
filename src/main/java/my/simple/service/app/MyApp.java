package my.simple.service.app;

import my.simple.service.config.MyWebServiceConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({MyWebServiceConfig.class})
public class MyApp {

    private static Logger log = LoggerFactory.getLogger(MyApp.class);
    
    public static void main(String args[]) {
        ApplicationContext context = SpringApplication.run(MyApp.class, args);
        log.info("My countries web service has started, context ID : " + context.getId());
    }
}
