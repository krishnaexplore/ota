package com.zurich.hotels.rest;

import com.zurich.hotels.vo.HotelDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {


    @GetMapping("details/{id}")
    public HotelDetails details(@PathVariable("id") String id){

        return new HotelDetails(id,"The Godfrey Hotel Boston", "A restaurant, a 24-hour fitness center, and a bar/lounge are available at this smoke-free hotel. ");
    }
}
