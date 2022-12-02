package com.muates.springbootgiris.service;

import com.muates.springbootgiris.model.entity.MemberEntity;

public interface MemberService {

    MemberEntity createMember(MemberEntity member);
    MemberEntity getMember(Long id);
    void deleteMember(Long id);
}
