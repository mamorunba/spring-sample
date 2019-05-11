package com.example.springsample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springsample.entity.Customer;
import com.example.springsample.service.CustomerService;

@Controller
public class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    private final CustomerService customerService;

    public SampleController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value="/")
    public String index(Model model) {
        model.addAttribute("msg", "input your name :");    // 表示メッセージ
        return "index";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String send(@RequestParam("name")String name,
    		Model model) {
    	model.addAttribute("msg", "Hello " + name + " !");    // 表示メッセージ
        Iterable<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "menu";
    }
}
