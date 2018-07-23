package com.kajie88.base.dao;

import com.kajie88.base.po.User;
import com.kajie88.base.po.UserExample;
import java.util.List;

import com.test.MyMapper;
import org.apache.ibatis.annotations.Param;
public interface UserMapper extends MyMapper<User> {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}