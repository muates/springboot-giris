package com.muates.springbootgiris.service.impl;

import com.muates.springbootgiris.model.dto.request.AddressAddRequest;
import com.muates.springbootgiris.model.dto.request.AddressUpdateRequest;
import com.muates.springbootgiris.model.entity.AddressEntity;
import com.muates.springbootgiris.repository.AddressRepository;
import com.muates.springbootgiris.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public AddressEntity addAddress(AddressAddRequest request) {
        return null;
    }

    @Override
    public AddressEntity getAddress(Long addressId) {
        return null;
    }

    @Override
    public AddressEntity updateAddress(Long addressId, AddressUpdateRequest request) {
        return null;
    }

    @Override
    public void deleteAddress(Long addressId) {

    }
}
