package com.gas.webapp.main.dropOff.service;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ReturnData;
import com.gas.webapp.main.dropOff.persistence.DropOffMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("dropOffService")
public class DropOffServiceImpl implements DropOffService{

    @Resource(name = "dropOffMapper")
    DropOffMapper mapper;

    @Override
    public ReturnData addDropOffData(Criterion criterion) {
        return new ReturnData(mapper.insertDropOffData(criterion.getCondition()));
    }
}
