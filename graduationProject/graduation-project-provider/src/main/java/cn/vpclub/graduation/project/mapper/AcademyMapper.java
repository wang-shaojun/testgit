package cn.vpclub.graduation.project.mapper;

/*
* 描述：学院
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Academy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AcademyMapper {

    //添加学院
    public int add(Academy request);
    //删除学院
    public int delete(Academy request);
    //修改学院
    public int update(Academy request);
    //查询单个学院
    public List<Academy> query(Academy request);
    //查询所有学院
    public List<Academy> selectAll();

}
