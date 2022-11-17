package com.gas.webapp.main.userInfo.service;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ReturnData;
import com.gas.webapp.main.userInfo.persistence.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{
    @Resource(name = "userInfoMapper")
    UserInfoMapper mapper;

    @Override
    public ReturnData getUserInfoList(Criterion criterion) {
        return new ReturnData(mapper.selectUserInfoList());
    }
}
