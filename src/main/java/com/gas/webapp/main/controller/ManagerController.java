package com.gas.webapp.main.controller;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ErrorInfo;
import com.gas.webapp.common.ReturnData;
import com.gas.webapp.main.manager.service.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by GTP on 2022-11-05.
 */
@RequestMapping("/manager")
@Controller
public class ManagerController {
    @Resource(name="managerService")
    private ManagerService service;

    @RequestMapping(value="/getProductGroupList")
    public @ResponseBody
    ReturnData getProductGroupList(@RequestParam Map<String, Object> reqMap){
        try {
            return service.getProductGroupList(new Criterion((reqMap)));
        } catch(Exception e) {
            e.printStackTrace();
            return new ReturnData(new ErrorInfo("에러발생"));
        }
    }

    @RequestMapping(value = "/saveProductGroupList", method = RequestMethod.POST)
    public @ResponseBody ReturnData saveProductGroupList(@RequestBody Map<String, Object> reqMap) {
        try {
            Criterion criterion = new Criterion(reqMap);
            return service.saveProductGroupList(criterion);
        } catch (Exception e) {
            e.printStackTrace();
            return new ReturnData(new ErrorInfo("에러발생"));
        }
    }

    @RequestMapping(value="/getProductGroupListForList")
    public @ResponseBody
    ReturnData getProductGroupListForList(@RequestParam Map<String, Object> reqMap){
        try {
            return service.getProductGroupListForList(new Criterion((reqMap)));
        } catch(Exception e) {
            e.printStackTrace();
            return new ReturnData(new ErrorInfo("에러발생"));
        }
    }


}
