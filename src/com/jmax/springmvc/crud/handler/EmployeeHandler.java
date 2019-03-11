package com.jmax.springmvc.crud.handler;

import com.jmax.springmvc.crud.dao.DepartmentDao;
import com.jmax.springmvc.crud.dao.EmployeeDao;
import com.jmax.springmvc.crud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Jmin
 * @DAte: 2019/3/11
 * @Description: com.jmax.springmvc.crud.handler
 * @version: 1.0
 */
@Controller
public class EmployeeHandler {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping(value = "/emps")
    public String list(Map<String,Object> map){
        map.put("employees",employeeDao.getAll());
        return "list";
    }

    @RequestMapping(value = "/emp" ,method = RequestMethod.GET)
    public String input(Map<String,Object> map){
        map.put("departments",departmentDao.getDepartments());
        Map<String,String> genders = new HashMap<>();
        genders.put("0","Female");
        genders.put("1","Male");
        map.put("employee",new Employee());  //一般从数据库中读取用户
        map.put("genders",genders);
        return "input";
    }

   /* @RequestMapping(value = "/emp")
    public String delete(){

    }*/
}
