package com.itheima.shortMessage;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.sms.v20190711.SmsClient;
import com.tencentcloudapi.sms.v20190711.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20190711.models.SendSmsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


@Component
public class VerificationCode {



    /**
     * 生成验证码
     * @return 返回四位的验证码
     */
    public  String getCode(){
        return (int)((Math.random()*9+1)*1000)+"";
    }

    public  void verification(String phone){

        String vCode=getCode();//验证码

        // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey，见《创建secretId和secretKey》小节
        Credential cred = new Credential("AKIDc3GH6uZpujMksmw1IJ5dwzmKcfS05PEu","bx4vXyA7oFRN7bEdokTxBAtUv62i9LHx");

        // 实例化要请求产品(以cvm为例)的client对象
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setSignMethod(ClientProfile.SIGN_TC3_256);
        SmsClient smsClient = new SmsClient(cred, "ap-chongqing");//第二个ap-chongqing 填产品所在的区
        SendSmsRequest sendSmsRequest = new SendSmsRequest();
        sendSmsRequest.setSmsSdkAppid("1400327988");//appId ,见《创建应用》小节
        String[] phones={"+86"+phone};  //发送短信的目标手机号，可填多个。"+8613837805243"

        sendSmsRequest.setPhoneNumberSet(phones);
        sendSmsRequest.setTemplateID("551359");  //模版id,见《创建短信签名和模版》小节

        String [] templateParam={vCode};//模版参数，从前往后对应的是模版的{1}、{2}等,见《创建短信签名和模版》小节
        sendSmsRequest.setTemplateParamSet(templateParam);
        sendSmsRequest.setSign("萌宠呀呀"); //签名内容，不是填签名id,见《创建短信签名和模版》小节
        try {
            SendSmsResponse sendSmsResponse= smsClient.SendSms(sendSmsRequest); //发送短信
            insertRedisCode(phone,vCode);//验证码设置过期时间
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }
    }


    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    /**
     * 验证码设置过期时间
     * @param phone 作为key 存到redis
     * @param code 生成的验证码
     */
    public void insertRedisCode(String phone,String code){
        redisTemplate.opsForValue().set(phone,code);
        redisTemplate.expire(phone,5, TimeUnit.MINUTES);//设置验证码的有效期为5分钟
    }
}
