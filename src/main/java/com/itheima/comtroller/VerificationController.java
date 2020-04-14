package com.itheima.comtroller;

import com.itheima.shortMessage.VerificationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("verirfcationCode")
public class VerificationController {
    @Autowired
    private VerificationCode verificationCode;

    @RequestMapping("getVerificationCode")
    public void getVerificationCode(@RequestParam("phone") final String phone){
        verificationCode.verification(phone);
    }
}
