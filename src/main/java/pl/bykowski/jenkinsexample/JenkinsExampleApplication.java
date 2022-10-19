package pl.bykowski.jenkinsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsExampleApplication.class, args);
    }

    public int adder(int a, int b) {
        return a * b;
    }
}
