package zz.sk.bankingdashboard.Configuration;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zz.sk.bankingdashboard.Entities.Adresse;

import java.io.IOException;

@Configuration
public class JacksonConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Adresse.class, new AdresseDeserializer());
        module.addDeserializer(Object.class, new CustomDeserializer());
        objectMapper.registerModule(module);
        return objectMapper;
    }
}


