package cn.vpclub.graduation.project.api;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: curriculum.proto")
public class CurriculumServiceGrpc {

  private CurriculumServiceGrpc() {}

  public static final String SERVICE_NAME = "CurriculumService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO,
      cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> METHOD_ADD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "CurriculumService", "add"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO,
      cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "CurriculumService", "delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO,
      cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "CurriculumService", "update"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO,
      cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> METHOD_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "CurriculumService", "query"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO,
      cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> METHOD_SELECT_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "CurriculumService", "selectAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CurriculumServiceStub newStub(io.grpc.Channel channel) {
    return new CurriculumServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CurriculumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CurriculumServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CurriculumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CurriculumServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CurriculumServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *添加课程
     * </pre>
     */
    public void add(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD, responseObserver);
    }

    /**
     * <pre>
     *删除课程
     * </pre>
     */
    public void delete(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     * <pre>
     *修改课程
     * </pre>
     */
    public void update(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     * <pre>
     *查询单个课程
     * </pre>
     */
    public void query(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY, responseObserver);
    }

    /**
     * <pre>
     *查询所有课程
     * </pre>
     */
    public void selectAll(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_ALL, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO,
                cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO,
                cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO,
                cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO,
                cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse>(
                  this, METHODID_QUERY)))
          .addMethod(
            METHOD_SELECT_ALL,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO,
                cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse>(
                  this, METHODID_SELECT_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class CurriculumServiceStub extends io.grpc.stub.AbstractStub<CurriculumServiceStub> {
    private CurriculumServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurriculumServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurriculumServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurriculumServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加课程
     * </pre>
     */
    public void add(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除课程
     * </pre>
     */
    public void delete(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *修改课程
     * </pre>
     */
    public void update(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询单个课程
     * </pre>
     */
    public void query(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询所有课程
     * </pre>
     */
    public void selectAll(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_ALL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CurriculumServiceBlockingStub extends io.grpc.stub.AbstractStub<CurriculumServiceBlockingStub> {
    private CurriculumServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurriculumServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurriculumServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurriculumServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加课程
     * </pre>
     */
    public cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse add(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD, getCallOptions(), request);
    }

    /**
     * <pre>
     *删除课程
     * </pre>
     */
    public cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse delete(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     * <pre>
     *修改课程
     * </pre>
     */
    public cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse update(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *查询单个课程
     * </pre>
     */
    public cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse query(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY, getCallOptions(), request);
    }

    /**
     * <pre>
     *查询所有课程
     * </pre>
     */
    public cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse selectAll(cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_ALL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CurriculumServiceFutureStub extends io.grpc.stub.AbstractStub<CurriculumServiceFutureStub> {
    private CurriculumServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CurriculumServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurriculumServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CurriculumServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加课程
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> add(
        cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request);
    }

    /**
     * <pre>
     *删除课程
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> delete(
        cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     * <pre>
     *修改课程
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> update(
        cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *查询单个课程
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> query(
        cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request);
    }

    /**
     * <pre>
     *查询所有课程
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse> selectAll(
        cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELECT_ALL, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_QUERY = 3;
  private static final int METHODID_SELECT_ALL = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CurriculumServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(CurriculumServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse>) responseObserver);
          break;
        case METHODID_SELECT_ALL:
          serviceImpl.selectAll((cn.vpclub.graduation.project.api.CurriculumProto.CurriculumDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.CurriculumProto.CurriculumResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_ADD,
        METHOD_DELETE,
        METHOD_UPDATE,
        METHOD_QUERY,
        METHOD_SELECT_ALL);
  }

}
