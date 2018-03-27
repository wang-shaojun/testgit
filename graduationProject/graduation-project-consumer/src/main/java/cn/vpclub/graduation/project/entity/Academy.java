package cn.vpclub.graduation.project.entity;

/*
* 描述：学院实体
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.moses.utils.validator.BaseAbstractParameter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Academy extends BaseAbstractParameter {

    //学院id,主键
    private Long academyid;
    //创建时间
    private Long academycreatedTime;
    //创建人
    private String academycreatedBy;
    //更新时间
    private Long academyupdatedTime;
    //更新人
    private String academyupdatedBy;
    //删除标识（1：未删除，2：已删除）
    private Long academydeleted;
    //学院名称
    private String academyname;

}
