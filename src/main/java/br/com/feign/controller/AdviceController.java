package br.com.feign.controller;

import br.com.feign.client.AdviceClient;
import br.com.feign.dto.Slip;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AdviceController {

    private final AdviceClient client;

    @GetMapping(value = "/advice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Slip getAdvice() {
        return client.getAdvice();
    }

}
