package com.muates.springbootgiris.controller;

import com.muates.springbootgiris.model.entity.MemberEntity;
import com.muates.springbootgiris.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    /**
     * Postmanden MemberEntity doldurup yeni bir member oluşturacağız
     * -> localhost:9090/member/create
     *
     * @param member
     * @return
     */
    @PostMapping("/create")
    public MemberEntity createMember(@RequestBody MemberEntity member) {
        return memberService.createMember(member);
    }

    /**
     * id göre db den member ı getirecek
     * -> localhost:9090/member/
     * @param memberId
     * @return
     */
    @GetMapping("/{memberId}")
    public MemberEntity getMember(@PathVariable Long memberId) {
        return memberService.getMember(memberId);
    }
}
