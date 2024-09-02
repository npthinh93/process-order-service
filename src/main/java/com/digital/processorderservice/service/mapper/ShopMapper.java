package com.digital.processorderservice.service.mapper;

import com.digital.processorderservice.entity.Shop;
import com.digital.processorderservice.model.ShopDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShopMapper {

    ShopDTO toDto(Shop shop);

    Shop toEntity(ShopDTO shopDTO);
}
