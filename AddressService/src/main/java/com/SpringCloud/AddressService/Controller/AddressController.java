package com.SpringCloud.AddressService.Controller;

import com.SpringCloud.AddressService.Request.AddressRequest;
import com.SpringCloud.AddressService.Response.AddressResponse;
import com.SpringCloud.AddressService.Service.AddressBusinessLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressBusinessLogic addressBusinessLogic;

    @PostMapping("/create")
    public AddressResponse createAddress(
            @RequestBody AddressRequest request) {

        return addressBusinessLogic.createAddress(request);
    }

    @GetMapping("/getById/{id}")
    public AddressResponse getById(@PathVariable long id) {
        return addressBusinessLogic.getById(id);
    }
}