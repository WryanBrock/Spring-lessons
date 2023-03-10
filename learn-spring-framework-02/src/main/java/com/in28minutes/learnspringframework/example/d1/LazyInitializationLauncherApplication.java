package com.in28minutes.learnspringframework.example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
    private ClassA classA;
    public ClassB(ClassA classA){
        System.out.println("Some initialization");
        this.classA=classA;
    }
    public void doSomething(){
        System.out.println("Do Something");
    }
}

//use if you have a heavy startup, cons are that bugs wont be noticed until runtime, use when bean is rarely used
@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

        public static void main(String[] args) {
            try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){

                System.out.println("initialization of context is completed");
                context.getBean(ClassB.class).doSomething();
            }
        }
    }

