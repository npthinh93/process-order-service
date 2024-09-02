package com.digital.processorderservice.service.mapper;

import com.digital.processorderservice.entity.Item;
import com.digital.processorderservice.entity.Shop;
import com.digital.processorderservice.model.ItemDTO;
import com.digital.processorderservice.model.ShopDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDTO toDto(Item shop);

    Item toEntity(ItemDTO shopDTO);
}
