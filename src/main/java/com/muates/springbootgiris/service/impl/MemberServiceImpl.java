package com.muates.springbootgiris.service.impl;

import com.muates.springbootgiris.exception.GlobalException;
import com.muates.springbootgiris.model.converter.MemberConverter;
import com.muates.springbootgiris.model.dto.request.CreateMemberRequest;
import com.muates.springbootgiris.model.dto.request.UpdateMemberRequest;
import com.muates.springbootgiris.model.entity.MemberEntity;
import com.muates.springbootgiris.repository.MemberRepository;
import com.muates.springbootgiris.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

@Transactional
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public MemberEntity createMember(CreateMemberRequest request) {
        return memberRepository.save(MemberConverter.convertToMember(request));
    }

    @Override
    @Transactional
    public MemberEntity getMember(Long memberId) {
        Optional<MemberEntity> member = memberRepository.findById(memberId);
        if (member.isEmpty())
            throw new GlobalException("Kullanıcı bulunamadı", HttpStatus.NOT_FOUND);

        return member.get();
    }

    @Override
    public MemberEntity updateMember(Long memberId, UpdateMemberRequest request) {
        MemberEntity member = getMember(memberId);

        if (request.getPhone() != null) member.setPhone(request.getPhone());
        if (request.getPhoneCode() != null) member.setPhoneCode(request.getPhoneCode());
        if (request.getEmail() != null) member.setEmail(request.getEmail());

        member.setUpdatedDate(new Date());

        return memberRepository.save(member);
    }

    @Override
    public void deleteMember(Long id) {
        // todo : tekrardan gözden geçirilecek
        memberRepository.deleteById(id);
    }
}
