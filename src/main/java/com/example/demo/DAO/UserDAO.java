package com.example.demo.DAO;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserDAO {
    @Select("select * from usertable where UserName=#{username}")
    public User getByName(String username);

    @Update("update usertable set Password=#{newpwd} where UserName=#{username}")
    public  boolean updateByName(String username,String newpwd);
}
