package com.gas.webapp.main.sample.service;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ReturnData;
import com.gas.webapp.main.sample.persistence.SampleMapper;
import org.springframework.stereotype.Service;
import com.gas.webapp.main.sample.dto.SampleDto;

import javax.annotation.Resource;

/**
 * Created by Leeyouje on 2022-10-31.
 */
@Service("sampleService")
public class SampleServiceImpl implements SampleService {

    //Mapper의 레파지토리명하고 같아야함
    @Resource(name = "sampleMapper")
    SampleMapper mapper;

    @Override
    public ReturnData getSampleList(Criterion criterion) {
        return new ReturnData(mapper.selectSampleList(criterion.getCondition()));
    }
}
