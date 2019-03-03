package com.wmd.springtest.jparepcustomobj.service;

import com.wmd.springtest.jparepcustomobj.domain.UserDept;

import java.util.List;
import java.util.Map;

/**
 * @author wengmd
 * @date 19-3-3 下午4:31
 */
public interface UserService {
    List<UserDept> findAllForUserDept();

    List<Map<String, Object>> findAllForMap();
}
