package com.digital.processorderservice.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse {
    private BaseMetadata meta;
    private Object data;
}
