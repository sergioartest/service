package com.sergioartest.service;

import com.sergioartest.service.resource.response.AutoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AutoResource {

    @GetMapping(path = "car", produces = "application/json")
    public AutoResponse getAutoById(Long id){
        return new AutoResponse(id, "test_brand", "test_model", 10.00);
    }

    @GetMapping(path = "cars/{id}", produces = "application/json")
    public AutoResponse getAutoByIdOnParam(@PathVariable(name = "id") Long id){
        return new AutoResponse(id, "test_brand", "test_model", 10.00);
    }

}
