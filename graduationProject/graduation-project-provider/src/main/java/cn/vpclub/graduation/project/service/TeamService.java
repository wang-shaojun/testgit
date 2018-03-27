package cn.vpclub.graduation.project.service;

/*
* 描述：团队
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Team;
import cn.vpclub.moses.core.model.response.BaseResponse;

public interface TeamService {
    //添加团队
    public BaseResponse add(Team model);
    //删除团队
    public BaseResponse delete(Team model);
    //修改团队
    public BaseResponse update(Team model);
    //查询单条团队
    public BaseResponse query(Team model);
    //查询所有团队
    public BaseResponse selectAll();
}
