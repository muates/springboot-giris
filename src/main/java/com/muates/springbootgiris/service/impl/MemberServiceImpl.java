package com.muates.springbootgiris.service.impl;

import com.muates.springbootgiris.exception.GlobalException;
import com.muates.springbootgiris.model.converter.MemberConverter;
import com.muates.springbootgiris.model.dto.request.CreateMemberRequest;
import com.muates.springbootgiris.model.dto.request.UpdateMemberRequest;
import com.muates.springbootgiris.model.dto.response.MemberResponse;
import com.muates.springbootgiris.model.entity.MemberEntity;
import com.muates.springbootgiris.repository.MemberRepository;
import com.muates.springbootgiris.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public MemberResponse createMember(CreateMemberRequest request) {
        MemberEntity member = MemberConverter.convertToMember(request);
        return MemberConverter.convertToResponse(memberRepository.save(member));
    }

    @Override
    public MemberResponse getMember(Long memberId) {
        Optional<MemberEntity> member = memberRepository.findById(memberId);
        if (member.isEmpty())
            throw new GlobalException("Kullanıcı bulunamadı", HttpStatus.NOT_FOUND);

        return MemberConverter.convertToResponse(member.get());
    }

    @Override
    public MemberResponse updateMember(Long memberId, UpdateMemberRequest request) {
        MemberEntity member = MemberConverter.convertToMember(memberId, request);
        return MemberConverter.convertToResponse(memberRepository.save(member));
    }

    @Override
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
