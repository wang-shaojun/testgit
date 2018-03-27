package cn.vpclub.graduation.project.service;

/*
* 描述：团队
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.entity.Team;
import cn.vpclub.graduation.project.rpc.TeamRpcService;
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
public class TeamService {

    private TeamRpcService service;

    /**
     * <pre>
     *添加团队
     * </pre>
     */
    public BaseResponse add(Team request){
        BaseResponse response;
        log.info("insert Team" + request);

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
     *删除团队
     * </pre>
     */
    public BaseResponse delete(Team request) {
        BaseResponse response;
        //业务操作
        log.info("delete Team " + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.delete(request);
            log.info("delete Team back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *修改团队
     * </pre>
     */
    public BaseResponse update(Team request) {
        BaseResponse response;
        //业务操作
        log.info("update Team " + request);
        try {
            request.validate(ValidatorConditionType.UPDATE);
            response = service.update(request);
            log.debug("update Team back " + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *查询单个团队
     * </pre>
     */
    public BaseResponse query(Team request) {
        BaseResponse response;
        //业务操作
        log.info("query Team " + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.query(request);
            log.info("query Team back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *查询所有团队
     * </pre>
     */
    public BaseResponse selectAll(Team request) {
        BaseResponse response;
        //业务操作
        log.info("select Team All" + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.selectAll(request);
            log.info("select Team All back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

}
