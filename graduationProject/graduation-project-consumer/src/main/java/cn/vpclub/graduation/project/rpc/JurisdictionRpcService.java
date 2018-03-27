package cn.vpclub.graduation.project.rpc;

/*
* 描述：权限角色
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.api.JurisdictionProto;
import cn.vpclub.graduation.project.api.JurisdictionServiceGrpc;
import cn.vpclub.graduation.project.entity.Jurisdiction;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.fromGRpcMessage;
import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.toGRpcMessage;

@Service
@Slf4j
@AllArgsConstructor
public class JurisdictionRpcService {

    private JurisdictionServiceGrpc.JurisdictionServiceBlockingStub blockingStub;

    /**
     * <pre>
     *添加权限角色
     * </pre>
     */
    public BaseResponse add(Jurisdiction request) {

        JurisdictionProto.JurisdictionDTO dto= (JurisdictionProto.JurisdictionDTO) toGRpcMessage(request,
                JurisdictionProto.JurisdictionDTO.newBuilder());
        JurisdictionProto.JurisdictionResponse response=blockingStub.add(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Jurisdiction.class);
    }

    /**
     * <pre>
     *删除权限角色
     * </pre>
     */
    public BaseResponse delete(Jurisdiction request) {

        JurisdictionProto.JurisdictionDTO dto= (JurisdictionProto.JurisdictionDTO) toGRpcMessage(request,
                JurisdictionProto.JurisdictionDTO.newBuilder());
        JurisdictionProto.JurisdictionResponse response=blockingStub.delete(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Jurisdiction.class);
    }

    /**
     * <pre>
     *修改权限角色
     * </pre>
     */
    public BaseResponse update(Jurisdiction request) {

        JurisdictionProto.JurisdictionDTO dto= (JurisdictionProto.JurisdictionDTO) toGRpcMessage(request,
                JurisdictionProto.JurisdictionDTO.newBuilder());
        JurisdictionProto.JurisdictionResponse response=blockingStub.update(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Jurisdiction.class);
    }

    /**
     * <pre>
     *查询单个权限角色名称
     * </pre>
     */
    public BaseResponse query(Jurisdiction request) {

        JurisdictionProto.JurisdictionDTO dto= (JurisdictionProto.JurisdictionDTO) toGRpcMessage(request,
                JurisdictionProto.JurisdictionDTO.newBuilder());
        JurisdictionProto.JurisdictionResponse response=blockingStub.query(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Jurisdiction.class);
    }

    /**
     * <pre>
     *查询所有权限角色
     * </pre>
     */
    public BaseResponse selectAll(Jurisdiction request) {

        JurisdictionProto.JurisdictionDTO dto= (JurisdictionProto.JurisdictionDTO) toGRpcMessage(request,
                JurisdictionProto.JurisdictionDTO.newBuilder());
        JurisdictionProto.JurisdictionResponse response=blockingStub.selectAll(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Jurisdiction.class);
    }

}
