package com.SpringCloud.AddressService.Request;

import com.SpringCloud.AddressService.Entity.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {
    private String street;
    private String city;

    public AddressRequest(AddressEntity address) {

        this.street = address.getStreet();
        this.city = address.getCity();

    }
}
