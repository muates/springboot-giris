package com.muates.springbootgiris.service;

import com.muates.springbootgiris.model.dto.request.CreateMemberRequest;
import com.muates.springbootgiris.model.dto.request.UpdateMemberRequest;
import com.muates.springbootgiris.model.entity.MemberEntity;

public interface MemberService {

    MemberEntity createMember(CreateMemberRequest request);
    MemberEntity getMember(Long id);
    MemberEntity updateMember(Long id, UpdateMemberRequest request);
    void deleteMember(Long id);
}
