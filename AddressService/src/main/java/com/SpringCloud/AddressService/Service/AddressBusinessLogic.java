package com.SpringCloud.AddressService.Service;

import com.SpringCloud.AddressService.Entity.AddressEntity;
import com.SpringCloud.AddressService.Repository.AddressRepository;
import com.SpringCloud.AddressService.Request.AddressRequest;
import com.SpringCloud.AddressService.Response.AddressResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AddressBusinessLogic {

    private static final Logger logger = LoggerFactory.getLogger(AddressBusinessLogic.class);

    @Autowired
    AddressRepository addressRepository;

    public AddressResponse createAddress(AddressRequest addressRequest){
        AddressEntity address=new AddressEntity();
        address.setStreet(addressRequest.getStreet());
        address.setCity(addressRequest.getCity());

        addressRepository.save(address);
        return new AddressResponse(address);
    }

    public AddressResponse getById(long id){
        logger.info("Inside Get by Id"+id);
        AddressEntity addressEntity=addressRepository.findById(id).get();
        return new AddressResponse(addressEntity);
    }
}
