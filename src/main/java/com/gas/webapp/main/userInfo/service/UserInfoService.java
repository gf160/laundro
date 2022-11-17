package com.gas.webapp.main.userInfo.service;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ReturnData;

public interface UserInfoService {
    ReturnData getUserInfoList(Criterion criterion);
}
