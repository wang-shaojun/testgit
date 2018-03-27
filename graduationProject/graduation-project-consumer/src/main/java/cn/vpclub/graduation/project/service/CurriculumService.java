package cn.vpclub.graduation.project.service;

/*
* 描述：课程
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Curriculum;
import cn.vpclub.graduation.project.rpc.CurriculumRpcService;
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
public class CurriculumService {

    private CurriculumRpcService service;

    /**
     * <pre>
     *添加课程
     * </pre>
     */
    public BaseResponse add(Curriculum request){
        BaseResponse response;
        log.info("insert Curriculum" + request);

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
     *删除课程
     * </pre>
     */
    public BaseResponse delete(Curriculum request) {
        BaseResponse response;
        //业务操作
        log.info("delete Curriculum " + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.delete(request);
            log.info("delete Curriculum back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *修改课程
     * </pre>
     */
    public BaseResponse update(Curriculum request) {
        BaseResponse response;
        //业务操作
        log.info("update Curriculum " + request);
        try {
            request.validate(ValidatorConditionType.UPDATE);
            response = service.update(request);
            log.debug("update Curriculum back " + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *查询单个课程
     * </pre>
     */
    public BaseResponse query(Curriculum request) {
        BaseResponse response;
        //业务操作
        log.info("query Curriculum " + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.query(request);
            log.info("query Curriculum back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *查询所有课程
     * </pre>
     */
    public BaseResponse selectAll(Curriculum request) {
        BaseResponse response;
        //业务操作
        log.info("select Curriculum All" + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.selectAll(request);
            log.info("select Curriculum All back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

}
