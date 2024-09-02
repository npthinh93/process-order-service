package com.digital.processorderservice.service;

import com.digital.processorderservice.model.LocationDTO;
import com.digital.processorderservice.model.LocationResq;

import java.util.List;

public interface LocationService {
    List<LocationDTO> getAvailableLocation(Long locationId);
}
