package cn.vpclub.graduation.project.entity;

/*
* 描述：专业实体
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.moses.utils.validator.BaseAbstractParameter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Specidty extends BaseAbstractParameter {

    //专业id,主键
    private Long specidtyid;
    //创建时间
    private Long specidtycreatedTime;
    //创建人
    private String specidtycreatedBy;
    //更新时间
    private Long specidtyupdatedTime;
    //更新人
    private String specidtyupdatedBy;
    //删除标识（1：未删除，2：已删除）
    private Long specidtydeleted;
    //专业名称
    private String specidtyname;

}
