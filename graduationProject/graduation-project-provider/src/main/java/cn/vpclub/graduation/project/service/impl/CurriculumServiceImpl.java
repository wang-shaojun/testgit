package cn.vpclub.graduation.project.service.impl;

/*
* 描述：课程
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Curriculum;
import cn.vpclub.graduation.project.mapper.CurriculumMapper;
import cn.vpclub.graduation.project.service.CurriculumService;
import cn.vpclub.moses.core.enums.ReturnCodeEnum;
import cn.vpclub.moses.core.model.response.BackResponseUtil;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.core.model.response.ResponseConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculumServiceImpl implements CurriculumService {

    @Autowired(required = false)
    private CurriculumMapper mapper;

    public CurriculumServiceImpl(){

    }

    /*
    * 添加课程
    * */
    @Override
    public BaseResponse add(Curriculum model) {
        int num=mapper.add(model);
        BaseResponse baseResponse= ResponseConvert.convert(num>0);
        return baseResponse;
    }

    /*
    * 删除课程
    * */
    @Override
    public BaseResponse delete(Curriculum model) {
        BaseResponse baseResponse;
        if(model==null || model.getCurriculumid()==null){
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            int back = mapper.delete(model);
            baseResponse = ResponseConvert.convert(back > 0);
        }
        return baseResponse;
    }

    /*
    * 修改课程
    * */
    @Override
    public BaseResponse update(Curriculum model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getCurriculumid()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            int back = mapper.update(model);
            baseResponse = ResponseConvert.convert(back > 0);
        }
        return baseResponse;
    }

    /*
     * 查询单条课程
     * */
    @Override
    public BaseResponse query(Curriculum model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getCurriculumid()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            List<Curriculum> data = mapper.query(model);
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
     * 查询所有课程
     * */
    @Override
    public BaseResponse selectAll() {
        BaseResponse baseResponse;
        List<Curriculum> data = mapper.selectAll();
        if (data != null) {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1000.getCode()));
            baseResponse.setDataInfo(data);
        } else {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1002.getCode()));
        }
        return baseResponse;
    }

}
