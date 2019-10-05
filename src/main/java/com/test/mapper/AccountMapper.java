package com.test.mapper;

import com.test.model.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 20190712713
 * @date 2019/10/5 16:12
 */
@Repository
public interface AccountMapper {
//    @Insert(value="insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);

//    @Select("select * from account")
    List<Account> findAll();
}
