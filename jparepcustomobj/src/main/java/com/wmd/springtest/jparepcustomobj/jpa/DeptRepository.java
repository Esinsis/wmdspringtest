package com.wmd.springtest.jparepcustomobj.jpa;

import com.wmd.springtest.jparepcustomobj.po.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wengmd
 * @date 19-3-2 下午10:34
 */
@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer> {
}
