package com.digital.processorderservice.controller;

import com.digital.processorderservice.constant.ResourcePath;
import com.digital.processorderservice.model.ItemDTO;
import com.digital.processorderservice.model.ItemRes;
import com.digital.processorderservice.model.ShopDTO;
import com.digital.processorderservice.model.ShopRes;
import com.digital.processorderservice.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = ResourcePath.API_ENDPOINT + ResourcePath.API_VERSION_V1 + ResourcePath.SHOP_URI)
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;

    @GetMapping(ResourcePath.GET_CLOSEST_SHOPS)
    public ResponseEntity<List<ShopDTO>> getClosestShops(@RequestParam("locationId") Long locationId) {
        return ResponseEntity.ok(shopService.getClosestShops(locationId));
    }
}
