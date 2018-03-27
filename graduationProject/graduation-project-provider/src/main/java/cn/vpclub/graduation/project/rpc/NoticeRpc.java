package cn.vpclub.graduation.project.rpc;

/*
* 描述：公告消息
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.api.NoticeProto;
import cn.vpclub.graduation.project.api.NoticeServiceGrpc;
import cn.vpclub.graduation.project.entity.Notice;
import cn.vpclub.graduation.project.service.NoticeService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.utils.grpc.GRpcMessageConverter;
import cn.vpclub.spring.boot.grpc.annotations.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class NoticeRpc extends NoticeServiceGrpc.NoticeServiceImplBase{

    @Autowired
    private NoticeService service;

    /**
     * <pre>
     *添加公告
     * </pre>
     */
    public void add(NoticeProto.NoticeDTO request,
                    io.grpc.stub.StreamObserver<NoticeProto.NoticeResponse> responseObserver) {
        Notice model = (Notice) GRpcMessageConverter.fromGRpcMessage(request,Notice.class);
        BaseResponse baseResponse=service.add(model);
        NoticeProto.NoticeResponse response=(NoticeProto.NoticeResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                NoticeProto.NoticeResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *删除公告
     * </pre>
     */
    public void delete(NoticeProto.NoticeDTO request,
                       io.grpc.stub.StreamObserver<NoticeProto.NoticeResponse> responseObserver) {
        Notice model = (Notice) GRpcMessageConverter.fromGRpcMessage(request,Notice.class);
        BaseResponse baseResponse=service.delete(model);
        NoticeProto.NoticeResponse response=(NoticeProto.NoticeResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                NoticeProto.NoticeResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *修改公告
     * </pre>
     */
    public void update(NoticeProto.NoticeDTO request,
                       io.grpc.stub.StreamObserver<NoticeProto.NoticeResponse> responseObserver) {
        Notice model = (Notice) GRpcMessageConverter.fromGRpcMessage(request,Notice.class);
        BaseResponse baseResponse=service.update(model);
        NoticeProto.NoticeResponse response=(NoticeProto.NoticeResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                NoticeProto.NoticeResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询单个公告
     * </pre>
     */
    public void query(NoticeProto.NoticeDTO request,
                      io.grpc.stub.StreamObserver<NoticeProto.NoticeResponse> responseObserver) {
        Notice model = (Notice) GRpcMessageConverter.fromGRpcMessage(request,Notice.class);
        BaseResponse baseResponse=service.query(model);
        NoticeProto.NoticeResponse response=(NoticeProto.NoticeResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                NoticeProto.NoticeResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询所有公告
     * </pre>
     */
    public void selectAll(NoticeProto.NoticeDTO request,
                          io.grpc.stub.StreamObserver<NoticeProto.NoticeResponse> responseObserver) {
        Notice model = (Notice) GRpcMessageConverter.fromGRpcMessage(request,Notice.class);
        BaseResponse baseResponse=service.selectAll();
        NoticeProto.NoticeResponse response=(NoticeProto.NoticeResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                NoticeProto.NoticeResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
