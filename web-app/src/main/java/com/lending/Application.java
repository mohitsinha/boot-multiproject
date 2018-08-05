package com.lending;
import com.lending.dao.models.mongo.ActiveLoan;
import com.lending.dao.repositories.mongo.ActiveLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {


    @Autowired
    private ActiveLoanRepository activeLoanRepository;

    @Bean
    CommandLineRunner runner(){
        return args -> {
            System.out.println("CommandLineRunner running in the UnsplashApplication class...");
            activeLoanRepository.save(new ActiveLoan()).block();
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}