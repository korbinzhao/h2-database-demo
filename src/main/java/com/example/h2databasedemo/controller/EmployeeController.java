package com.example.h2databasedemo.controller;

import com.example.h2databasedemo.model.Employee;
import com.example.h2databasedemo.model.ResponseResult;
import com.example.h2databasedemo.model.ResultBean;
import com.example.h2databasedemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employee")
    Optional<Employee> getEmployee(@RequestParam(value="id", defaultValue = "1") Integer id){
        return employeeService.findById(id);
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    ResponseResult saveEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.save(employee);
        ResponseResult result = new ResponseResult(0, "success", null);
        return result;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    Employee updateEmployee(@RequestBody Employee employee){
        Employee updatedEmployee = employeeService.save(employee);
        return updatedEmployee;
    }

    @RequestMapping("/employee/all2")
    ResponseResult getAll2(){
        List<Employee> list = employeeService.findAll();
        return new ResponseResult(0, "success", list);
    }

    @RequestMapping("/employee/all")
    ResultBean getAll(){
        List<Employee> list = employeeService.findAll();

        System.out.println("list: aaa");
        System.out.println(list);

        return new ResultBean("aaa");
    }

    @RequestMapping(value = "/employee", method = RequestMethod.DELETE)
    Map deleteEmployee(@RequestParam(value="id") Integer id){
        employeeService.deleteById(id);
        Map<String, String> status = new HashMap<>();
        status.put("STATUS", "SUCCESS");

        return status;
    }
}
