package com.digital.processorderservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "tbl_shop")
@Entity
@Builder(toBuilder = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shop extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "address")
    private String address;

    @ManyToMany
    @JoinTable(name = "tbl_shop_item",
            joinColumns = @JoinColumn(name = "shop_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"))
    private List<Item> items;

    @ManyToMany(mappedBy = "shops")
    private List<Location> locations;
}
