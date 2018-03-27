package cn.vpclub.graduation.project.service;

/*
* 描述：公告消息
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Notice;
import cn.vpclub.moses.core.model.response.BaseResponse;

public interface NoticeService {
    //添加公告消息
    public BaseResponse add(Notice model);
    //删除公告消息
    public BaseResponse delete(Notice model);
    //修改公告消息
    public BaseResponse update(Notice model);
    //查询单条公告消息
    public BaseResponse query(Notice model);
    //查询所有公告消息
    public BaseResponse selectAll();
}
