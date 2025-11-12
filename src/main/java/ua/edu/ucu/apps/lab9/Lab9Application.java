package ua.edu.ucu.apps.lab9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class Lab9Application {

    public static void main(String[] args) {
       TimeZone.setDefault(TimeZone.getTimeZone("Europe/Kyiv"));
       SpringApplication.run(Lab9Application.class, args);
    }

}
