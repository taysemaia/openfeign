package br.com.feign.decoder;

import feign.Response;
import feign.codec.ErrorDecoder;

public class AdviceClientErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {

        return switch (response.status()) {
            case 400 -> new Exception(" error");
            case 404 -> new Exception("404  error");
            default -> new Exception("Generic error");
        };
    }
}
