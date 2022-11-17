package com.gas.webapp.main.smsSendHist.persistence;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository("smsSendHistMapper")
public interface SmsSendHistMapper {
    int insertSmsSendHistData(Map<String, Object> _map);
}
