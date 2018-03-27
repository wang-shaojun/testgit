package cn.vpclub.graduation.project.service;

/*
* 描述：专业
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Specidty;
import cn.vpclub.moses.core.model.response.BaseResponse;

public interface SpecidtyService {
    //添加专业
    public BaseResponse add(Specidty model);
    //删除专业
    public BaseResponse delete(Specidty model);
    //修改专业
    public BaseResponse update(Specidty model);
    //查询单条专业
    public BaseResponse query(Specidty model);
    //查询所有专业
    public BaseResponse selectAll();
}
