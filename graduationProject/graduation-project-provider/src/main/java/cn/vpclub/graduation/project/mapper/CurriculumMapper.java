package cn.vpclub.graduation.project.mapper;

/*
* 描述：课程
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Curriculum;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CurriculumMapper {

    //添加课程
    public int add(Curriculum request);
    //删除课程
    public int delete(Curriculum request);
    //修改课程
    public int update(Curriculum request);
    //查询单个课程
    public List<Curriculum> query(Curriculum request);
    //查询所有课程
    public List<Curriculum> selectAll();

}
