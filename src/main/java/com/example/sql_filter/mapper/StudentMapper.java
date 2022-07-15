package com.example.sql_filter.mapper;

import com.example.sql_filter.model.pojo.Student;
import com.example.sql_filter.model.vo.SqlVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    List<SqlVO> queryList(@Param("param") String condition);
}
