package com.example.sql_filter.service;

import com.example.sql_filter.mapper.StudentMapper;
import com.example.sql_filter.model.bo.SqlBO;
import com.example.sql_filter.model.vo.SqlVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<SqlVO> queryList(List<SqlBO> sqlBO) {
        String sql = "";
        for (SqlBO b : sqlBO) {
            sql += b.getRelation()
                    + b.getBracketsLeft()
                    + b.getFileds()
                    + b.getCompare()
                    + "'" +b.getValue() + "'"
                    + b.getBracketsRight();
        }
        return studentMapper.queryList(sql);
    }
}
