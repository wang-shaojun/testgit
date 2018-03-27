package cn.vpclub.graduation.project.service.impl;

/*
* 描述：专业
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Specidty;
import cn.vpclub.graduation.project.mapper.SpecidtyMapper;
import cn.vpclub.graduation.project.service.SpecidtyService;
import cn.vpclub.moses.core.enums.ReturnCodeEnum;
import cn.vpclub.moses.core.model.response.BackResponseUtil;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.core.model.response.ResponseConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecidtyServiceImpl implements SpecidtyService {

    @Autowired(required = false)
    private SpecidtyMapper mapper;

    public SpecidtyServiceImpl(){

    }

    /*
    * 添加专业
    * */
    @Override
    public BaseResponse add(Specidty model) {
        int num=mapper.add(model);
        BaseResponse baseResponse= ResponseConvert.convert(num>0);
        return baseResponse;
    }

    /*
    * 删除专业
    * */
    @Override
    public BaseResponse delete(Specidty model) {
        BaseResponse baseResponse;
        if(model==null || model.getSpecidtyid()==null){
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            int back = mapper.delete(model);
            baseResponse = ResponseConvert.convert(back > 0);
        }
        return baseResponse;
    }

    /*
    * 修改专业
    * */
    @Override
    public BaseResponse update(Specidty model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getSpecidtyid()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            int back = mapper.update(model);
            baseResponse = ResponseConvert.convert(back > 0);
        }
        return baseResponse;
    }

    /*
     * 查询单条专业
     * */
    @Override
    public BaseResponse query(Specidty model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getSpecidtyid()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            List<Specidty> data = mapper.query(model);
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
     * 查询所有专业
     * */
    @Override
    public BaseResponse selectAll() {
        BaseResponse baseResponse;
        List<Specidty> data = mapper.selectAll();
        if (data != null) {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1000.getCode()));
            baseResponse.setDataInfo(data);
        } else {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1002.getCode()));
        }
        return baseResponse;
    }

}
