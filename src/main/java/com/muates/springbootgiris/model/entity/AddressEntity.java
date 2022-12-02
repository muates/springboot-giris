package com.muates.springbootgiris.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AddressEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @Column(name = "address_name", length = 15)
    private String addressName;

    @Column(name = "country", length = 15)
    private String country;

    @Column(name = "city", length = 15)
    private String city;

    @Column(name = "neighbourhood", length = 25)
    private String neighbourhood;

    @Column(name = "street", length = 25)
    private String street;

    @Column(name = "postal_code", length = 5)
    private String postalCode;

    @Column(name = "address", length = 100)
    private String address;
}
