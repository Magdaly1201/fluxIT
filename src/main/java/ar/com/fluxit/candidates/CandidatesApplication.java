package ar.com.fluxit.candidates;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidatesApplication {

    public static void main(String[] args) {
	SpringApplication.run(CandidatesApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
	return new ModelMapper();
    }

}
