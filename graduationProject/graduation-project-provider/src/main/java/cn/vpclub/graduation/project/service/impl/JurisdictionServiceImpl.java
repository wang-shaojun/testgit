package cn.vpclub.graduation.project.service.impl;

/*
* 描述：权限角色
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.entity.Jurisdiction;
import cn.vpclub.graduation.project.entity.TeacherUser;
import cn.vpclub.graduation.project.mapper.JurisdictionMapper;
import cn.vpclub.graduation.project.mapper.TeacherUserMapper;
import cn.vpclub.graduation.project.service.JurisdictionService;
import cn.vpclub.graduation.project.service.TeacherUserService;
import cn.vpclub.moses.core.enums.ReturnCodeEnum;
import cn.vpclub.moses.core.model.response.BackResponseUtil;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.core.model.response.ResponseConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JurisdictionServiceImpl implements JurisdictionService {

    @Autowired(required = false)
    private JurisdictionMapper mapper;

    public JurisdictionServiceImpl(){

    }

    /*
    * 添加权限角色
    * */
    @Override
    public BaseResponse add(Jurisdiction model) {
        int num=mapper.add(model);
        BaseResponse baseResponse= ResponseConvert.convert(num>0);
        return baseResponse;
    }

    /*
    * 删除权限角色
    * */
    @Override
    public BaseResponse delete(Jurisdiction model) {
        BaseResponse baseResponse;
        if(model==null || model.getJurisdictionid()==null){
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            int back = mapper.delete(model);
            baseResponse = ResponseConvert.convert(back > 0);
        }
        return baseResponse;
    }

    /*
    * 修改权限角色
    * */
    @Override
    public BaseResponse update(Jurisdiction model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getJurisdictionid()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            int back = mapper.update(model);
            baseResponse = ResponseConvert.convert(back > 0);
        }
        return baseResponse;
    }

    /*
     * 查询单条权限角色名称
     * */
    @Override
    public BaseResponse query(Jurisdiction model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getJurisdictionid()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            List<Jurisdiction> data = mapper.query(model);
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
     * 查询所有权限角色
     * */
    @Override
    public BaseResponse selectAll() {
        BaseResponse baseResponse;
        List<Jurisdiction> data = mapper.selectAll();
        if (data != null) {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1000.getCode()));
            baseResponse.setDataInfo(data);
        } else {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1002.getCode()));
        }
        return baseResponse;
    }

}
