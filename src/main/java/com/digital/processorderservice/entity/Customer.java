package com.digital.processorderservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_customer")
@Builder(toBuilder = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;

}
