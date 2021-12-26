package org.meir.model;

import lombok.Data;

import java.util.Map;

@Data
public class Listing {

    private String title;
    private String description;
    private Integer price;

    private Map<String, Object> content;

}
