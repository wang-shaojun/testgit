package cn.vpclub.graduation.project.rpc;

/*
* 描述：专业
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.api.SpecidtyProto;
import cn.vpclub.graduation.project.api.SpecidtyServiceGrpc;
import cn.vpclub.graduation.project.entity.Specidty;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.fromGRpcMessage;
import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.toGRpcMessage;

@Service
@Slf4j
@AllArgsConstructor
public class SpecidtyRpcService {

    private SpecidtyServiceGrpc.SpecidtyServiceBlockingStub blockingStub;

    /**
     * <pre>
     *添加专业
     * </pre>
     */
    public BaseResponse add(Specidty request) {

        SpecidtyProto.SpecidtyDTO dto= (SpecidtyProto.SpecidtyDTO) toGRpcMessage(request,
                SpecidtyProto.SpecidtyDTO.newBuilder());
        SpecidtyProto.SpecidtyResponse response=blockingStub.add(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Specidty.class);
    }

    /**
     * <pre>
     *删除专业
     * </pre>
     */
    public BaseResponse delete(Specidty request) {

        SpecidtyProto.SpecidtyDTO dto= (SpecidtyProto.SpecidtyDTO) toGRpcMessage(request,
                SpecidtyProto.SpecidtyDTO.newBuilder());
        SpecidtyProto.SpecidtyResponse response=blockingStub.delete(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Specidty.class);
    }

    /**
     * <pre>
     *修改专业
     * </pre>
     */
    public BaseResponse update(Specidty request) {

        SpecidtyProto.SpecidtyDTO dto= (SpecidtyProto.SpecidtyDTO) toGRpcMessage(request,
                SpecidtyProto.SpecidtyDTO.newBuilder());
        SpecidtyProto.SpecidtyResponse response=blockingStub.update(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Specidty.class);
    }

    /**
     * <pre>
     *查询单个专业
     * </pre>
     */
    public BaseResponse query(Specidty request) {

        SpecidtyProto.SpecidtyDTO dto= (SpecidtyProto.SpecidtyDTO) toGRpcMessage(request,
                SpecidtyProto.SpecidtyDTO.newBuilder());
        SpecidtyProto.SpecidtyResponse response=blockingStub.query(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Specidty.class);
    }

    /**
     * <pre>
     *查询所有专业
     * </pre>
     */
    public BaseResponse selectAll(Specidty request) {

        SpecidtyProto.SpecidtyDTO dto= (SpecidtyProto.SpecidtyDTO) toGRpcMessage(request,
                SpecidtyProto.SpecidtyDTO.newBuilder());
        SpecidtyProto.SpecidtyResponse response=blockingStub.selectAll(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Specidty.class);
    }

}
