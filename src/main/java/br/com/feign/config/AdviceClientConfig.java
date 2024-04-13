package br.com.feign.config;

import br.com.feign.decoder.AdviceClientErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class AdviceClientConfig {

    @Bean
    public ErrorDecoder errorDecoder(){
        return new AdviceClientErrorDecoder();
    }
}
