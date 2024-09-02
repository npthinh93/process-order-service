package com.digital.processorderservice.service;

import com.digital.processorderservice.model.ItemDTO;

import java.util.List;

public interface ItemService {
    List<ItemDTO> getMenuByShop(Long shopId);
}
