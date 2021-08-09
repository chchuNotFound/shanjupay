package com.shanjupay.common.domain;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 自定义的业务异常处理器：错误响应包装类
 * @author Administrator
 * @version 1.0
 **/
@ApiModel(value = "RestErrorResponse", description = "错误响应参数包装")
@Data
public class RestErrorResponse {

    private String errCode;

    private String errMessage;

    public RestErrorResponse(String errCode,String errMessage){
        this.errCode = errCode;
        this.errMessage= errMessage;
    }


}
