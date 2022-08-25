package cl.talentoDigital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import cl.talentoDigital.model.FraseChuckNorris;
import cl.talentoDigital.service.IFetchFraseChuckNorris;

@SpringBootApplication
public class M6C6D1ConsumeRestChukNorrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(M6C6D1ConsumeRestChukNorrisApplication.class, args);
	}

	private static final Logger logger = LoggerFactory.getLogger(M6C6D1ConsumeRestChukNorrisApplication.class);
	private ObjectMapper mapper = new ObjectMapper();

	@Autowired
	private IFetchFraseChuckNorris fetchFraseChukNorris;

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {

			FraseChuckNorris frase = fetchFraseChukNorris.fetchFraseChuckNorris();
			System.out.println(frase);


		};
	}

}
