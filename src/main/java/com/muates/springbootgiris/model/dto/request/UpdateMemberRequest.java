package com.muates.springbootgiris.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateMemberRequest {

    private String phoneCode;
    private String phone;
    private String email;
}
