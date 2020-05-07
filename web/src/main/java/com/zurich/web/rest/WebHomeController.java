package com.zurich.web.rest;

import com.zurich.web.vo.Hotel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebHomeController {


    private RestTemplate template;

    @Value("${web.hotels.service}")
    private String hotelsUrl;

    public WebHomeController(RestTemplate template){
        this.template = template;
    }
    @GetMapping("/home")
    public String home(){
        return "welcome";
    }

    @GetMapping("/hotelDetails")
    public Hotel hotelList(){
        return template.getForObject(hotelsUrl, Hotel.class);
    }
}
