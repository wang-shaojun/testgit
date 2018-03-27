package cn.vpclub.graduation.project.entity;

/*
* 描述：中间表实体
* 作者：王少军
* 日期：2018年03月15日
* */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Middle {

    //中间表id,主键
    private Long middleid;
    //权限角色id
    private Long jurisdictionid;
    //权限操作i
    private Long operationid;
}
