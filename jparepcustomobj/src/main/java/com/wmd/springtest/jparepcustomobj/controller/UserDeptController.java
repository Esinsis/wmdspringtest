package com.wmd.springtest.jparepcustomobj.controller;

import com.wmd.springtest.jparepcustomobj.domain.UserDept;
import com.wmd.springtest.jparepcustomobj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author wengmd
 * @date 19-3-2 下午10:36
 */
@RestController
public class UserDeptController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/rest/user/custom/rspobj", method = RequestMethod.GET, produces = "application/json")
    List<UserDept> findAllForUserDept() {
        return userService.findAllForUserDept();
    }

    @RequestMapping(value = "/rest/user/custom/map", method = RequestMethod.GET, produces = "application/json")
    List<Map<String, Object>> findAllForMap() {
        return userService.findAllForMap();
    }
}
