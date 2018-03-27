package cn.vpclub.graduation.project.service;

/*
* 描述：权限角色
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.entity.Jurisdiction;
import cn.vpclub.graduation.project.rpc.JurisdictionRpcService;
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
public class JurisdictionService {

    private JurisdictionRpcService service;

    /**
     * <pre>
     *添加权限角色
     * </pre>
     */
    public BaseResponse add(Jurisdiction request){
        BaseResponse response;
        log.info("insert Jurisdiction" + request);

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
     *删除权限角色
     * </pre>
     */
    public BaseResponse delete(Jurisdiction request) {
        BaseResponse response;
        //业务操作
        log.info("delete Jurisdiction " + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.delete(request);
            log.info("delete Jurisdiction back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *修改权限角色
     * </pre>
     */
    public BaseResponse update(Jurisdiction request) {
        BaseResponse response;
        //业务操作
        log.info("update Jurisdiction " + request);
        try {
            request.validate(ValidatorConditionType.UPDATE);
            response = service.update(request);
            log.debug("update Jurisdiction back " + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *查询单个权限角色名称
     * </pre>
     */
    public BaseResponse query(Jurisdiction request) {
        BaseResponse response;
        //业务操作
        log.info("query Jurisdiction " + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.query(request);
            log.info("query Jurisdiction back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *查询所有权限角色
     * </pre>
     */
    public BaseResponse selectAll(Jurisdiction request) {
        BaseResponse response;
        //业务操作
        log.info("select Jurisdiction All" + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.selectAll(request);
            log.info("select Jurisdiction All back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

}
