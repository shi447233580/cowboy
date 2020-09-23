package com.cowboy.cowboy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ss
 * @date 2020年9月23日01:43:19
 * @desc 用来做页面跳转的controller
 */
@Controller
public class ForwardController {


    /**
     * 跳转至首页
     *
     * @return
     */
    @RequestMapping("/index")
    public String toIndex() {
        return "index";

    }

    /**
     * 上传头像页面
     */
    @RequestMapping("/uploadHeadImg")
    public String uploadHeadImg() {
        return "uploadImg";
    }

}
