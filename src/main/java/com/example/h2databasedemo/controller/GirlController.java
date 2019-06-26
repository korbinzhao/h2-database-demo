package com.example.h2databasedemo.controller;

import com.example.h2databasedemo.model.Girl;
import com.example.h2databasedemo.model.Result;
import com.example.h2databasedemo.services.GirlService;
import com.example.h2databasedemo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class GirlController {

    @Autowired
    private GirlService girlService;

    /**
     * 添加一个女生
     * @return
     */
    @RequestMapping(value = "/girls", method = RequestMethod.POST)
    public Result<Girl> girlAdd(@Valid @RequestBody Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtil.success(girlService.save(girl));
    }


    /**
     * 查询所有女生
     * @return
     */
    @RequestMapping(value = "/girls", method = RequestMethod.GET)
    public Result<Girl> girlAdd() {
//        if (bindingResult.hasErrors()) {
//            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
//        }

        return ResultUtil.success(girlService.findAll());
    }
}
