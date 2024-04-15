package br.com.feign.client;

import br.com.feign.config.AdviceClientConfig;
import br.com.feign.dto.Slip;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "adviceSlip", url = "https://api.adviceslip.com/", configuration = AdviceClientConfig.class)
public interface AdviceClient {

    @GetMapping(value = "/advice", consumes = MediaType.APPLICATION_JSON_VALUE)
    Slip getAdvice();
}
