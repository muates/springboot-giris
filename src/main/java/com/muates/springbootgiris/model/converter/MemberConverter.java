package com.muates.springbootgiris.model.converter;

import com.muates.springbootgiris.model.dto.request.CreateMemberRequest;
import com.muates.springbootgiris.model.dto.request.UpdateMemberRequest;
import com.muates.springbootgiris.model.dto.response.MemberResponse;
import com.muates.springbootgiris.model.entity.MemberEntity;
import com.muates.springbootgiris.model.enums.GenderEnum;

public class MemberConverter {

    public static MemberEntity convertToMember(CreateMemberRequest request) {
        if (request == null)
            return null;

        return MemberEntity.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .phoneCode(request.getPhoneCode())
                .phone(request.getPhone())
                .gender(convertToGender(request.getGender()))
                .build();
    }

    public static MemberEntity convertToMember(Long memberId,
                                               UpdateMemberRequest request) {
        if (request == null)
            return null;

        MemberEntity member = new MemberEntity();

        member.setId(memberId);
        if (request.getPhone() != null) member.setPhone(request.getPhone());
        if (request.getPhoneCode() != null) member.setPhoneCode(request.getPhoneCode());
        if (request.getEmail() != null) member.setEmail(request.getEmail());

        return member;
    }

    public static MemberResponse convertToResponse(MemberEntity member) {
        if (member == null)
            return null;

        return MemberResponse.builder()
                .firstName(member.getFirstName())
                .lastName(member.getLastName())
                .email(member.getEmail())
                .phone(member.getPhoneCode() + member.getPhone())
                .build();
    }

    private static GenderEnum convertToGender(String gender) {
        if (gender == null)
            return null;

        return switch (gender) {
            case "MALE" -> GenderEnum.MALE;
            case "FEMALE" -> GenderEnum.FEMALE;
            default -> null;
        };
    }
}
