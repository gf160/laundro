package com.gas.webapp.main.smsSendHist.service;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ReturnData;
import com.gas.webapp.main.smsSendHist.persistence.SmsSendHistMapper;
import com.gas.webapp.main.userInfo.persistence.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("smsSendHistService")
public class SmsSendHistServiceImpl implements SmsSendHistService{

    @Resource(name = "smsSendHistMapper")
    SmsSendHistMapper mapper;

    @Override
    public ReturnData addSmsSendHistData(Criterion criterion) {
        return new ReturnData(mapper.insertSmsSendHistData(criterion.getCondition()));
    }
}
