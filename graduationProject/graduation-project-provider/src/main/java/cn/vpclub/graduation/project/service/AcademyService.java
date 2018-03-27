package cn.vpclub.graduation.project.service;

/*
* 描述：学院
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Academy;
import cn.vpclub.moses.core.model.response.BaseResponse;

public interface AcademyService {
    //添加学院
    public BaseResponse add(Academy model);
    //删除学院
    public BaseResponse delete(Academy model);
    //修改学院
    public BaseResponse update(Academy model);
    //查询单条学院
    public BaseResponse query(Academy model);
    //查询所有学院
    public BaseResponse selectAll();
}
