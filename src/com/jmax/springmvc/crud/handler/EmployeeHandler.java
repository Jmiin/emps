package com.jmax.springmvc.crud.handler;

import com.jmax.springmvc.crud.dao.EmployeeDao;
import com.jmax.springmvc.crud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping(value = "/emps")
    public String list(Map<String,Object> map){
        map.put("employees",employeeDao.getAll());
        return "list";
    }
}
