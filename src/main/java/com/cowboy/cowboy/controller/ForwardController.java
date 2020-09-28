package com.cowboy.cowboy.controller;

import com.cowboy.cowboy.dao.ClerkInfoMapper;
import com.cowboy.cowboy.model.ClerkInfo;
import com.cowboy.cowboy.model.ClerkInfoExample;
import com.cowboy.cowboy.response.ApiResponse;
import com.cowboy.cowboy.response.ResponseStatus;
import com.feilong.core.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ss
 * @date 2020年9月23日01:43:19
 * @desc 用来做页面跳转的controller
 */
@Controller
public class ForwardController {

    @Autowired
    private ClerkInfoMapper clerkInfoMapper;


    /**
     * 跳转至首页
     *
     * @return
     */
    @RequestMapping("/index")
    public String toIndex(HttpServletRequest request) {
        ClerkInfoExample clerkInfoExample = new ClerkInfoExample();
        clerkInfoExample.createCriteria().andClkIdIsNotNull();
        List<ClerkInfo> lsit = clerkInfoMapper.selectByExample(clerkInfoExample);
        ClerkInfoExample clerkInfoExample2 = new ClerkInfoExample();
        clerkInfoExample2.createCriteria().andClkIdIsNotNull();
        clerkInfoExample2.setOrderByClause("create_time");
        List<ClerkInfo> lsit2 = clerkInfoMapper.selectByExample(clerkInfoExample);

        if(lsit2.size()>9){
        List newList = lsit2.subList(0, 9);
        request.setAttribute("newclerklsit",newList);
        }else{
            request.setAttribute("newclerklsit",lsit2);
        }
        if(lsit.size()>8){
            List newList2 = lsit2.subList(0, 8);
            request.setAttribute("clerklsit",newList2);
        }else{
            request.setAttribute("clerklsit",lsit);
        }

        return "index";

    }

    /**
     * 查看成员
     *
     * @return
     */
    //获取列表
    @RequestMapping(value = "/prof{id}")
    public String getFormList(HttpServletRequest request, @PathVariable("id") long id ) {
        ClerkInfoExample clerkInfoExample = new ClerkInfoExample();
        clerkInfoExample.createCriteria().andClkIdEqualTo(id);
        List<ClerkInfo> lsit = clerkInfoMapper.selectByExample(clerkInfoExample);
        if (Validator.isNullOrEmpty(lsit)) {
            return "index";
        }
        request.setAttribute("clerk",lsit.get(0));
        return "clerk";
    }


    /**
     * 查看所以成员
     *
     * @return
     */
    //获取列表
    @RequestMapping(value = "/Allprof")
    public String getAllFormList(HttpServletRequest request) {
        ClerkInfoExample clerkInfoExample = new ClerkInfoExample();
        clerkInfoExample.createCriteria().andClkIdIsNotNull();
        List<ClerkInfo> lsit = clerkInfoMapper.selectByExample(clerkInfoExample);
        if (Validator.isNullOrEmpty(lsit)) {
            return "index";
        }
        request.setAttribute("allclerk",lsit.get(0));
        return "clerkgroup";
    }
}
