package com.digital.processorderservice.controller;

import com.digital.processorderservice.constant.ResourcePath;
import com.digital.processorderservice.model.ItemDTO;
import com.digital.processorderservice.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = ResourcePath.API_ENDPOINT + ResourcePath.API_VERSION_V1 + ResourcePath.ITEM_URI)
@RequiredArgsConstructor
public class ItemController {

    private ItemService itemService;

    @GetMapping(ResourcePath.GET_MENU_BY_SHOP)
    public ResponseEntity<List<ItemDTO>> getMenuByShop(@RequestParam("shopId") Long shopId) {
        return ResponseEntity.ok(itemService.getMenuByShop(shopId));
    }
}
