package com.gas.webapp.common.controller;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.main.dropOff.dto.UserInfoDto;
import com.gas.webapp.main.dropOff.service.DropOffService;
import com.gas.webapp.main.smsSendHist.service.SmsSendHistService;
import com.gas.webapp.main.userInfo.service.UserInfoService;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
public class SmsSendController {

    private Logger logger = Logger.getLogger(SmsSendController.class);

    @Resource(name="userInfoService")
    private UserInfoService service;

    @Resource(name="smsSendHistService")
    private SmsSendHistService smsSendHistService;

    @Scheduled(cron="0 * * * * *")//매분 실행
    public void scheduleTest() {
        logger.debug("schedule run");
        List<UserInfoDto> _list = (List<UserInfoDto>)service.getUserInfoList(new Criterion()).getResultData();

        //문자 메세지 보내기
        if(_list.size() > 0){
            for(UserInfoDto _item : _list){
                Map<String, Object> _paramMap = new HashMap<>();
                Random random = new Random();
                int num = random.nextInt(2) + 1;
                long userNo = _item.getUserNo();
                String userName = _item.getUserName();
                String userNumber = _item.getUserNumber();

                _paramMap.put("userNo", userNo);
                _paramMap.put("sendResult", num);

                if(num == 1){//성공
                    logger.debug("[" + userNumber + "] 메세지 전송 성공");
                } else {
                    logger.debug("[" + userNumber + "] 메세지 전송 실패");
                    _paramMap.put("failCode", "0000");
                    _paramMap.put("failMessage", "테스트|테스트");
                }

                smsSendHistService.addSmsSendHistData(new Criterion(_paramMap));
            }//for each()

            logger.debug("schedule end");
        } else {
            logger.debug("user is empty");
        }
    }


}
