package com.example.sql_filter.model.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SqlBO {
    private String relation;
    private String bracketsLeft;
    private String fileds;
    private String compare;
    private String value;
    private String bracketsRight;
}
