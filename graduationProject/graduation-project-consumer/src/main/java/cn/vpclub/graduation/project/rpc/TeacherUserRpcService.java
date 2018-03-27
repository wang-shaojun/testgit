package cn.vpclub.graduation.project.rpc;

/*
* 描述：教师用户
* 作者：王少军
* 日期：2018年03月15日
* */

import cn.vpclub.graduation.project.api.TeacherUserProto;
import cn.vpclub.graduation.project.api.TeacherUserServiceGrpc;
import cn.vpclub.graduation.project.entity.TeacherUser;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.fromGRpcMessage;
import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.toGRpcMessage;

@Service
@Slf4j
@AllArgsConstructor
public class TeacherUserRpcService {

    private TeacherUserServiceGrpc.TeacherUserServiceBlockingStub blockingStub;

    /**
     * <pre>
     *添加教师用户
     * </pre>
     */
    public BaseResponse add(TeacherUser request) {

        TeacherUserProto.TeacherUserDTO dto= (TeacherUserProto.TeacherUserDTO) toGRpcMessage(request,
                TeacherUserProto.TeacherUserDTO.newBuilder());
        TeacherUserProto.TeacherUserResponse response=blockingStub.add(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,TeacherUser.class);
    }

    /**
     * <pre>
     *删除教师用户
     * </pre>
     */
    public BaseResponse delete(TeacherUser request){
        TeacherUserProto.TeacherUserDTO dto = (TeacherUserProto.TeacherUserDTO) toGRpcMessage(request,
                TeacherUserProto.TeacherUserDTO.newBuilder());
        TeacherUserProto.TeacherUserResponse response = blockingStub.delete(dto);
        return (BaseResponse) fromGRpcMessage(response, BaseResponse.class, TeacherUser.class);
    }

    /**
     * <pre>
     *修改教师用户
     * </pre>
     */
    public BaseResponse update(TeacherUser request){
        TeacherUserProto.TeacherUserDTO dto = (TeacherUserProto.TeacherUserDTO) toGRpcMessage(request,
                TeacherUserProto.TeacherUserDTO.newBuilder());
        TeacherUserProto.TeacherUserResponse response = blockingStub.update(dto);
        return (BaseResponse) fromGRpcMessage(response, BaseResponse.class, TeacherUser.class);
    }

    /**
     * <pre>
     *查询单个教师用户
     * </pre>
     */
    public BaseResponse query(TeacherUser request){
        TeacherUserProto.TeacherUserDTO dto = (TeacherUserProto.TeacherUserDTO) toGRpcMessage(request,
                TeacherUserProto.TeacherUserDTO.newBuilder());
        TeacherUserProto.TeacherUserResponse response = blockingStub.query(dto);
        return (BaseResponse) fromGRpcMessage(response, BaseResponse.class, TeacherUser.class);
    }

    /**
     * <pre>
     *查询所有教师用户
     * </pre>
     */
    public BaseResponse selectAll(TeacherUser request){
        TeacherUserProto.TeacherUserDTO dto = (TeacherUserProto.TeacherUserDTO) toGRpcMessage(request,
                TeacherUserProto.TeacherUserDTO.newBuilder());
        TeacherUserProto.TeacherUserResponse response = blockingStub.selectAll(dto);
        return (BaseResponse) fromGRpcMessage(response, BaseResponse.class, TeacherUser.class);
    }

    /**
     * <pre>
     *登录验证
     * </pre>
     */
    public BaseResponse login(TeacherUser request){
        TeacherUserProto.TeacherUserDTO dto = (TeacherUserProto.TeacherUserDTO) toGRpcMessage(request,
                TeacherUserProto.TeacherUserDTO.newBuilder());
        TeacherUserProto.TeacherUserLoginResponse response = blockingStub.login(dto);
        return (BaseResponse) fromGRpcMessage(response, BaseResponse.class, TeacherUser.class);
    }

    /**
     * <pre>
     *根据姓名查询id
     * </pre>
     */
    public BaseResponse queryId(TeacherUser request){
        TeacherUserProto.TeacherUserDTO dto = (TeacherUserProto.TeacherUserDTO) toGRpcMessage(request,
                TeacherUserProto.TeacherUserDTO.newBuilder());
        TeacherUserProto.TeacherUserResponse response = blockingStub.queryId(dto);
        return (BaseResponse) fromGRpcMessage(response, BaseResponse.class, TeacherUser.class);
    }

    /**
     * <pre>
     *根据团队id查询用户
     * </pre>
     */
    public BaseResponse selectByTeamId(TeacherUser request){
        TeacherUserProto.TeacherUserDTO dto = (TeacherUserProto.TeacherUserDTO) toGRpcMessage(request,
                TeacherUserProto.TeacherUserDTO.newBuilder());
        TeacherUserProto.TeacherUserResponse response = blockingStub.selectByTeamId(dto);
        return (BaseResponse) fromGRpcMessage(response, BaseResponse.class, TeacherUser.class);
    }

}
