package cn.vpclub.graduation.project.rpc;

/*
* 描述：专业
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.api.SpecidtyProto;
import cn.vpclub.graduation.project.api.SpecidtyServiceGrpc;
import cn.vpclub.graduation.project.entity.Specidty;
import cn.vpclub.graduation.project.service.SpecidtyService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.utils.grpc.GRpcMessageConverter;
import cn.vpclub.spring.boot.grpc.annotations.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class SpecidtyRpc extends SpecidtyServiceGrpc.SpecidtyServiceImplBase{

    @Autowired
    private SpecidtyService service;

    /**
     * <pre>
     *添加专业
     * </pre>
     */
    public void add(SpecidtyProto.SpecidtyDTO request,
                    io.grpc.stub.StreamObserver<SpecidtyProto.SpecidtyResponse> responseObserver) {
        Specidty model = (Specidty) GRpcMessageConverter.fromGRpcMessage(request,Specidty.class);
        BaseResponse baseResponse=service.add(model);
        SpecidtyProto.SpecidtyResponse response=(SpecidtyProto.SpecidtyResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                SpecidtyProto.SpecidtyResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *删除专业
     * </pre>
     */
    public void delete(SpecidtyProto.SpecidtyDTO request,
                       io.grpc.stub.StreamObserver<SpecidtyProto.SpecidtyResponse> responseObserver) {
        Specidty model = (Specidty) GRpcMessageConverter.fromGRpcMessage(request,Specidty.class);
        BaseResponse baseResponse=service.delete(model);
        SpecidtyProto.SpecidtyResponse response=(SpecidtyProto.SpecidtyResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                SpecidtyProto.SpecidtyResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *修改专业
     * </pre>
     */
    public void update(SpecidtyProto.SpecidtyDTO request,
                       io.grpc.stub.StreamObserver<SpecidtyProto.SpecidtyResponse> responseObserver) {
        Specidty model = (Specidty) GRpcMessageConverter.fromGRpcMessage(request,Specidty.class);
        BaseResponse baseResponse=service.update(model);
        SpecidtyProto.SpecidtyResponse response=(SpecidtyProto.SpecidtyResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                SpecidtyProto.SpecidtyResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询单个专业
     * </pre>
     */
    public void query(SpecidtyProto.SpecidtyDTO request,
                      io.grpc.stub.StreamObserver<SpecidtyProto.SpecidtyResponse> responseObserver) {
        Specidty model = (Specidty) GRpcMessageConverter.fromGRpcMessage(request,Specidty.class);
        BaseResponse baseResponse=service.query(model);
        SpecidtyProto.SpecidtyResponse response=(SpecidtyProto.SpecidtyResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                SpecidtyProto.SpecidtyResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询所有专业
     * </pre>
     */
    public void selectAll(SpecidtyProto.SpecidtyDTO request,
                          io.grpc.stub.StreamObserver<SpecidtyProto.SpecidtyResponse> responseObserver) {
        Specidty model = (Specidty) GRpcMessageConverter.fromGRpcMessage(request,Specidty.class);
        BaseResponse baseResponse=service.selectAll();
        SpecidtyProto.SpecidtyResponse response=(SpecidtyProto.SpecidtyResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                SpecidtyProto.SpecidtyResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
