package com.SpringCloud.AddressService.Response;


import com.SpringCloud.AddressService.Entity.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
    private Long id;
    private String street;
    private String city;

    public AddressResponse(AddressEntity address) {

        this.id = address.getId();
        this.street = address.getStreet();
        this.city = address.getCity();

    }
}
