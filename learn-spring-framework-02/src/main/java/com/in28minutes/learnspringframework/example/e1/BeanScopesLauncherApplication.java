package com.in28minutes.learnspringframework.example.e1;

import com.in28minutes.learnspringframework.example.a0.LazyInitializationLauncherApplication;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component//all are singletons, same bean object
class NormalClass{

}
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)//many objects instances per spring IoC container
@Component//Scopes are used for Request, Session, Application, Websocket. New object
class PrototypeClass{

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {//Java singleton vs Spring singleton
                                            //Spring: one singleton per IoC container
                                            //Java: one object for instance per JVM

        public static void main(String[] args) {
            try(var context = new AnnotationConfigApplicationContext
                    (BeanScopesLauncherApplication.class)){

                System.out.println(context.getBean(NormalClass.class));
                System.out.println(context.getBean(NormalClass.class));

                System.out.println(context.getBean(PrototypeClass.class));
                System.out.println(context.getBean(PrototypeClass.class));
                System.out.println(context.getBean(PrototypeClass.class));
            }
        }
    }

