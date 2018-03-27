package cn.vpclub.graduation.project.mapper;

/*
* 描述：团队
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Team;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeamMapper {

    //添加团队
    public int add(Team request);
    //删除团队
    public int delete(Team request);
    //修改团队
    public int update(Team request);
    //查询单个团队
    public List<Team> query(Team request);
    //查询所有团队
    public List<Team> selectAll();

}
