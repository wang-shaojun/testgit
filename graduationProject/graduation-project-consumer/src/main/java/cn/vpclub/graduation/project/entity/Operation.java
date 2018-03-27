package cn.vpclub.graduation.project.entity;

/*
* 描述：权限操作实体
* 作者：王少军
* 日期：2018年03月15日
* */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operation {

    //权限操作id,主键
    private Long operationid;
    //权限操作名称
    private String operationname;
    //中间表id
    private Long middleid;

}
