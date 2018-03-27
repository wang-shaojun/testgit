package cn.vpclub.graduation.project.service.impl;

/*
* 描述：公告消息
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Notice;
import cn.vpclub.graduation.project.mapper.NoticeMapper;
import cn.vpclub.graduation.project.service.NoticeService;
import cn.vpclub.moses.core.enums.ReturnCodeEnum;
import cn.vpclub.moses.core.model.response.BackResponseUtil;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.core.model.response.ResponseConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired(required = false)
    private NoticeMapper mapper;

    public NoticeServiceImpl(){

    }

    /*
    * 添加公告消息
    * */
    @Override
    public BaseResponse add(Notice model) {
        int num=mapper.add(model);
        BaseResponse baseResponse= ResponseConvert.convert(num>0);
        return baseResponse;
    }

    /*
    * 删除公告消息
    * */
    @Override
    public BaseResponse delete(Notice model) {
        BaseResponse baseResponse;
        if(model==null || model.getNoticeid()==null){
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            int back = mapper.delete(model);
            baseResponse = ResponseConvert.convert(back > 0);
        }
        return baseResponse;
    }

    /*
    * 修改公告消息
    * */
    @Override
    public BaseResponse update(Notice model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getNoticeid()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            int back = mapper.update(model);
            baseResponse = ResponseConvert.convert(back > 0);
        }
        return baseResponse;
    }

    /*
     * 查询单条公告消息
     * */
    @Override
    public BaseResponse query(Notice model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getNoticeid()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            List<Notice> data = mapper.query(model);
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
     * 查询所有公告消息
     * */
    @Override
    public BaseResponse selectAll() {
        BaseResponse baseResponse;
        List<Notice> data = mapper.selectAll();
        if (data != null) {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1000.getCode()));
            baseResponse.setDataInfo(data);
        } else {
            baseResponse = BackResponseUtil.getBaseResponse((ReturnCodeEnum.CODE_1002.getCode()));
        }
        return baseResponse;
    }

}
