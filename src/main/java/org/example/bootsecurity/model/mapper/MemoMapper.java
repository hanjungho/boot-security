package org.example.bootsecurity.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.bootsecurity.model.domain.Memo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MemoMapper {
    @Select("SELECT * FROM memo")
    List<Memo> findAll();

    @Insert("INSERT INTO memo (text) VALUES (#{text})")
    void insert(Memo memo);
}
