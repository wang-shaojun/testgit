package cn.vpclub.graduation.project.rpc;

/*
* 描述：课程
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.api.CurriculumProto;
import cn.vpclub.graduation.project.api.CurriculumServiceGrpc;
import cn.vpclub.graduation.project.entity.Curriculum;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.fromGRpcMessage;
import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.toGRpcMessage;

@Service
@Slf4j
@AllArgsConstructor
public class CurriculumRpcService {

    private CurriculumServiceGrpc.CurriculumServiceBlockingStub blockingStub;

    /**
     * <pre>
     *添加课程
     * </pre>
     */
    public BaseResponse add(Curriculum request) {

        CurriculumProto.CurriculumDTO dto= (CurriculumProto.CurriculumDTO) toGRpcMessage(request,
                CurriculumProto.CurriculumDTO.newBuilder());
        CurriculumProto.CurriculumResponse response=blockingStub.add(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Curriculum.class);
    }

    /**
     * <pre>
     *删除课程
     * </pre>
     */
    public BaseResponse delete(Curriculum request) {

        CurriculumProto.CurriculumDTO dto= (CurriculumProto.CurriculumDTO) toGRpcMessage(request,
                CurriculumProto.CurriculumDTO.newBuilder());
        CurriculumProto.CurriculumResponse response=blockingStub.delete(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Curriculum.class);
    }

    /**
     * <pre>
     *修改课程
     * </pre>
     */
    public BaseResponse update(Curriculum request) {
        CurriculumProto.CurriculumDTO dto= (CurriculumProto.CurriculumDTO) toGRpcMessage(request,
                CurriculumProto.CurriculumDTO.newBuilder());
        CurriculumProto.CurriculumResponse response=blockingStub.update(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Curriculum.class);
    }

    /**
     * <pre>
     *查询单个课程
     * </pre>
     */
    public BaseResponse query(Curriculum request) {
        CurriculumProto.CurriculumDTO dto= (CurriculumProto.CurriculumDTO) toGRpcMessage(request,
                CurriculumProto.CurriculumDTO.newBuilder());
        CurriculumProto.CurriculumResponse response=blockingStub.query(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Curriculum.class);
    }

    /**
     * <pre>
     *查询所有课程
     * </pre>
     */
    public BaseResponse selectAll(Curriculum request) {
        CurriculumProto.CurriculumDTO dto= (CurriculumProto.CurriculumDTO) toGRpcMessage(request,
                CurriculumProto.CurriculumDTO.newBuilder());
        CurriculumProto.CurriculumResponse response=blockingStub.selectAll(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Curriculum.class);
    }

}
