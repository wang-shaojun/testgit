package cn.vpclub.graduation.project.entity;

/*
* 描述：课程实体
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.moses.utils.validator.BaseAbstractParameter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curriculum extends BaseAbstractParameter {

    //课程id,主键
    private Long curriculumid;
    //创建时间
    private Long curriculumcreatedTime;
    //创建人
    private String curriculumcreatedBy;
    //更新时间
    private Long curriculumupdatedTime;
    //更新人
    private String curriculumupdatedBy;
    //删除标识（1：未删除，2：已删除）
    private Long curriculumdeleted;
    //课程名称
    private String curriculumname;

}
