package com.example.sys.service.impl;

import com.example.sys.dao.AddressDao;
import com.example.sys.entity.Address;
import com.example.sys.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressDao addressDao;

    @Override
    public List<Address> getAddressList() {
        return addressDao.getAddressList();
    }
}
