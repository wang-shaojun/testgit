package cn.vpclub.graduation.project.service;

/*
* 描述：教师用户service接口
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.entity.TeacherUser;
import cn.vpclub.moses.core.model.response.BaseResponse;


public interface TeacherUserService {
    //添加教师用户
    public BaseResponse add(TeacherUser model);
    //删除教师用户
    public BaseResponse delete(TeacherUser model);
    //修改教师用户
    public BaseResponse update(TeacherUser model);
    //查询单条教师用户
    public BaseResponse query(TeacherUser model);
    //查询所有教师用户
    public BaseResponse selectAll();
    //登录验证
    public BaseResponse login(TeacherUser model);
    //根据姓名查询id
    public BaseResponse queryId(TeacherUser model);
    //根据团队id查询用户
    public BaseResponse selectByTeamId(TeacherUser model);
}
