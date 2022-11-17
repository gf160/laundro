package com.gas.webapp.main.manager.service;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ReturnData;

/**
 * Created by GTP on 2022-11-05.
 */
public interface ManagerService {
    ReturnData getProductGroupList(Criterion criterion);
    ReturnData saveProductGroupList(Criterion criterion);
    ReturnData getProductGroupListForList(Criterion criterion);
}
