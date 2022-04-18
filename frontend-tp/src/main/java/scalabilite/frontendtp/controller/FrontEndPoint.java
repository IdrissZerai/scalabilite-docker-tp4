package scalabilite.frontendtp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class FrontEndPoint {
    @Value("${backend.url}")
    private String backendurl;
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping
    public String call(@RequestBody String body){
        System.out.println(backendurl);
        return restTemplate.postForObject(backendurl,body,String.class);
    }
}
