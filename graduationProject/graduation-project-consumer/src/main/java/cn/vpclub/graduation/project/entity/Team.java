package cn.vpclub.graduation.project.entity;

/*
* 描述：团队实体
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.moses.utils.validator.BaseAbstractParameter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team extends BaseAbstractParameter{

    //团队id,主键
    private Long teamid;
    //创建时间
    private Long teamcreatedTime;
    //创建人
    private String teamcreatedBy;
    //更新时间
    private Long teamupdatedTime;
    //更新人
    private String teamupdatedBy;
    //删除标识（1：未删除，2：已删除）
    private Long teamdeleted;
    //团队名称
    private String teamname;

}
