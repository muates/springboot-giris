package com.muates.springbootgiris.model.converter;

import com.muates.springbootgiris.model.dto.request.AddressAddRequest;
import com.muates.springbootgiris.model.entity.AddressEntity;

public class AddressConverter {

    public static AddressEntity convertToAddress(AddressAddRequest request) {
        if (request == null)
            return null;

        return AddressEntity.builder()
                .addressName(request.getAddressName())
                .country(request.getCountry())
                .city(request.getCity())
                .neighbourhood(request.getNeighbourhood())
                .street(request.getStreet())
                .postalCode(request.getPostalCode())
                .addressName(request.getAddress())
                .build();
    }
}
