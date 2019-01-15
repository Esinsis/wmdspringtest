package com.wmd.springtest.validation.controller;

import com.wmd.springtest.validation.custom.valid.NameValid;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author wengmd
 * @date 19-1-15 下午5:52
 */
@RestController
@RequestMapping("/mytest/rest")
@Validated
public class MyRestCustomController {
    // /mytest/rest/valid/custom?name=abc
    @RequestMapping(value = "/valid/custom", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String validationParameterCustom(@RequestParam(value = "name") @Valid @NameValid String name) {
        return "hello custom " + name;
    }
}
