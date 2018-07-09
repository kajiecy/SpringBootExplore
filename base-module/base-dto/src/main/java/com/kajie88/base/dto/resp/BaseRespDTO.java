package com.kajie88.base.dto.resp;


import com.kajie88.base.enums.ResponseStatus;

/**
 * Created by wangnan on 2016/6/21.
 */
public class BaseRespDTO<T> {

    private ResponseStatus respStatus = ResponseStatus.SUCCESS;
    private String errorCode;
    private String errorMsg;
    private String errorMsgCn;
    private String errorTitle;
    private T data;

    public ResponseStatus getRespStatus() {
        return respStatus;
    }

    public void setRespStatus(ResponseStatus respStatus) {
        this.respStatus = respStatus;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsgCn() {
        return errorMsgCn;
    }

    public void setErrorMsgCn(String errorMsgCn) {
        this.errorMsgCn = errorMsgCn;
    }


    public String getErrorTitle() {
        return errorTitle;
    }

    public void setErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
    }


    public T getData(){
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}