package cn.vpclub.graduation.project.rpc;

/*
* 描述：课程
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.api.CurriculumProto;
import cn.vpclub.graduation.project.api.CurriculumServiceGrpc;
import cn.vpclub.graduation.project.entity.Curriculum;
import cn.vpclub.graduation.project.service.CurriculumService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.utils.grpc.GRpcMessageConverter;
import cn.vpclub.spring.boot.grpc.annotations.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class CurriculumRpc extends CurriculumServiceGrpc.CurriculumServiceImplBase{

    @Autowired
    private CurriculumService service;

    /**
     * <pre>
     *添加课程
     * </pre>
     */
    public void add(CurriculumProto.CurriculumDTO request,
                    io.grpc.stub.StreamObserver<CurriculumProto.CurriculumResponse> responseObserver) {
        Curriculum model = (Curriculum) GRpcMessageConverter.fromGRpcMessage(request,Curriculum.class);
        BaseResponse baseResponse=service.add(model);
        CurriculumProto.CurriculumResponse response=(CurriculumProto.CurriculumResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                CurriculumProto.CurriculumResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *删除课程
     * </pre>
     */
    public void delete(CurriculumProto.CurriculumDTO request,
                       io.grpc.stub.StreamObserver<CurriculumProto.CurriculumResponse> responseObserver) {
        Curriculum model = (Curriculum) GRpcMessageConverter.fromGRpcMessage(request,Curriculum.class);
        BaseResponse baseResponse=service.delete(model);
        CurriculumProto.CurriculumResponse response=(CurriculumProto.CurriculumResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                CurriculumProto.CurriculumResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *修改课程
     * </pre>
     */
    public void update(CurriculumProto.CurriculumDTO request,
                       io.grpc.stub.StreamObserver<CurriculumProto.CurriculumResponse> responseObserver) {
        Curriculum model = (Curriculum) GRpcMessageConverter.fromGRpcMessage(request,Curriculum.class);
        BaseResponse baseResponse=service.update(model);
        CurriculumProto.CurriculumResponse response=(CurriculumProto.CurriculumResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                CurriculumProto.CurriculumResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询单个课程
     * </pre>
     */
    public void query(CurriculumProto.CurriculumDTO request,
                      io.grpc.stub.StreamObserver<CurriculumProto.CurriculumResponse> responseObserver) {
        Curriculum model = (Curriculum) GRpcMessageConverter.fromGRpcMessage(request,Curriculum.class);
        BaseResponse baseResponse=service.query(model);
        CurriculumProto.CurriculumResponse response=(CurriculumProto.CurriculumResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                CurriculumProto.CurriculumResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询所有课程
     * </pre>
     */
    public void selectAll(CurriculumProto.CurriculumDTO request,
                          io.grpc.stub.StreamObserver<CurriculumProto.CurriculumResponse> responseObserver) {
        Curriculum model = (Curriculum) GRpcMessageConverter.fromGRpcMessage(request,Curriculum.class);
        BaseResponse baseResponse=service.selectAll();
        CurriculumProto.CurriculumResponse response=(CurriculumProto.CurriculumResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                CurriculumProto.CurriculumResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
