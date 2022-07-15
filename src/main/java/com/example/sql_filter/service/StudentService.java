package com.example.sql_filter.service;

import com.example.sql_filter.model.bo.SqlBO;
import com.example.sql_filter.model.vo.SqlVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<SqlVO> queryList(List<SqlBO> sqlBO);
}
