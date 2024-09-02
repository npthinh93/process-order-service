package com.digital.processorderservice.service.impl;

import com.digital.processorderservice.entity.Shop;
import com.digital.processorderservice.handler.exception.NotFoundException;
import com.digital.processorderservice.model.ItemDTO;
import com.digital.processorderservice.model.ItemRes;
import com.digital.processorderservice.model.ShopDTO;
import com.digital.processorderservice.model.ShopRes;
import com.digital.processorderservice.repository.ShopRepository;
import com.digital.processorderservice.service.ShopService;
import com.digital.processorderservice.service.mapper.ShopMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;
    private final ShopMapper shopMapper;

    @Override
    public List<ShopDTO> getClosestShops(Long locationId) {
        List<Shop> shops = shopRepository.findAllByLocationsId(locationId);
        if (CollectionUtils.isEmpty(shops)) throw new NotFoundException(HttpStatus.BAD_REQUEST.name(), "Not found shops.");
        return shops.stream().map(shopMapper::toDto).toList();
    }

}
