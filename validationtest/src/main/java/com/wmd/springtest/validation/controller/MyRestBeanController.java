package com.wmd.springtest.validation.controller;

import com.wmd.springtest.validation.requestdomain.ValidInst;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author wengmd
 * @date 19-1-15 下午5:51
 */
@RestController
@RequestMapping("/mytest/rest")
public class MyRestBeanController {
    // /mytest/rest/valid/bean?userId=abc
    @RequestMapping(value = "/valid/bean", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String validationParameterBean(@RequestParam(value = "id2") String id2, @Valid ValidInst validInst) {
        return "hello length " + validInst.getId() + ";" + validInst.getName() + ";" + id2;
    }
}
