package com.muates.springbootgiris.service.impl;

import com.muates.springbootgiris.model.dto.request.MatematikToplaRequest;
import com.muates.springbootgiris.service.MatematikServis;
import org.springframework.stereotype.Service;

@Service
public class MatematikServisImpl implements MatematikServis {

    @Override
    public Integer topla(MatematikToplaRequest request) {
        return request.getSayi1() + request.getSayi2();
    }
}
