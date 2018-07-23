package com.kajie88.user.domain;

import com.github.pagehelper.PageInfo;
import com.kajie88.base.po.User;

public class UserDomain extends User {
    /****** 查询参数 ****/
    //pageInfo需要new初始化
    private PageInfo pageInfo = new PageInfo();

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
