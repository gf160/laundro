package com.gas.webapp.main.smsSendHist.service;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ReturnData;

public interface SmsSendHistService {
    ReturnData addSmsSendHistData(Criterion criterion);
}
