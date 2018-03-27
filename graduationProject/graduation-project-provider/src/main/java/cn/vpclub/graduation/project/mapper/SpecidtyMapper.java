package cn.vpclub.graduation.project.mapper;

/*
* 描述：专业
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Specidty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SpecidtyMapper {

    //添加专业
    public int add(Specidty request);
    //删除专业
    public int delete(Specidty request);
    //修改专业
    public int update(Specidty request);
    //查询单个专业
    public List<Specidty> query(Specidty request);
    //查询所有专业
    public List<Specidty> selectAll();

}
