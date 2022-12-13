package com.example.sampleapplicationspringbootmybattis.mapper;

import com.example.sampleapplicationspringbootmybattis.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface UsersMapper {


     @Select("select * from user")

     List<User>  finAll();
    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user(name,salary) values(#{name},#{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(User users);
}
