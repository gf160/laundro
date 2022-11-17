package com.gas.webapp.main.controller;

import com.gas.webapp.common.Criterion;
import com.gas.webapp.common.ErrorInfo;
import com.gas.webapp.common.ReturnData;
import com.gas.webapp.main.sample.service.SampleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Leeyouje on 2022-10-31.
 */
@RequestMapping("/main/sample")
@Controller
public class SampleController {
    @Resource(name="sampleService")
    private SampleService service;

    @RequestMapping(value="/getSampleList")
    public @ResponseBody
    ReturnData getSampleList(@RequestParam Map<String, Object> reqMap){
        try {
            return service.getSampleList(new Criterion((reqMap)));
        } catch(Exception e) {
            e.printStackTrace();
            return new ReturnData(new ErrorInfo("에러발생"));
        }
    }
}
