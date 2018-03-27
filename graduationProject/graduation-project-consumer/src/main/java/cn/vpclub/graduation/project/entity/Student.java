package cn.vpclub.graduation.project.entity;

/*
* 描述：学生实体
* 作者：王少军
* 日期：2018年03月15日
* */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    //学生id,主键
    private Long studentid;
    //创建时间
    private Long studentcreated_time;
    //创建人
    private String studentcreated_by;
    //更新时间
    private Long studentupdated_time;
    //更新人
    private String studentupdated_by;
    //删除标识（1：未删除，2：已删除）
    private Long studentdeleted;
    //学生名称
    private String studentname;
    //学生性别
    private String studentsex;
    //学生年龄
    private Long studentage;
    //学生电话
    private Long studentphone;
    //学生住址
    private String studentadress;
    //学生所属专业id
    private Long studentspecidtyid;
    //学生所属学院id
    private Long studentacademyid;
    //学生所属年级
    private String studentgrade;
    //教师用户id
    private Long teacheruserid;


}
