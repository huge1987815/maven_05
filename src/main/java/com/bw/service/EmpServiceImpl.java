/**
 * Create Date:2019年12月29日
 */
package com.bw.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.EmpDao;
import com.bw.entity.Dept;
import com.bw.entity.Emp;
import com.bw.entity.EmpVo;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年12月29日
 */
@Service
public class EmpServiceImpl implements EmpService {
  @Autowired
  private EmpDao dao;

  /**
   * <br>Description:查询所有员工信息方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月29日
   * @see com.bw.service.EmpService#findAllEmp()
   */
  public List<EmpVo> findAllEmp(Map<String, Object> map) {
    return dao.findAllEmp(map);
  }

  /**
   * <br>Description:查询所有部门 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月30日
   * @see com.bw.service.EmpService#findAllDept()
   */
  @Override
  public List<Dept> findAllDept() {
    return dao.findAllDept();
  }

  /**
   * <br>Description:添加员工信息方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月30日
   * @see com.bw.service.EmpService#addEmp(com.bw.entity.Emp)
   */
  @Override
  public int addEmp(Emp emp) {
    return dao.addEmp(emp);
  }

  /**
   * <br>Description:根据eid查询员工信息方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月30日
   * @see com.bw.service.EmpService#findEmpByEid(java.lang.Integer)
   */
  @Override
  public Emp findEmpByEid(Integer eid) {
    return dao.findEmpByEid(eid);
  }

  /**
   * <br>Description:根据eid修改员工信息方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月30日
   * @see com.bw.service.EmpService#updateEmpByEid(com.bw.entity.Emp)
   */
  @Override
  public int updateEmpByEid(Emp emp) {
    return dao.updateEmpByEid(emp);
  }

  /**
   * <br>Description:根据eid删除员工信息方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月30日
   * @see com.bw.service.EmpService#deleteEmpByEid(java.lang.Integer)
   */
  @Override
  public int deleteEmpByEid(Integer eid) {
    return dao.deleteEmpByEid(eid);
  }

}
