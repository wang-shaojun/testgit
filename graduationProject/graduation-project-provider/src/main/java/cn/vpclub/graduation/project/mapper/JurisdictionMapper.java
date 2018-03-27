package cn.vpclub.graduation.project.mapper;

/*
* 描述：权限角色
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.entity.Jurisdiction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JurisdictionMapper {

    //添加权限角色
    public int add(Jurisdiction request);
    //删除权限角色
    public int delete(Jurisdiction request);
    //修改权限角色
    public int update(Jurisdiction request);
    //查询单个权限角色名称
    public List<Jurisdiction> query(Jurisdiction request);
    //查询所有权限角色
    public List<Jurisdiction> selectAll();

}
