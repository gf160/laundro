package com.gas.webapp.main.sample.service;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ReturnData;

import java.util.List;
import java.util.Map;

/**
 * Created by Leeyouje on 2022-10-31.
 */
public interface SampleService {
    ReturnData getSampleList(Criterion criterion);
}
