package cn.vpclub.graduation.project.entity;

/*
* 描述：权限角色实体
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.moses.utils.validator.BaseAbstractParameter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jurisdiction extends BaseAbstractParameter{

    //权限角色id,主键
    private Long jurisdictionid;
    //创建时间
    private Long jurisdictioncreatedTime;
    //创建人
    private String jurisdictioncreatedBy;
    //更新时间
    private Long jurisdictionupdatedTime;
    //更新人
    private String jurisdictionupdatedBy;
    //删除标识（1：未删除，2：已删除）
    private Long jurisdictiondeleted;
    //限角色名称
    private String jurisdictionname;

}
