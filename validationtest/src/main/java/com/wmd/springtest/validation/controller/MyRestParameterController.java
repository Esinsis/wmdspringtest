package com.wmd.springtest.validation.controller;

import com.wmd.springtest.validation.custom.valid.NameValid;
import com.wmd.springtest.validation.requestdomain.ValidInst;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author wengmd
 * @date 19-1-15 下午4:47
 */
@RestController
@RequestMapping("/mytest/rest")
@Validated
public class MyRestParameterController {

    // /mytest/rest/valid/blank?id=abc
    @RequestMapping(value = "/valid/blank", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String validationParameterBlank(@RequestParam(value = "id") @Valid @NotBlank String id) {
        return "hello blank " + id;
    }

    // /mytest/rest/valid/length?id=abc
    @RequestMapping(value = "/valid/length", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String validationParameterLength(@RequestParam(value = "id") @Valid @Size(min = 3, max = 5) String id) {
        return "hello length " + id;
    }
}
