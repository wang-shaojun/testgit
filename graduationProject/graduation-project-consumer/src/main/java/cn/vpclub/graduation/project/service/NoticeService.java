package cn.vpclub.graduation.project.service;

/*
* 描述：公告消息
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Notice;
import cn.vpclub.graduation.project.rpc.NoticeRpcService;
import cn.vpclub.moses.core.enums.ReturnCodeEnum;
import cn.vpclub.moses.core.model.response.BackResponseUtil;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.utils.constant.ValidatorConditionType;
import cn.vpclub.moses.utils.validator.AttributeValidatorException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class NoticeService {

    private NoticeRpcService service;

    /**
     * <pre>
     *添加公告消息
     * </pre>
     */
    public BaseResponse add(Notice request){
        BaseResponse response;
        log.info("insert Notice" + request);

        try {
            request.validate(ValidatorConditionType.CREATE);
            response = service.add(request);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *删除公告消息
     * </pre>
     */
    public BaseResponse delete(Notice request) {
        BaseResponse response;
        //业务操作
        log.info("delete Notice " + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.delete(request);
            log.info("delete Notice back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *修改公告消息
     * </pre>
     */
    public BaseResponse update(Notice request) {
        BaseResponse response;
        //业务操作
        log.info("update Notice " + request);
        try {
            request.validate(ValidatorConditionType.UPDATE);
            response = service.update(request);
            log.debug("update Notice back " + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *查询单个公告消息
     * </pre>
     */
    public BaseResponse query(Notice request) {
        BaseResponse response;
        //业务操作
        log.info("query Notice " + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.query(request);
            log.info("query Notice back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *查询所有公告消息
     * </pre>
     */
    public BaseResponse selectAll(Notice request) {
        BaseResponse response;
        //业务操作
        log.info("select Notice All" + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.selectAll(request);
            log.info("select Notice All back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

}
