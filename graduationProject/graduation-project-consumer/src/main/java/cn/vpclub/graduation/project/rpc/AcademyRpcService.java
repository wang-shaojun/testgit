package cn.vpclub.graduation.project.rpc;

/*
* 描述：学院
* 作者：王少军
* 日期：2018年03月17日
* */

import cn.vpclub.graduation.project.api.AcademyProto;
import cn.vpclub.graduation.project.api.AcademyServiceGrpc;
import cn.vpclub.graduation.project.entity.Academy;
import cn.vpclub.moses.core.model.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.fromGRpcMessage;
import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.toGRpcMessage;

@Service
@Slf4j
@AllArgsConstructor
public class AcademyRpcService {

    private AcademyServiceGrpc.AcademyServiceBlockingStub blockingStub;

    /**
     * <pre>
     *添加学院
     * </pre>
     */
    public BaseResponse add(Academy request) {

        AcademyProto.AcademyDTO dto= (AcademyProto.AcademyDTO) toGRpcMessage(request,
                AcademyProto.AcademyDTO.newBuilder());
        AcademyProto.AcademyResponse response=blockingStub.add(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Academy.class);
    }

    /**
     * <pre>
     *删除学院
     * </pre>
     */
    public BaseResponse delete(Academy request) {

        AcademyProto.AcademyDTO dto= (AcademyProto.AcademyDTO) toGRpcMessage(request,
                AcademyProto.AcademyDTO.newBuilder());
        AcademyProto.AcademyResponse response=blockingStub.delete(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Academy.class);
    }

    /**
     * <pre>
     *修改学院
     * </pre>
     */
    public BaseResponse update(Academy request) {

        AcademyProto.AcademyDTO dto= (AcademyProto.AcademyDTO) toGRpcMessage(request,
                AcademyProto.AcademyDTO.newBuilder());
        AcademyProto.AcademyResponse response=blockingStub.update(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Academy.class);
    }

    /**
     * <pre>
     *查询单个学院
     * </pre>
     */
    public BaseResponse query(Academy request) {

        AcademyProto.AcademyDTO dto= (AcademyProto.AcademyDTO) toGRpcMessage(request,
                AcademyProto.AcademyDTO.newBuilder());
        AcademyProto.AcademyResponse response=blockingStub.query(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Academy.class);
    }

    /**
     * <pre>
     *查询所有学院
     * </pre>
     */
    public BaseResponse selectAll(Academy request) {

        AcademyProto.AcademyDTO dto= (AcademyProto.AcademyDTO) toGRpcMessage(request,
                AcademyProto.AcademyDTO.newBuilder());
        AcademyProto.AcademyResponse response=blockingStub.selectAll(dto);
        return (BaseResponse) fromGRpcMessage(response,BaseResponse.class,Academy.class);
    }

}
