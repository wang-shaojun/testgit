package cn.vpclub.graduation.project.rpc;

/*
* 描述：provider教师用户rpc
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.api.TeacherUserProto;
import cn.vpclub.graduation.project.api.TeacherUserServiceGrpc;
import cn.vpclub.graduation.project.entity.TeacherUser;
import cn.vpclub.graduation.project.service.TeacherUserService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.utils.grpc.GRpcMessageConverter;
import cn.vpclub.spring.boot.grpc.annotations.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class TeacherUserRpc extends TeacherUserServiceGrpc.TeacherUserServiceImplBase{

    @Autowired
    private TeacherUserService service;

    /**
     * <pre>
     *添加教师用户
     * </pre>
     */
    public void add(TeacherUserProto.TeacherUserDTO request,
                    io.grpc.stub.StreamObserver<TeacherUserProto.TeacherUserResponse> responseObserver) {
        TeacherUser model = (TeacherUser) GRpcMessageConverter.fromGRpcMessage(request,TeacherUser.class);
        BaseResponse baseResponse=service.add(model);
        TeacherUserProto.TeacherUserResponse response=(TeacherUserProto.TeacherUserResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeacherUserProto.TeacherUserResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *删除教师用户
     * </pre>
     */
    public void delete(TeacherUserProto.TeacherUserDTO request,
                       io.grpc.stub.StreamObserver<TeacherUserProto.TeacherUserResponse> responseObserver) {
        TeacherUser model = (TeacherUser) GRpcMessageConverter.fromGRpcMessage(request,TeacherUser.class);
        BaseResponse baseResponse=service.delete(model);
        TeacherUserProto.TeacherUserResponse response=(TeacherUserProto.TeacherUserResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeacherUserProto.TeacherUserResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *修改教师用户
     * </pre>
     */
    public void update(TeacherUserProto.TeacherUserDTO request,
                       io.grpc.stub.StreamObserver<TeacherUserProto.TeacherUserResponse> responseObserver) {
        TeacherUser model = (TeacherUser) GRpcMessageConverter.fromGRpcMessage(request,TeacherUser.class);
        BaseResponse baseResponse=service.update(model);
        TeacherUserProto.TeacherUserResponse response=(TeacherUserProto.TeacherUserResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeacherUserProto.TeacherUserResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询单个教师用户
     * </pre>
     */
    public void query(TeacherUserProto.TeacherUserDTO request,
                      io.grpc.stub.StreamObserver<TeacherUserProto.TeacherUserResponse> responseObserver) {
        TeacherUser model = (TeacherUser)GRpcMessageConverter.fromGRpcMessage(request, TeacherUser.class);
        BaseResponse baseResponse = service.query(model);
        TeacherUserProto.TeacherUserResponse response = (TeacherUserProto.TeacherUserResponse)GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeacherUserProto.TeacherUserResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询所有教师用户
     * </pre>
     */
    public void selectAll(TeacherUserProto.TeacherUserDTO request,
                          io.grpc.stub.StreamObserver<TeacherUserProto.TeacherUserResponse> responseObserver) {
        TeacherUser model = (TeacherUser) GRpcMessageConverter.fromGRpcMessage(request,TeacherUser.class);
        BaseResponse baseResponse=service.selectAll();
        TeacherUserProto.TeacherUserResponse response=(TeacherUserProto.TeacherUserResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeacherUserProto.TeacherUserResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *登录验证
     * </pre>
     */
    public void login(TeacherUserProto.TeacherUserDTO request,
                      io.grpc.stub.StreamObserver<TeacherUserProto.TeacherUserLoginResponse> responseObserver) {
        TeacherUser model = (TeacherUser) GRpcMessageConverter.fromGRpcMessage(request,TeacherUser.class);
        BaseResponse baseResponse=service.login(model);
        TeacherUserProto.TeacherUserLoginResponse response=(TeacherUserProto.TeacherUserLoginResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeacherUserProto.TeacherUserLoginResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *根据姓名查询id
     * </pre>
     */
    public void queryId(TeacherUserProto.TeacherUserDTO request,
                        io.grpc.stub.StreamObserver<TeacherUserProto.TeacherUserResponse> responseObserver) {
        TeacherUser model = (TeacherUser) GRpcMessageConverter.fromGRpcMessage(request,TeacherUser.class);
        BaseResponse baseResponse=service.queryId(model);
        TeacherUserProto.TeacherUserResponse response=(TeacherUserProto.TeacherUserResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeacherUserProto.TeacherUserResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *根据团队id查询用户
     * </pre>
     */
    public void selectByTeamId(TeacherUserProto.TeacherUserDTO request,
                               io.grpc.stub.StreamObserver<TeacherUserProto.TeacherUserResponse> responseObserver) {
        TeacherUser model = (TeacherUser) GRpcMessageConverter.fromGRpcMessage(request,TeacherUser.class);
        BaseResponse baseResponse=service.selectByTeamId(model);
        TeacherUserProto.TeacherUserResponse response=(TeacherUserProto.TeacherUserResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeacherUserProto.TeacherUserResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
