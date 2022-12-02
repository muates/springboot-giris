package com.muates.springbootgiris.model.entity;

import com.muates.springbootgiris.model.enums.GenderEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "members")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MemberEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phone_code", length = 4)
    private String phoneCode;

    @Column(name = "phone", length = 7)
    private String phone;

    @Column(name = "age", length = 3)
    private String age;

    @Column(name = "gender")
    @Enumerated(EnumType.ORDINAL)
    private GenderEnum gender;

    @Column(name = "is_active")
    private boolean isActive;

}
