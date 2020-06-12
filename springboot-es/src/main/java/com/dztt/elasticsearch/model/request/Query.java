package com.dztt.elasticsearch.model.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Query {
    private String key;
    private String value;
}
