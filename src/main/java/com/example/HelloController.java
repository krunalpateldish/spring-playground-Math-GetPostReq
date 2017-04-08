package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.*;

import java.sql.ResultSet;

@RestController
public class HelloController {

//    @GetMapping("/")
//    public String helloWorld() {
//        return "Hello from Spring!";
//    }


//    @GetMapping("/math/pi")
//    public String mathPi() {
//        return "3.141592653589793";
//    }
//
//    @GetMapping("/math/calculate")
//    public int calculate(@RequestParam Map<String, String> requestParams) {
//
//        String operation = requestParams.get("operation");
//        int val1 = Integer.parseInt(requestParams.get("x"));
//        int val2 = Integer.parseInt(requestParams.get("y"));
//
//        int result = 0;
//
//        if (operation.equalsIgnoreCase("add")) {
//            try {
//                result = val1 + val2;
//            } catch (Exception e) {
//                System.out.println("Error message " + e);
//            }
//        } else if (operation.equalsIgnoreCase("subtract")) {
//            try {
//                result = val1 - val2;
//            } catch (Exception e) {
//                System.out.println("Error message " + e);
//            }
//        } else if (operation.equalsIgnoreCase("multiply")) {
//            try {
//                result = val1 * val2;
//            } catch (Exception e) {
//                System.out.println("Error message " + e);
//            }
//        } else if (operation.equalsIgnoreCase("divide")) {
//
//            try {
//                result = val1 / val2;
//            } catch (Exception e) {
//                System.out.println("Error message " + e);
//            }
//        }
//        return result;
//    }
//
//
//    @PostMapping("/math/sum")
//    @RequestMapping
//    public int calculatePost(@RequestParam(value = "n") List<String> requestParams) {
//
//        String values = " ";
//        int total = 0;
//        try {
//            if(requestParams.size()!=0)
//            for (int i = 0; i < requestParams.size(); i++) {
//                int parmValue = 0;
//                parmValue = Integer.parseInt(requestParams.get(i));
//                total = total + parmValue;
//            }
//
//
//        } catch (Exception e) {
//            System.out.println("Error in Post Method" + e);
//        }
//        return total;
//    }

}