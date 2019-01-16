package at.fhv.issdistance;

import at.fhv.issdistance.models.DiscoveredResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class Application {

	/**
	* Main entry point to start the spring boot application
	* @param args The command line arguments
	*/

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
