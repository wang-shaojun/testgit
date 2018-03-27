package cn.vpclub.graduation.project.mapper;

/*
* 描述：公告消息
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {

    //添加公告消息
    public int add(Notice request);
    //删除公告消息
    public int delete(Notice request);
    //修改公告消息
    public int update(Notice request);
    //查询单个公告消息
    public List<Notice> query(Notice request);
    //查询所有公告消息
    public List<Notice> selectAll();

}
