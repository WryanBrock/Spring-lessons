package com.in28minutes.learnspringframework.example.f1;

import com.in28minutes.learnspringframework.example.a0.LazyInitializationLauncherApplication;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class SomeClass{
    private SomeDependency someDependency;
    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency =someDependency;
        System.out.println("All Dependencies all ready");
    }
    @PostConstruct
    public void initialize(){//fetch from databases
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp(){//close active connections
        System.out.println("Clean Up");
    }
}
@Component
class SomeDependency{
    public void getReady(){
        System.out.println("Some logic using someDependency");
    }
}



@Configuration
@ComponentScan
public class PrePostAnnotationsLauncherApplication {

        public static void main(String[] args) {
            try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication.class)){

                Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            }
        }
    }

