package com.itheima.service;

import java.util.Map;

public interface VerificationService {
    /**
     * 获取前台的验证码和手机号进行比较
     * @param phone
     * @param code
     */
    Map<String,Object> IsExistsCode(String phone, String code);
}
