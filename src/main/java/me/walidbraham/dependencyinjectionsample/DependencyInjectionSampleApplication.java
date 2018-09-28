package me.walidbraham.dependencyinjectionsample;

import me.walidbraham.dependencyinjectionsample.controllers.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionSampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionSampleApplication.class, args);
        TestController testController = (TestController) context.getBean("testController");
        testController.Greetings();
    }
}
