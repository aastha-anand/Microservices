package com.SpringCloud.StudentService.FeignClientInterface;

import com.SpringCloud.StudentService.Response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "AddressService")
public interface AddressFeignClient {

    @GetMapping("/api/address/getById/{id}")
    public AddressResponse getById(@PathVariable long id);
}
