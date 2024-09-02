package com.digital.processorderservice.controller;

import com.digital.processorderservice.constant.ResourcePath;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = ResourcePath.API_ENDPOINT + ResourcePath.API_VERSION_V1 + ResourcePath.LOCATION_URI)
public class AuthController {
}
