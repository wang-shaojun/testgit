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
    comments = "Source: academy.proto")
public class AcademyServiceGrpc {

  private AcademyServiceGrpc() {}

  public static final String SERVICE_NAME = "AcademyService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO,
      cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> METHOD_ADD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "AcademyService", "add"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO,
      cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "AcademyService", "delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO,
      cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "AcademyService", "update"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO,
      cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> METHOD_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "AcademyService", "query"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO,
      cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> METHOD_SELECT_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "AcademyService", "selectAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AcademyServiceStub newStub(io.grpc.Channel channel) {
    return new AcademyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AcademyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AcademyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static AcademyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AcademyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AcademyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *添加学院
     * </pre>
     */
    public void add(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD, responseObserver);
    }

    /**
     * <pre>
     *删除学院
     * </pre>
     */
    public void delete(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     * <pre>
     *修改学院
     * </pre>
     */
    public void update(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     * <pre>
     *查询单个学院
     * </pre>
     */
    public void query(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY, responseObserver);
    }

    /**
     * <pre>
     *查询所有学院
     * </pre>
     */
    public void selectAll(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_ALL, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO,
                cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO,
                cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO,
                cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO,
                cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse>(
                  this, METHODID_QUERY)))
          .addMethod(
            METHOD_SELECT_ALL,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO,
                cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse>(
                  this, METHODID_SELECT_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class AcademyServiceStub extends io.grpc.stub.AbstractStub<AcademyServiceStub> {
    private AcademyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AcademyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcademyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AcademyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加学院
     * </pre>
     */
    public void add(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除学院
     * </pre>
     */
    public void delete(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *修改学院
     * </pre>
     */
    public void update(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询单个学院
     * </pre>
     */
    public void query(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询所有学院
     * </pre>
     */
    public void selectAll(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_ALL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AcademyServiceBlockingStub extends io.grpc.stub.AbstractStub<AcademyServiceBlockingStub> {
    private AcademyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AcademyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcademyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AcademyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加学院
     * </pre>
     */
    public cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse add(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD, getCallOptions(), request);
    }

    /**
     * <pre>
     *删除学院
     * </pre>
     */
    public cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse delete(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     * <pre>
     *修改学院
     * </pre>
     */
    public cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse update(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *查询单个学院
     * </pre>
     */
    public cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse query(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY, getCallOptions(), request);
    }

    /**
     * <pre>
     *查询所有学院
     * </pre>
     */
    public cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse selectAll(cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_ALL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AcademyServiceFutureStub extends io.grpc.stub.AbstractStub<AcademyServiceFutureStub> {
    private AcademyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AcademyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcademyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AcademyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加学院
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> add(
        cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request);
    }

    /**
     * <pre>
     *删除学院
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> delete(
        cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     * <pre>
     *修改学院
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> update(
        cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *查询单个学院
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> query(
        cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request);
    }

    /**
     * <pre>
     *查询所有学院
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse> selectAll(
        cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO request) {
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
    private final AcademyServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(AcademyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse>) responseObserver);
          break;
        case METHODID_SELECT_ALL:
          serviceImpl.selectAll((cn.vpclub.graduation.project.api.AcademyProto.AcademyDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.AcademyProto.AcademyResponse>) responseObserver);
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
