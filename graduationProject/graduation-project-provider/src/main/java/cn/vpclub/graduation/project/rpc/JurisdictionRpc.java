package cn.vpclub.graduation.project.rpc;

import cn.vpclub.graduation.project.api.JurisdictionProto;
import cn.vpclub.graduation.project.api.JurisdictionServiceGrpc;
import cn.vpclub.graduation.project.entity.Jurisdiction;
import cn.vpclub.graduation.project.service.JurisdictionService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.utils.grpc.GRpcMessageConverter;
import cn.vpclub.spring.boot.grpc.annotations.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class JurisdictionRpc extends JurisdictionServiceGrpc.JurisdictionServiceImplBase {

    @Autowired
    private JurisdictionService service;

    /**
     * <pre>
     *添加权限角色
     * </pre>
     */
    public void add(JurisdictionProto.JurisdictionDTO request,
                    io.grpc.stub.StreamObserver<JurisdictionProto.JurisdictionResponse> responseObserver) {
        Jurisdiction model = (Jurisdiction) GRpcMessageConverter.fromGRpcMessage(request,Jurisdiction.class);
        BaseResponse baseResponse=service.add(model);
        JurisdictionProto.JurisdictionResponse response=(JurisdictionProto.JurisdictionResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                JurisdictionProto.JurisdictionResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *删除权限角色
     * </pre>
     */
    public void delete(JurisdictionProto.JurisdictionDTO request,
                       io.grpc.stub.StreamObserver<JurisdictionProto.JurisdictionResponse> responseObserver) {
        Jurisdiction model = (Jurisdiction) GRpcMessageConverter.fromGRpcMessage(request,Jurisdiction.class);
        BaseResponse baseResponse=service.delete(model);
        JurisdictionProto.JurisdictionResponse response=(JurisdictionProto.JurisdictionResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                JurisdictionProto.JurisdictionResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *修改权限角色
     * </pre>
     */
    public void update(JurisdictionProto.JurisdictionDTO request,
                       io.grpc.stub.StreamObserver<JurisdictionProto.JurisdictionResponse> responseObserver) {
        Jurisdiction model = (Jurisdiction) GRpcMessageConverter.fromGRpcMessage(request,Jurisdiction.class);
        BaseResponse baseResponse=service.update(model);
        JurisdictionProto.JurisdictionResponse response=(JurisdictionProto.JurisdictionResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                JurisdictionProto.JurisdictionResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询单个权限角色名称
     * </pre>
     */
    public void query(JurisdictionProto.JurisdictionDTO request,
                      io.grpc.stub.StreamObserver<JurisdictionProto.JurisdictionResponse> responseObserver) {
        Jurisdiction model = (Jurisdiction) GRpcMessageConverter.fromGRpcMessage(request,Jurisdiction.class);
        BaseResponse baseResponse=service.query(model);
        JurisdictionProto.JurisdictionResponse response=(JurisdictionProto.JurisdictionResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                JurisdictionProto.JurisdictionResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询所有权限角色
     * </pre>
     */
    public void selectAll(JurisdictionProto.JurisdictionDTO request,
                          io.grpc.stub.StreamObserver<JurisdictionProto.JurisdictionResponse> responseObserver) {
        Jurisdiction model = (Jurisdiction) GRpcMessageConverter.fromGRpcMessage(request,Jurisdiction.class);
        BaseResponse baseResponse=service.selectAll();
        JurisdictionProto.JurisdictionResponse response=(JurisdictionProto.JurisdictionResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                JurisdictionProto.JurisdictionResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
