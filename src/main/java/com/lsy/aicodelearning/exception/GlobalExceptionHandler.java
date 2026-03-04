package com.lsy.aicodelearning.exception;

import com.lsy.aicodelearning.common.BaseResponse;
import com.lsy.aicodelearning.common.ResultUtils;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Hidden                     //swagger不显示
@RestControllerAdvice       //全局异常捕获与处理
@Slf4j          //用作日志输出
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)          //自定义业务异常
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)           //运行时异常
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误");
    }
}
