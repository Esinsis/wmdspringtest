package com.wmd.springtest.jparepcustomobj.service.impl;

import com.wmd.springtest.jparepcustomobj.domain.UserDept;
import com.wmd.springtest.jparepcustomobj.jpa.DeptRepository;
import com.wmd.springtest.jparepcustomobj.jpa.UserRepository;
import com.wmd.springtest.jparepcustomobj.po.Dept;
import com.wmd.springtest.jparepcustomobj.po.User;
import com.wmd.springtest.jparepcustomobj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * @author wengmd
 * @date 19-3-3 下午4:31
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    DeptRepository deptRepository;

    @PostConstruct
    private void initData() {
        Dept dept = new Dept();
        dept.setId(0);
        dept.setName("XXX公司");
        dept.setUpId(-1);
        deptRepository.save(dept);

        dept = new Dept();
        dept.setId(1);
        dept.setName("人事部");
        dept.setUpId(0);
        deptRepository.save(dept);

        dept = new Dept();
        dept.setId(2);
        dept.setName("财务部");
        dept.setUpId(0);
        deptRepository.save(dept);

        dept = new Dept();
        dept.setId(3);
        dept.setName("研发部");
        dept.setUpId(0);
        deptRepository.save(dept);

        //////////////////////////////
        User user = new User();
        user.setId(0);
        user.setName("员工11");
        user.setDeptId(1);
        userRepository.save(user);

        user = new User();
        user.setId(0);
        user.setName("员工11");
        user.setDeptId(1);
        userRepository.save(user);

        user = new User();
        user.setId(1);
        user.setName("员工12");
        user.setDeptId(1);
        userRepository.save(user);

        user = new User();
        user.setId(2);
        user.setName("员工21");
        user.setDeptId(2);
        userRepository.save(user);

        user = new User();
        user.setId(1);
        user.setName("员工12");
        user.setDeptId(2);
        userRepository.save(user);

        user = new User();
        user.setId(3);
        user.setName("员工31");
        user.setDeptId(3);
        userRepository.save(user);

        user = new User();
        user.setId(4);
        user.setName("员工32");
        user.setDeptId(3);
        userRepository.save(user);
    }

    @Override
    public List<UserDept> findAllForUserDept() {
        return userRepository.findAllForUserDept();
    }

    @Override
    public List<Map<String, Object>> findAllForMap() {
        return userRepository.findAllForMap();
    }
}
