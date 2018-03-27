package cn.vpclub.graduation.project.entity;

/*
* 描述：公告消息实体
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.moses.utils.validator.BaseAbstractParameter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notice extends BaseAbstractParameter {

    //公告id,主键
    private Long noticeid;
    //创建时间
    private Long noticecreatedTime;
    //创建人
    private String noticecreatedBy;
    //更新时间
    private Long noticeupdatedTime;
    //更新人
    private String noticeupdatedBy;
    //删除标识（1：未删除，2：已删除）
    private Long noticedeleted;
    //公告标题
    private String noticetitle;
    //公告内容
    private String noticecontent;
    //教师用户id
    private Long teacheruserid;

}
