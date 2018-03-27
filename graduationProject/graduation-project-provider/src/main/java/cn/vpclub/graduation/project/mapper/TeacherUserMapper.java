package cn.vpclub.graduation.project.mapper;

/*
* 描述：教师用户mapper方法
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.entity.TeacherUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherUserMapper {

    //添加教师用户
    public int add(TeacherUser request);
    //删除教师用户
    public int delete(TeacherUser request);
    //修改教师用户
    public int update(TeacherUser request);
    //查询单个教师用户
    public List<TeacherUser> query(TeacherUser request);
    //查询所有教师用户
    public List<TeacherUser> selectAll();
    //登录验证
    public TeacherUser login(TeacherUser request);
    //根据姓名查询id
    public List<TeacherUser> queryId(TeacherUser request);
    //根据团队id查询用户
    public List<TeacherUser> selectByTeamId(TeacherUser request);
}
