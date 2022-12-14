package com.muates.springbootgiris.controller;

import com.muates.springbootgiris.model.converter.MemberConverter;
import com.muates.springbootgiris.model.dto.request.CreateMemberRequest;
import com.muates.springbootgiris.model.dto.request.UpdateMemberRequest;
import com.muates.springbootgiris.model.dto.response.MemberResponse;
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
     * @param request
     * @return
     */
    @PostMapping("/create")
    public MemberResponse createMember(@RequestBody CreateMemberRequest request) {
        return MemberConverter.convertToResponse(memberService.createMember(request));
    }

    /**
     * id göre db den member ı getirecek
     * -> localhost:9090/member/
     * @param memberId
     * @return
     */
    @GetMapping("/{memberId}")
    public MemberResponse getMember(@PathVariable Long memberId) {
        return MemberConverter.convertToResponse(memberService.getMember(memberId));
    }

    @PutMapping("/{memberId}")
    public MemberResponse updateMember(@PathVariable Long memberId,
                                       @RequestBody UpdateMemberRequest request) {
        return MemberConverter.convertToResponse(memberService.updateMember(memberId, request));
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Long memberId) {
        memberService.deleteMember(memberId);
    }
}
