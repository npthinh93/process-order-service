package com.digital.processorderservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseMetadata {

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long loadId;

    private String message;

    private String cursor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long total;

    public BaseMetadata(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseMetadata(String code, String message, String cursor) {
        this.code = code;
        this.message = message;
        this.cursor = cursor;
    }

    public BaseMetadata(String code, String type, String title, String message, String cursor) {
        this.code = code;
        this.type = type;
        this.title = title;
        this.message = message;
        this.cursor = cursor;
    }

    public BaseMetadata(String code, String type, String title, String message, String cursor, Long routePlanId) {
        this.code = code;
        this.type = type;
        this.title = title;
        this.message = message;
        this.cursor = cursor;
        this.loadId = routePlanId;
    }
}
