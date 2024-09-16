package com.example.demo.controller;

import com.example.demo.service.HelloService;
import com.example.demo.service.ServiceX;
import com.example.demo.service.ServiceY;
import com.example.demo.service.ServiceZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1")
public class HelloWorldController {

    @Autowired
    public HelloService helloService;

    @Autowired
    public ServiceX serviceX;

    @Autowired
    public ServiceY serviceY;

    @Autowired
    public ServiceZ serviceZ;



    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam String letter,
                             @RequestParam(defaultValue = "5") int size){
      //return "Hello World Niko Pogi";

        String results = "";

        switch (letter) {
            case "z": {
                System.out.println("Z Switch " + letter + size);
                results = serviceZ.printZ(size);
                break;
            }
            case "y": {
                System.out.println("Y Switch " + letter + size);
                results = serviceY.printY(size);
                break;
            }
            case "x": {
                System.out.println("X Switch " + letter + size);
                results = serviceX.printX(size);
                break;
            }
        }
        //String  x = serviceX.printZ();
        //System.out.println("Niko Pogi");

        //String  z = serviceZ.printZ();
        //String  printZ = helloService.printZ();
        return results;
    };

}

