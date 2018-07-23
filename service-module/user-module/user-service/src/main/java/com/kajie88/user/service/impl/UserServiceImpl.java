package com.kajie88.user.service.impl;


import com.kajie88.base.dao.UserMapper;
import com.kajie88.base.po.User;
import com.kajie88.base.po.UserExample;
import com.kajie88.base.utils.CollectionUtils;
import com.kajie88.base.utils.StringUtil;
import com.kajie88.user.domain.UserDomain;
import com.kajie88.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public List<UserDomain> getUserList(UserDomain domain) {

////        Page<Object> objects = PageHelper.startPage(domain.getPageInfo());
//        //1.第一步，声明返回
        List<UserDomain> resultDomains = new ArrayList();
//        //2.第二步，判断查询条件,不仅要根据domain中的特殊查询定义，且要把UserInfo的字段判断（如domain中有特殊定义字段的查询方式，则根据domain中的来）
//        UserExample example = new UserExample();
//        //2.2 把字段参数带入
//        UserExample.Criteria criteria = example.createCriteria();
//        if(!StringUtil.isEmptyForTrim(domain.getId())){
//            criteria.andIdEqualTo(domain.getId());
//        }
//        if(!StringUtil.isEmptyForTrim(domain.getName())){
//            criteria.andNameEqualTo(domain.getName());
//        }
//
//        //3.第三步，开始进行db查询
//        List<User> parentList = mapper.selectByExample(example);
//        CollectionUtils.copyProperties(parentList,resultDomains,UserDomain.class);

        User user = mapper.selectByPrimaryKey(1);
        return resultDomains;
    }
}
