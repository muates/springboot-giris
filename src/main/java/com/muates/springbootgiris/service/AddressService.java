package com.muates.springbootgiris.service;


import com.muates.springbootgiris.model.dto.request.AddressAddRequest;
import com.muates.springbootgiris.model.dto.request.AddressUpdateRequest;
import com.muates.springbootgiris.model.entity.AddressEntity;

public interface AddressService {
    AddressEntity addAddress(AddressAddRequest request);
    AddressEntity getAddress(Long addressId);
    AddressEntity updateAddress(Long addressId, AddressUpdateRequest request);
    void deleteAddress(Long addressId);
}
