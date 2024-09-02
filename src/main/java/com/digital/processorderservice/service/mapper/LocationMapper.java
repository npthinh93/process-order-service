package com.digital.processorderservice.service.mapper;

import com.digital.processorderservice.entity.Location;
import com.digital.processorderservice.model.LocationDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationMapper {

    LocationDTO toDto(Location location);

    Location toEntity(LocationDTO locationDTO);
}
