package com.lsy.aicodelearning.controller;

import com.lsy.aicodelearning.common.BaseResponse;
import com.lsy.aicodelearning.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    @RequestMapping("/check")
    public BaseResponse<String> check(){
        return ResultUtils.success("success");
    }
}
