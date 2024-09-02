package com.digital.processorderservice.service.impl;

import com.digital.processorderservice.entity.Item;
import com.digital.processorderservice.handler.exception.NotFoundException;
import com.digital.processorderservice.model.ItemDTO;
import com.digital.processorderservice.repository.ItemRepository;
import com.digital.processorderservice.service.ItemService;
import com.digital.processorderservice.service.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public List<ItemDTO> getMenuByShop(Long shopId) {
        List<Item> items = itemRepository.findAllByShopsId(shopId);
        if (CollectionUtils.isEmpty(items))
            throw new NotFoundException(HttpStatus.BAD_REQUEST.name(), "Not found items for menu.");
        return items.stream().map(itemMapper::toDto).toList();
    }

}
