package com.helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HelloWorldSpring {

    @Autowired
    private static DummyController dummyController;
    private static DummyService dummyService;

    public HelloWorldSpring(DummyController dummyController) {
        this.dummyController = dummyController;
    }


//    public static void main(String[] args) {
//        SpringApplication.run(HelloWorldSpring.class, args);
//        System.out.println(" DummyService returned: "+dummyController);
//    }



//        public HelloWorldSpring(DummyService dummyService) {
//        this.dummyService = dummyService;
//
//    }

//    public static void main(String[] args) {
//
//        ConfigurableApplicationContext context = SpringApplication.run(HelloWorldSpring.class, args);
//        System.out.println(" Spring Tutorial 1: Hello World with Spring Boot. ");
//        //DummyService dummyService = new DummyServiceImpl();
//        System.out.println(" DummyService returned: "+dummyService.test());
//
//    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//        };
//    }
}
