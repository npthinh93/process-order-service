package com.digital.processorderservice.service.impl;

import com.digital.processorderservice.entity.Location;
import com.digital.processorderservice.handler.exception.NotFoundException;
import com.digital.processorderservice.model.LocationDTO;
import com.digital.processorderservice.repository.LocationRepository;
import com.digital.processorderservice.service.LocationService;
import com.digital.processorderservice.service.mapper.LocationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;
    private final LocationMapper locationMapper;

    @Override
    public List<LocationDTO> getAvailableLocation(Long locationId) {
        Location location = locationRepository.findById(locationId).orElseThrow(() -> new NotFoundException(HttpStatus.BAD_REQUEST.name(), "Not found targeted location."));
        return List.of(locationMapper.toDto(location));
    }
}
