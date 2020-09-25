package com.cowboy.cowboy.controller;

import com.cowboy.cowboy.manager.ForumManager;
import com.cowboy.cowboy.model.Reservation;
import com.cowboy.cowboy.response.ApiResponse;
import com.cowboy.cowboy.response.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yuan.shi
 * @date 2020年5月11日01:43:19
 * @desc 预约
 */
@Controller
public class ForumController {

    @Autowired
    private ForumManager forumManager;
    //富文本上传后台
    @RequestMapping(value = "/upload", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ApiResponse<Object> upload(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "chioce") String chioce, @RequestParam("time") String time, @RequestParam("number") Integer number, @RequestParam("name") String name) {
        Reservation reservation = new Reservation();
        reservation.setName(name);
        reservation.setPhone(number);
        reservation.setTime(time);
        reservation.setChoice(chioce);
        forumManager.saveFroum(reservation);
        return ApiResponse.build(ResponseStatus.SUCCESS, "1");
    }


//    //获取列表
//    @RequestMapping(value = "/forumList/{type}")
//    public String getFormList(HttpServletRequest request, @PathVariable("type") String type) {
//        if (Validator.isNullOrEmpty(type)) {
//            type = "1";
//        }
//        List<CommunityArticles> communityArticles = forumManager.selectForum(Integer.parseInt(type));
//        if (Validator.isNullOrEmpty(communityArticles)) {
//            return "communityPage";
//        }
//        request.setAttribute("communityArticles",communityArticles);
//        return "community";
//    }

//    //获取内容
//    @RequestMapping(value = "/forum.htm", method = {RequestMethod.GET})
//    public String getForm(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "id") String id) {
//
//        request.setAttribute("communityArticle","");
//        request.setAttribute("articleMessageBoardMap","");
//
//        return "forum";
//    }

//    //发表评论
//    @RequestMapping(value = "/forum/save", method = {RequestMethod.POST})
//    @ResponseBody
//    public ApiResponse<Object> saveArticleMwssageBoard(HttpServletRequest request, HttpServletResponse response,@RequestBody ArticleMessageBoard articleMessageBoard){
//        if(Validator.isNullOrEmpty(articleMessageBoard)){
//                return ApiResponse.build(ResponseStatus.FAIL, "");
//        }
//        articleMessageBoard.setVersion(new Date());
//        UserInfo userInfo = (UserInfo)request.getSession().getAttribute(UserConstant.LOGIN_PHONE);
//        if(userInfo.getRoleId().equals(2L)){
//            articleMessageBoard.setSort(1);
//        }else {
//            articleMessageBoard.setSort(0);
//        }
//        int i = forumManager.saveArticleList(articleMessageBoard);
//        if(i>0){
//            return ApiResponse.build(ResponseStatus.SUCCESS, i);
//        }
//        return ApiResponse.build(ResponseStatus.FAIL, "");
//    }


}