package cn.vpclub.graduation.project.web;

/*
* 描述：教师用户
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.entity.TeacherUser;
import cn.vpclub.graduation.project.service.TeacherUserService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/graduation/teacheruser")
public class TeacherUserController {
    @Autowired
    private TeacherUserService service;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public BaseResponse add(@RequestBody TeacherUser vo)
    {
        return service.add(vo);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public BaseResponse delete(@RequestBody TeacherUser vo)
    {
        return service.delete(vo);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public BaseResponse update(@RequestBody TeacherUser vo)
    {
        return service.update(vo);
    }

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public BaseResponse query(@RequestBody TeacherUser vo)
    {
        return service.query(vo);
    }

    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    public BaseResponse selectAll(@RequestBody TeacherUser vo)
    {
        return service.selectAll(vo);
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BaseResponse login(@RequestBody TeacherUser vo)
    {
        return service.login(vo);
    }

    @RequestMapping(value = "/queryId",method = RequestMethod.POST)
    public BaseResponse queryId(@RequestBody TeacherUser vo)
    {
        return service.queryId(vo);
    }

    @RequestMapping(value = "/selectByTeamId",method = RequestMethod.POST)
    public BaseResponse selectByTeamId(@RequestBody TeacherUser vo)
    {
        return service.selectByTeamId(vo);
    }
}
