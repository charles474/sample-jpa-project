package com.tutorial.samplejpaproject.config;

import com.tutorial.samplejpaproject.entities.Student;
import com.tutorial.samplejpaproject.repository.StudentRepository;
import com.tutorial.samplejpaproject.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class StudentConfig {

    private DateUtils dateUtils;

    @Autowired
    public StudentConfig(DateUtils dateUtils) {
        this.dateUtils = dateUtils;
    }

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository studentRepository){
        return args -> {
            Student miriam = new Student("Miriam", "Lopez", "miriam.lopez@hotmail.com", 32, dateUtils.getDate(), dateUtils.getDate());
            Student tony = new Student("Tony", "Almeida", "tony.al@hotmail.com", 32, dateUtils.getDate(), dateUtils.getDate());
            studentRepository.saveAll(Arrays.asList(miriam, tony));
        };
    }

}
