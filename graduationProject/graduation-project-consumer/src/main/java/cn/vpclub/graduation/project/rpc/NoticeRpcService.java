package cn.vpclub.graduation.project.rpc;

/*
* 描述：公告消息
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.api.NoticeProto;
import cn.vpclub.graduation.project.api.NoticeServiceGrpc;
import cn.vpclub.graduation.project.entity.Notice;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.fromGRpcMessage;
import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.toGRpcMessage;

@Service
@Slf4j
@AllArgsConstructor
public class NoticeRpcService {

    private NoticeServiceGrpc.NoticeServiceBlockingStub blockingStub;

    /**
     * <pre>
     *添加公告消息
     * </pre>
     */
    public BaseResponse add(Notice request) {

        NoticeProto.NoticeDTO dto= (NoticeProto.NoticeDTO) toGRpcMessage(request,
                NoticeProto.NoticeDTO.newBuilder());
        NoticeProto.NoticeResponse response=blockingStub.add(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Notice.class);
    }

    /**
     * <pre>
     *删除公告消息
     * </pre>
     */
    public BaseResponse delete(Notice request) {

        NoticeProto.NoticeDTO dto= (NoticeProto.NoticeDTO) toGRpcMessage(request,
                NoticeProto.NoticeDTO.newBuilder());
        NoticeProto.NoticeResponse response=blockingStub.delete(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Notice.class);
    }

    /**
     * <pre>
     *修改公告消息
     * </pre>
     */
    public BaseResponse update(Notice request) {

        NoticeProto.NoticeDTO dto= (NoticeProto.NoticeDTO) toGRpcMessage(request,
                NoticeProto.NoticeDTO.newBuilder());
        NoticeProto.NoticeResponse response=blockingStub.update(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Notice.class);
    }

    /**
     * <pre>
     *查询单个公告消息
     * </pre>
     */
    public BaseResponse query(Notice request) {

        NoticeProto.NoticeDTO dto= (NoticeProto.NoticeDTO) toGRpcMessage(request,
                NoticeProto.NoticeDTO.newBuilder());
        NoticeProto.NoticeResponse response=blockingStub.query(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Notice.class);
    }

    /**
     * <pre>
     *查询所有公告消息
     * </pre>
     */
    public BaseResponse selectAll(Notice request) {

        NoticeProto.NoticeDTO dto= (NoticeProto.NoticeDTO) toGRpcMessage(request,
                NoticeProto.NoticeDTO.newBuilder());
        NoticeProto.NoticeResponse response=blockingStub.selectAll(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Notice.class);
    }

}
