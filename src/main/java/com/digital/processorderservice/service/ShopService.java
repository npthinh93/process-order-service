package com.digital.processorderservice.service;

import com.digital.processorderservice.entity.Shop;
import com.digital.processorderservice.model.ItemDTO;
import com.digital.processorderservice.model.ItemRes;
import com.digital.processorderservice.model.ShopDTO;
import com.digital.processorderservice.model.ShopRes;

import java.util.List;

public interface ShopService {

    List<ShopDTO> getClosestShops(Long locationId);
}
