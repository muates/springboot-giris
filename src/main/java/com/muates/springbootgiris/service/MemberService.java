package com.muates.springbootgiris.service;

import com.muates.springbootgiris.model.dto.request.CreateMemberRequest;
import com.muates.springbootgiris.model.dto.request.UpdateMemberRequest;
import com.muates.springbootgiris.model.dto.response.MemberResponse;

public interface MemberService {

    MemberResponse createMember(CreateMemberRequest request);
    MemberResponse getMember(Long id);
    MemberResponse updateMember(Long id, UpdateMemberRequest request);
    void deleteMember(Long id);
}
