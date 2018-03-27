package cn.vpclub.graduation.project.rpc;

/*
* 描述：团队
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.api.TeamProto;
import cn.vpclub.graduation.project.api.TeamServiceGrpc;
import cn.vpclub.graduation.project.entity.Team;
import cn.vpclub.graduation.project.service.TeamService;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.utils.grpc.GRpcMessageConverter;
import cn.vpclub.spring.boot.grpc.annotations.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class TeamRpc extends TeamServiceGrpc.TeamServiceImplBase{

    @Autowired
    private TeamService service;

    /**
     * <pre>
     *添加团队
     * </pre>
     */
    public void add(TeamProto.TeamDTO request,
                    io.grpc.stub.StreamObserver<TeamProto.TeamResponse> responseObserver) {
        Team model = (Team) GRpcMessageConverter.fromGRpcMessage(request,Team.class);
        BaseResponse baseResponse=service.add(model);
        TeamProto.TeamResponse response=(TeamProto.TeamResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeamProto.TeamResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *删除团队
     * </pre>
     */
    public void delete(TeamProto.TeamDTO request,
                       io.grpc.stub.StreamObserver<TeamProto.TeamResponse> responseObserver) {
        Team model = (Team) GRpcMessageConverter.fromGRpcMessage(request,Team.class);
        BaseResponse baseResponse=service.delete(model);
        TeamProto.TeamResponse response=(TeamProto.TeamResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeamProto.TeamResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *修改团队
     * </pre>
     */
    public void update(TeamProto.TeamDTO request,
                       io.grpc.stub.StreamObserver<TeamProto.TeamResponse> responseObserver) {
        Team model = (Team) GRpcMessageConverter.fromGRpcMessage(request,Team.class);
        BaseResponse baseResponse=service.update(model);
        TeamProto.TeamResponse response=(TeamProto.TeamResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeamProto.TeamResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询单个团队
     * </pre>
     */
    public void query(TeamProto.TeamDTO request,
                      io.grpc.stub.StreamObserver<TeamProto.TeamResponse> responseObserver) {
        Team model = (Team) GRpcMessageConverter.fromGRpcMessage(request,Team.class);
        BaseResponse baseResponse=service.query(model);
        TeamProto.TeamResponse response=(TeamProto.TeamResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeamProto.TeamResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     *查询所有团队
     * </pre>
     */
    public void selectAll(TeamProto.TeamDTO request,
                          io.grpc.stub.StreamObserver<TeamProto.TeamResponse> responseObserver) {
        Team model = (Team) GRpcMessageConverter.fromGRpcMessage(request,Team.class);
        BaseResponse baseResponse=service.selectAll();
        TeamProto.TeamResponse response=(TeamProto.TeamResponse) GRpcMessageConverter.toGRpcMessage(baseResponse,
                TeamProto.TeamResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
