package com.example.sys.controller;

import com.example.sys.entity.Address;
import com.example.sys.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/addressList")
    public ModelAndView withdrawList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Address> addressList = addressService.getAddressList();
        modelAndView.addObject("addressList",addressList);
        return modelAndView;
    }
}
