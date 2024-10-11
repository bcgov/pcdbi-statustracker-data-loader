package ca.bc.gov.hlth.pcdbi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.util.MimeType;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class WebClientConfig {
    
    @Value("${chefs.url}")
    private String chefsUrl;

    @Bean
    WebClient chefsWebClient() {
        WebClient webClient = WebClient.builder()
                .baseUrl(chefsUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .codecs(configurer -> {
                    // This API returns JSON with content type text/json, so need to register a custom
                    // decoder to deserialize this response via Jackson
                    
                    // Get existing decoder's ObjectMapper if available, or create new one
                    ObjectMapper objectMapper = configurer.getReaders().stream()
                        .filter(reader -> reader instanceof Jackson2JsonDecoder)
                        .map(reader -> (Jackson2JsonDecoder) reader)
                        .map(reader -> reader.getObjectMapper())
                        .findFirst()
                        .orElseGet(() -> Jackson2ObjectMapperBuilder.json().build());
                    
                    Jackson2JsonDecoder decoder = new Jackson2JsonDecoder(objectMapper, new MimeType("text", "json"));
                    configurer.customCodecs().registerWithDefaultConfig(decoder);
                })
                .build();
        
        return webClient;
    }
}
