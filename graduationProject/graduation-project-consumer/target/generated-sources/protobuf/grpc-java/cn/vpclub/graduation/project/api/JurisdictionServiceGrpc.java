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
    comments = "Source: jurisdiction.proto")
public class JurisdictionServiceGrpc {

  private JurisdictionServiceGrpc() {}

  public static final String SERVICE_NAME = "JurisdictionService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO,
      cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> METHOD_ADD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "JurisdictionService", "add"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO,
      cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "JurisdictionService", "delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO,
      cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "JurisdictionService", "update"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO,
      cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> METHOD_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "JurisdictionService", "query"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO,
      cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> METHOD_SELECT_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "JurisdictionService", "selectAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JurisdictionServiceStub newStub(io.grpc.Channel channel) {
    return new JurisdictionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JurisdictionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JurisdictionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static JurisdictionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JurisdictionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class JurisdictionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *添加权限角色
     * </pre>
     */
    public void add(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD, responseObserver);
    }

    /**
     * <pre>
     *删除权限角色
     * </pre>
     */
    public void delete(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     * <pre>
     *修改权限角色
     * </pre>
     */
    public void update(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     * <pre>
     *查询单个权限角色名称
     * </pre>
     */
    public void query(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY, responseObserver);
    }

    /**
     * <pre>
     *查询所有权限角色
     * </pre>
     */
    public void selectAll(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_ALL, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO,
                cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO,
                cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO,
                cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO,
                cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse>(
                  this, METHODID_QUERY)))
          .addMethod(
            METHOD_SELECT_ALL,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO,
                cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse>(
                  this, METHODID_SELECT_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class JurisdictionServiceStub extends io.grpc.stub.AbstractStub<JurisdictionServiceStub> {
    private JurisdictionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JurisdictionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JurisdictionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JurisdictionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加权限角色
     * </pre>
     */
    public void add(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除权限角色
     * </pre>
     */
    public void delete(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *修改权限角色
     * </pre>
     */
    public void update(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询单个权限角色名称
     * </pre>
     */
    public void query(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询所有权限角色
     * </pre>
     */
    public void selectAll(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_ALL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JurisdictionServiceBlockingStub extends io.grpc.stub.AbstractStub<JurisdictionServiceBlockingStub> {
    private JurisdictionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JurisdictionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JurisdictionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JurisdictionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加权限角色
     * </pre>
     */
    public cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse add(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD, getCallOptions(), request);
    }

    /**
     * <pre>
     *删除权限角色
     * </pre>
     */
    public cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse delete(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     * <pre>
     *修改权限角色
     * </pre>
     */
    public cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse update(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *查询单个权限角色名称
     * </pre>
     */
    public cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse query(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY, getCallOptions(), request);
    }

    /**
     * <pre>
     *查询所有权限角色
     * </pre>
     */
    public cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse selectAll(cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_ALL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JurisdictionServiceFutureStub extends io.grpc.stub.AbstractStub<JurisdictionServiceFutureStub> {
    private JurisdictionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JurisdictionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JurisdictionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JurisdictionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加权限角色
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> add(
        cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request);
    }

    /**
     * <pre>
     *删除权限角色
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> delete(
        cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     * <pre>
     *修改权限角色
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> update(
        cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *查询单个权限角色名称
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> query(
        cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request);
    }

    /**
     * <pre>
     *查询所有权限角色
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse> selectAll(
        cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO request) {
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
    private final JurisdictionServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(JurisdictionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse>) responseObserver);
          break;
        case METHODID_SELECT_ALL:
          serviceImpl.selectAll((cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.JurisdictionProto.JurisdictionResponse>) responseObserver);
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
