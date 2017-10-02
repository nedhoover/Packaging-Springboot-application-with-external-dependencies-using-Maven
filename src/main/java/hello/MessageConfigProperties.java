package hello;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration 
@ConfigurationProperties(prefix="message") 
public class MessageConfigProperties {

public String getGreetings() {
return "Greetings from Spring Boot!";
}

}
