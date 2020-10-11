package io.spring.exceptionhandling.controller;

import io.spring.exceptionhandling.exception.BadNationalCodException;
import io.spring.exceptionhandling.exception.EntityNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HomeController {

    @GetMapping("/{id}")
    protected String getEntity(@PathVariable Long id){
        if (id == 0) {
            throw new BadNationalCodException("zero id exception");
        }else if(id == 1){
            throw new EntityNotFoundException("one id exception");
        }
        return "this is a test";
    }
}
