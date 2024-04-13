package br.com.feign.client;

import br.com.feign.config.AdviceClientConfig;
import br.com.feign.dto.Advice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "adviceSlip", url = "https://api.adviceslip.com/", configuration = AdviceClientConfig.class)
public interface AdviceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/advice")
    Advice getAdvice();
}
