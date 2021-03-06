package uz.mafia.springbootamigoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student("mariam", "mariam@gmail", LocalDate.of(2000, Month.JANUARY, 21));
            Student alex = new Student("alex", "alex@gmail", LocalDate.of(2000, Month.JANUARY, 21));

            repository.saveAll(List.of(mariam, alex));
        };
    }
}
