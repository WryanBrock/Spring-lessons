package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJpaRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception{
//        repository.insert(new Course(1, "Learn AWS JPA!", "28minutes"));
//        repository.insert(new Course(2, "Learn AZURE JPA!", "28minutes"));
//        repository.insert(new Course(3, "Learn GITHUB NOW!", "28minutes"));
//
//        repository.deleteById(1);
//        System.out.println(repository.findById(2));
//        System.out.println(repository.findById(3));
        repository.save(new Course(1, "Learn AWS JPA!", "28minutes"));
        repository.save(new Course(2, "Learn AZURE JPA!", "28minutes"));
        repository.save(new Course(3, "Learn GITHUB NOW!", "28minutes"));

        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
        System.out.println(repository.count());
        System.out.println(repository.findAll());

    }
}
