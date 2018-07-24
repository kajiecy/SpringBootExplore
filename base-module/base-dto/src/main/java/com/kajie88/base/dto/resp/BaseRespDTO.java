package com.kajie88.base.dto.resp;


import com.kajie88.base.dto.PageInfo;
import com.kajie88.base.enums.common.ResponseStatus;
import com.kajie88.base.enums.error.CommonError;
import com.kajie88.base.enums.error.IError;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangnan on 2016/6/21.
 */
public class BaseRespDTO {
    private Map<String,Object> map = new HashMap<>();

    public BaseRespDTO(){
        map.put("respStatus","");
        map.put("errorCode","");
        map.put("errorMsg","");
        map.put("errorMsgCn","");
        map.put("errorTitle","");
    }
    public Map<String,Object> success(){
        map.put("respStatus",ResponseStatus.SUCCESS);
        return map;
    }
    public Map<String,Object> success(Object data){
        map.put("respStatus",ResponseStatus.SUCCESS);
        map.put("data",data);
        return map;
    }
    public Map<String,Object> success(Object data, PageInfo pageInfo){
        map.put("respStatus",ResponseStatus.SUCCESS);
        map.put("data",data);
        map.put("page",pageInfo);
        return map;
    }
    public Map<String,Object> error(String errorMessage){
        map.put("respStatus",ResponseStatus.FAIL);
        map.put("errorCode",CommonError.SYSTEM_ERROR.getErrorCode());
        map.put("errorMsg",errorMessage);
        map.put("errorMsgCn",errorMessage);
        map.put("errorTitle",errorMessage);
        return map;
    }
    public Map<String,Object> error(IError commonError){
        map.put("respStatus",ResponseStatus.FAIL);
        map.put("errorCode",commonError.getErrorCode());
        map.put("errorMsg",commonError.getErrorMsg());
        map.put("errorMsgCn",commonError.getErrorMsgCn());
        map.put("errorTitle",commonError.getErrorTitle());
        return map;
    }
}