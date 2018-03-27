package cn.vpclub.graduation.project.service;

/*
* 描述：权限角色
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.entity.Jurisdiction;
import cn.vpclub.moses.core.model.response.BaseResponse;

public interface JurisdictionService {
    //添加权限角色
    public BaseResponse add(Jurisdiction model);
    //删除权限角色
    public BaseResponse delete(Jurisdiction model);
    //修改权限角色
    public BaseResponse update(Jurisdiction model);
    //查询单条权限角色名称
    public BaseResponse query(Jurisdiction model);
    //查询所有权限角色
    public BaseResponse selectAll();
}
