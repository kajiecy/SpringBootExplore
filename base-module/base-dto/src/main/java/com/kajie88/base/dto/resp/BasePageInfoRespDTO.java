package com.kajie88.base.dto.resp;

import com.kajie88.base.dto.PageInfo;

/**
 * Created by wangnan on 2016/6/28.
 */
public class BasePageInfoRespDTO<T> extends BaseRespDTO<T> {

    private PageInfo page = new PageInfo();

    public PageInfo getPage() {
        return page;
    }

    public void setPage(PageInfo page) {
        this.page = page;
    }
}
