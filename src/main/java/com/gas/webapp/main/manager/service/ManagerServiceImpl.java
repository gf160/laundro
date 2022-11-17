package com.gas.webapp.main.manager.service;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ReturnData;
import com.gas.webapp.main.manager.persistence.ManagerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GTP on 2022-11-05.
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

    //Mapper의 레파지토리명하고 같아야함
    @Resource(name = "managerMapper")
    ManagerMapper mapper;

    @Override
    public ReturnData getProductGroupList(Criterion criterion) {
        return new ReturnData(mapper.selectProductGroupList(criterion.getCondition()));
    }

    @Override
    public ReturnData saveProductGroupList(Criterion criterion) {
        ReturnData returnData = new ReturnData();
        mapper.saveProductGroupList(criterion.getCondition());
        returnData.setResultData("저장됐습니다.");
        return returnData;
    }

    @Override
    public ReturnData getProductGroupListForList(Criterion criterion) {
        return new ReturnData(mapper.selectProductGroupListForList(criterion.getCondition()));
    }
}
