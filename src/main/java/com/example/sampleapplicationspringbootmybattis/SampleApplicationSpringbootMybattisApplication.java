package com.example.sampleapplicationspringbootmybattis;

import com.example.sampleapplicationspringbootmybattis.model.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@MappedTypes(User.class)
@MapperScan("com.example.sampleapplicationspringbootmybattis.mapper")*/
@SpringBootApplication
public class SampleApplicationSpringbootMybattisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplicationSpringbootMybattisApplication.class, args);
    }

}
