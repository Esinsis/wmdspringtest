package com.wmd.springtest.jparepcustomobj.jpa;

import com.wmd.springtest.jparepcustomobj.domain.UserDept;
import com.wmd.springtest.jparepcustomobj.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author wengmd
 * @date 19-3-2 下午10:34
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select new com.wmd.springtest.jparepcustomobj.domain.UserDept(" +
            "u.id, u.name, d.id, d.name" +
            ") " +
            "from User u, Dept d " +
            "where u.deptId=d.id")
    List<UserDept> findAllForUserDept();

    @Query("select new map(" +
            "u.id as user_id, u.name as user_name, d.id as dept_id, d.name as dept_name" +
            ") " +
            "from User u, Dept d " +
            "where u.deptId=d.id")
    List<Map<String, Object>> findAllForMap();
}
