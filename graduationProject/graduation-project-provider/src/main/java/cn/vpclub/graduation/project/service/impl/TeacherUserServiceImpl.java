package cn.vpclub.graduation.project.service.impl;

/*
* 描述：教师用户实体
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.entity.TeacherUser;
import cn.vpclub.graduation.project.mapper.TeacherUserMapper;
import cn.vpclub.graduation.project.service.TeacherUserService;
import cn.vpclub.moses.core.enums.ReturnCodeEnum;
import cn.vpclub.moses.core.model.response.BackResponseUtil;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.core.model.response.ResponseConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherUserServiceImpl implements TeacherUserService {

    @Autowired(required = false)
    private TeacherUserMapper mapper;

    public TeacherUserServiceImpl(){

    }

    /*
    * 添加教师用户
    * */
    @Override
    public BaseResponse add(TeacherUser model) {
        int num=mapper.add(model);
        BaseResponse baseResponse= ResponseConvert.convert(num>0);
        return baseResponse;
    }

    /*
    * 删除教师用户
    * */
    @Override
    public BaseResponse delete(TeacherUser model) {
        BaseResponse baseResponse;
        if(model==null || model.getTeacheruserid()==null){
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            int back = mapper.delete(model);
            baseResponse = ResponseConvert.convert(back > 0);
        }
        return baseResponse;
    }

    /*
    * 修改教师用户
    * */
    @Override
    public BaseResponse update(TeacherUser model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getTeacheruserid()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            int back = mapper.update(model);
            baseResponse = ResponseConvert.convert(back > 0);
        }
        return baseResponse;
    }

    /*
     * 查询单条教师用户
     * */
    @Override
    public BaseResponse query(TeacherUser model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getTeacheruserid()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            List<TeacherUser> data = mapper.query(model);
            if (null != data) {
                baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1000.getCode());
                baseResponse.setDataInfo(data);
            } else {
                baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1002.getCode());
            }
        }
        return baseResponse;
    }

    /*
    * 查询所有教师用户
    * */
    @Override
    public BaseResponse selectAll() {
        BaseResponse baseResponse;
        List<TeacherUser> data = mapper.selectAll();
        if (data != null) {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1000.getCode()));
            baseResponse.setDataInfo(data);
        } else {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1002.getCode()));
        }
        return baseResponse;
    }

    /*
    * 登录验证
    * */
    @Override
    public BaseResponse login(TeacherUser model) {
        BaseResponse baseResponse=null;
        if(model==null||model.getTeacherusername()==null||model.getTeacheruserpwd()==null){
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1006.getCode()));
            baseResponse.setDataInfo("登陆失败，请重新登录！");
        }else {
            TeacherUser back=mapper.login(model);
            if (back != null) {
                baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1000.getCode()));
                baseResponse.setDataInfo(back);
            } else {
                baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1002.getCode()));
            }
        }
        return baseResponse;
    }

    @Override
    public BaseResponse queryId(TeacherUser model) {
        BaseResponse baseResponse=null;
        if(model==null||model.getTeacherusername()==null||model.getTeacheruserpwd()==null){
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1006.getCode()));
            baseResponse.setDataInfo("查询失败！");
        }else {
            List<TeacherUser> back=mapper.queryId(model);
            if (back != null) {
                baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1000.getCode()));
                baseResponse.setDataInfo(back);
            } else {
                baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1002.getCode()));
            }
        }
        return baseResponse;
    }

    @Override
    public BaseResponse selectByTeamId(TeacherUser model) {
        BaseResponse baseResponse;
        List<TeacherUser> data = mapper.selectByTeamId(model);
        if (data != null) {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1000.getCode()));
            baseResponse.setDataInfo(data);
        } else {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1002.getCode()));
        }
        return baseResponse;
    }
}
