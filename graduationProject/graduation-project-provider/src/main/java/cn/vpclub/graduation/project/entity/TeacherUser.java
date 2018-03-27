package cn.vpclub.graduation.project.entity;

/*
* 描述：教师用户实体
* 作者：王少军
* 日期：2018年03月15日
* */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherUser {

    //教师用户id,主键
    private Long teacheruserid;
    //创建时间
    private Long teacherusercreatedTime;
    //创建人
    private String teacherusercreatedBy;
    //更新时间
    private Long teacheruserupdatedTime;
    //更新人
    private String teacheruserupdatedBy;
    //删除标识（1：未删除，2：已删除）
    private Long teacheruserdeleted;
    //教师用户名称
    private String teacherusername;
    //教师用户密码
    private String teacheruserpwd;
    //教师用户性别
    private String teacherusersex;
    //教师用户年龄
    private Long teacheruserage;
    //教师用户电话
    private Long teacheruserphone;
    //教师用户住址
    private String teacheruseradress;
    //教师用户教学课程id
    private Long teacherusercurriculumid;
    //教师用户所属专业id
    private Long teacheruserspecidtyid;
    //教师用户所属学院id
    private Long teacheruseracademyid;
    //教师用户所属年级
    private String teacherusergrade;
    //权限角色id
    private Long jurisdictionid;
    //团队id
    private Long teamid;
}
