package com.zy.demo.t_user.controller;


import com.zy.demo.common.R;
import com.zy.demo.t_user.entity.User;
import com.zy.demo.t_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2022-02-10
 */
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public R getAll(){
        List<User> list = userService.list(null);

        return R.ok().data("list",list);
    }

}

