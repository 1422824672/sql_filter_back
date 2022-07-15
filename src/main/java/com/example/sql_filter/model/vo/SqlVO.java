package com.example.sql_filter.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class SqlVO {
    private Integer id;
    private String stuId;
    private String name;
    private String classes;
}
