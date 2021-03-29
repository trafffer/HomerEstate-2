package bg.softuni.homerestate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;

@EnableScheduling
@SpringBootApplication
public class HomerEstateApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomerEstateApplication.class, args);
    }
}
