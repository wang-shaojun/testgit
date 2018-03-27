package cn.vpclub.graduation.project.rpc;

/*
* 描述：学院
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.api.AcademyProto;
import cn.vpclub.graduation.project.api.AcademyServiceGrpc;
import cn.vpclub.graduation.project.entity.Academy;
import cn.vpclub.graduation.project.service.AcademyService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.utils.grpc.GRpcMessageConverter;
import cn.vpclub.spring.boot.grpc.annotations.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class AcademyRpc extends AcademyServiceGrpc.AcademyServiceImplBase{

    @Autowired
    private AcademyService service;

    /**
     * <pre>
     *添加学院
     * </pre>
     */
    public void add(AcademyProto.AcademyDTO request,
                    io.grpc.stub.StreamObserver<AcademyProto.AcademyResponse> responseObserver) {
        Academy model = (Academy) GRpcMessageConverter.fromGRpcMessage(request,Academy.class);
        BaseResponse baseResponse=service.add(model);
        AcademyProto.AcademyResponse response=(AcademyProto.AcademyResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                AcademyProto.AcademyResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *删除学院
     * </pre>
     */
    public void delete(AcademyProto.AcademyDTO request,
                       io.grpc.stub.StreamObserver<AcademyProto.AcademyResponse> responseObserver) {
        Academy model = (Academy) GRpcMessageConverter.fromGRpcMessage(request,Academy.class);
        BaseResponse baseResponse=service.delete(model);
        AcademyProto.AcademyResponse response=(AcademyProto.AcademyResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                AcademyProto.AcademyResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *修改学院
     * </pre>
     */
    public void update(AcademyProto.AcademyDTO request,
                       io.grpc.stub.StreamObserver<AcademyProto.AcademyResponse> responseObserver) {
        Academy model = (Academy) GRpcMessageConverter.fromGRpcMessage(request,Academy.class);
        BaseResponse baseResponse=service.update(model);
        AcademyProto.AcademyResponse response=(AcademyProto.AcademyResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                AcademyProto.AcademyResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询单个学院
     * </pre>
     */
    public void query(AcademyProto.AcademyDTO request,
                      io.grpc.stub.StreamObserver<AcademyProto.AcademyResponse> responseObserver) {
        Academy model = (Academy) GRpcMessageConverter.fromGRpcMessage(request,Academy.class);
        BaseResponse baseResponse=service.query(model);
        AcademyProto.AcademyResponse response=(AcademyProto.AcademyResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                AcademyProto.AcademyResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询所有学院
     * </pre>
     */
    public void selectAll(AcademyProto.AcademyDTO request,
                          io.grpc.stub.StreamObserver<AcademyProto.AcademyResponse> responseObserver) {
        Academy model = (Academy) GRpcMessageConverter.fromGRpcMessage(request,Academy.class);
        BaseResponse baseResponse=service.selectAll();
        AcademyProto.AcademyResponse response=(AcademyProto.AcademyResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                AcademyProto.AcademyResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
