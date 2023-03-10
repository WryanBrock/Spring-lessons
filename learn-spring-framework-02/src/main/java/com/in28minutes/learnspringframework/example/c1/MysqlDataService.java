package com.in28minutes.learnspringframework.example.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MysqlDataService implements DataService{
    @Override
    public int[] retrieveData(){
        return new int[] {1,2,3,4,5};
    }
}
