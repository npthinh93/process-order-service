package com.digital.processorderservice.controller;

import com.digital.processorderservice.constant.ResourcePath;
import com.digital.processorderservice.model.LocationDTO;
import com.digital.processorderservice.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = ResourcePath.API_ENDPOINT + ResourcePath.API_VERSION_V1)
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    @GetMapping(ResourcePath.GET_TARGETED_LOCATION)
    public ResponseEntity<List<LocationDTO>> getAvailableLocation(@RequestParam("locationId") Long locationId) {
        return ResponseEntity.ok(locationService.getAvailableLocation(locationId));
    }
}
