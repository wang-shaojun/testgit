package cn.vpclub.graduation.project.rpc;

/*
* 描述：团队
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.api.TeamProto;
import cn.vpclub.graduation.project.api.TeamServiceGrpc;
import cn.vpclub.graduation.project.entity.Team;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.fromGRpcMessage;
import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.toGRpcMessage;

@Service
@Slf4j
@AllArgsConstructor
public class TeamRpcService {

    private TeamServiceGrpc.TeamServiceBlockingStub blockingStub;

    /**
     * <pre>
     *添加团队
     * </pre>
     */
    public BaseResponse add(Team request) {

        TeamProto.TeamDTO dto= (TeamProto.TeamDTO) toGRpcMessage(request,
                TeamProto.TeamDTO.newBuilder());
        TeamProto.TeamResponse response=blockingStub.add(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Team.class);
    }

    /**
     * <pre>
     *删除团队
     * </pre>
     */
    public BaseResponse delete(Team request) {

        TeamProto.TeamDTO dto= (TeamProto.TeamDTO) toGRpcMessage(request,
                TeamProto.TeamDTO.newBuilder());
        TeamProto.TeamResponse response=blockingStub.delete(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Team.class);
    }

    /**
     * <pre>
     *修改团队
     * </pre>
     */
    public BaseResponse update(Team request) {

        TeamProto.TeamDTO dto= (TeamProto.TeamDTO) toGRpcMessage(request,
                TeamProto.TeamDTO.newBuilder());
        TeamProto.TeamResponse response=blockingStub.update(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Team.class);
    }

    /**
     * <pre>
     *查询单个团队
     * </pre>
     */
    public BaseResponse query(Team request) {

        TeamProto.TeamDTO dto= (TeamProto.TeamDTO) toGRpcMessage(request,
                TeamProto.TeamDTO.newBuilder());
        TeamProto.TeamResponse response=blockingStub.query(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Team.class);
    }

    /**
     * <pre>
     *查询所有团队
     * </pre>
     */
    public BaseResponse selectAll(Team request) {

        TeamProto.TeamDTO dto= (TeamProto.TeamDTO) toGRpcMessage(request,
                TeamProto.TeamDTO.newBuilder());
        TeamProto.TeamResponse response=blockingStub.selectAll(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Team.class);
    }

}
