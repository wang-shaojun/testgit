package cn.vpclub.graduation.project.service;

/*
* 描述：课程
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Curriculum;
import cn.vpclub.moses.core.model.response.BaseResponse;

public interface CurriculumService {
    //添加课程
    public BaseResponse add(Curriculum model);
    //删除课程
    public BaseResponse delete(Curriculum model);
    //修改课程
    public BaseResponse update(Curriculum model);
    //查询单条课程
    public BaseResponse query(Curriculum model);
    //查询所有课程
    public BaseResponse selectAll();
}
