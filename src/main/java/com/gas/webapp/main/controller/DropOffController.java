package com.gas.webapp.main.controller;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ErrorInfo;
import com.gas.webapp.common.ReturnData;
import com.gas.webapp.main.dropOff.service.DropOffService;
import com.gas.webapp.main.manager.service.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@RequestMapping("/dropOff")
@Controller
public class DropOffController {
    @Resource(name="dropOffService")
    private DropOffService service;

    @RequestMapping(value="/addDropOffData")
    public @ResponseBody
    ReturnData addDropOffData(@RequestBody Map<String, Object> reqMap){
        try {
            return service.addDropOffData(new Criterion((reqMap)));
        } catch(Exception e) {
            e.printStackTrace();
            return new ReturnData(new ErrorInfo("에러발생"));
        }
    }
}
