package cn.vpclub.graduation.project.service;

/*
* 描述：教师用户
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.entity.Jurisdiction;
import cn.vpclub.graduation.project.entity.TeacherUser;
import cn.vpclub.graduation.project.rpc.JurisdictionRpcService;
import cn.vpclub.graduation.project.rpc.TeacherUserRpcService;
import cn.vpclub.moses.core.enums.ReturnCodeEnum;
import cn.vpclub.moses.core.model.response.BackResponseUtil;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.utils.common.JsonUtil;
import cn.vpclub.moses.utils.constant.ValidatorConditionType;
import cn.vpclub.moses.utils.validator.AttributeValidatorException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
@AllArgsConstructor
public class TeacherUserService {

    private TeacherUserRpcService service;
    private JurisdictionRpcService jurisdictionRpcService;

    /**
     * <pre>
     *添加教师用户
     * </pre>
     */
    public BaseResponse add(TeacherUser request){
        BaseResponse response;
        log.info("insert TeacherUser" + request);

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
     *删除教师用户
     * </pre>
     */
    public BaseResponse delete(TeacherUser request) {
        BaseResponse response;
        //业务操作
        log.info("delete TeacherUser " + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.delete(request);
            log.info("delete TeacherUser back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *修改教师用户
     * </pre>
     */
    public BaseResponse update(TeacherUser request) {
        BaseResponse response;
        //业务操作
        log.info("update TeacherUser " + request);
        try {
            request.validate(ValidatorConditionType.UPDATE);
            response = service.update(request);
            log.debug("update TeacherUser back " + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *查询单个教师用户
     * </pre>
     */
    public BaseResponse query(TeacherUser request) {
        BaseResponse response;
        //业务操作
        log.info("query TeacherUser " + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.query(request);
            log.info("query TeacherUser back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *查询所有教师用户
     * </pre>
     */
    public BaseResponse selectAll(TeacherUser request) {
        BaseResponse response;
        //业务操作
        log.info("select TeacherUser All" + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.selectAll(request);
            log.info("select TeacherUser All back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *登录验证
     * </pre>
     */
    public BaseResponse login(TeacherUser request) {
        BaseResponse<TeacherUser> response;
        BaseResponse jurisdictionResponse=null;
        //业务操作
        log.info("login TeacherUser" + request);
            response = service.login(request);
            String pass=response.getDataInfo().getTeacheruserpwd();
            //密码校验
            if (pass.equals(request.getTeacheruserpwd())){
                //获取权限角色id
                Long jurisdictionid=response.getDataInfo().getJurisdictionid();
                //创建对象存储权限角色id
                Jurisdiction jurisdiction=new Jurisdiction();
                jurisdiction.setJurisdictionid(jurisdictionid);
                //调用方法，获取该权限的权限内容
                jurisdictionResponse = jurisdictionRpcService.query(jurisdiction);
                log.info("login TeacherUser back" + response);
            }else{
                //将之前的信息覆盖
                jurisdictionResponse.setMessage("失败");
            }

        return jurisdictionResponse;
    }

    /**
     * <pre>
     *根据姓名查询id
     * </pre>
     */
    public BaseResponse queryId(TeacherUser request) {
        BaseResponse response;
        //业务操作
        log.info("query teacheruserid" + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.queryId(request);
            log.info("query teacheruserid back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * <pre>
     *根据姓名查询id
     * </pre>
     */
    public BaseResponse selectByTeamId(TeacherUser request) {
        BaseResponse response;
        //业务操作
        log.info("query selectByTeamId" + request);
        try {
            request.validate(ValidatorConditionType.READ);
            response = service.selectByTeamId(request);
            log.info("query selectByTeamId back" + response);
        } catch (AttributeValidatorException e) {
            log.error("error: {}", e);
            response = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
            response.setMessage(e.getMessage());
        }
        return response;
    }
}
