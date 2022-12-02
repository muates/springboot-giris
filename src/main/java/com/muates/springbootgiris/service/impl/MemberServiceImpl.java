package com.muates.springbootgiris.service.impl;

import com.muates.springbootgiris.exception.GlobalException;
import com.muates.springbootgiris.model.entity.MemberEntity;
import com.muates.springbootgiris.repository.MemberRepository;
import com.muates.springbootgiris.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public MemberEntity createMember(MemberEntity member) {
        return memberRepository.save(member);
    }

    @Override
    public MemberEntity getMember(Long memberId) {
        MemberEntity member = memberRepository.findById(memberId).orElseThrow(() -> new GlobalException("Member ", HttpStatus.NOT_FOUND));
        return member;
    }

    @Override
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
