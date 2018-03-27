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
    comments = "Source: team.proto")
public class TeamServiceGrpc {

  private TeamServiceGrpc() {}

  public static final String SERVICE_NAME = "TeamService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeamProto.TeamDTO,
      cn.vpclub.graduation.project.api.TeamProto.TeamResponse> METHOD_ADD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeamService", "add"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeamProto.TeamDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeamProto.TeamResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeamProto.TeamDTO,
      cn.vpclub.graduation.project.api.TeamProto.TeamResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeamService", "delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeamProto.TeamDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeamProto.TeamResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeamProto.TeamDTO,
      cn.vpclub.graduation.project.api.TeamProto.TeamResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeamService", "update"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeamProto.TeamDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeamProto.TeamResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeamProto.TeamDTO,
      cn.vpclub.graduation.project.api.TeamProto.TeamResponse> METHOD_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeamService", "query"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeamProto.TeamDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeamProto.TeamResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeamProto.TeamDTO,
      cn.vpclub.graduation.project.api.TeamProto.TeamResponse> METHOD_SELECT_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeamService", "selectAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeamProto.TeamDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeamProto.TeamResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeamServiceStub newStub(io.grpc.Channel channel) {
    return new TeamServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TeamServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TeamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TeamServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TeamServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *添加团队
     * </pre>
     */
    public void add(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD, responseObserver);
    }

    /**
     * <pre>
     *删除团队
     * </pre>
     */
    public void delete(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     * <pre>
     *修改团队
     * </pre>
     */
    public void update(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     * <pre>
     *查询单个团队
     * </pre>
     */
    public void query(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY, responseObserver);
    }

    /**
     * <pre>
     *查询所有团队
     * </pre>
     */
    public void selectAll(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_ALL, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeamProto.TeamDTO,
                cn.vpclub.graduation.project.api.TeamProto.TeamResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeamProto.TeamDTO,
                cn.vpclub.graduation.project.api.TeamProto.TeamResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeamProto.TeamDTO,
                cn.vpclub.graduation.project.api.TeamProto.TeamResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeamProto.TeamDTO,
                cn.vpclub.graduation.project.api.TeamProto.TeamResponse>(
                  this, METHODID_QUERY)))
          .addMethod(
            METHOD_SELECT_ALL,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeamProto.TeamDTO,
                cn.vpclub.graduation.project.api.TeamProto.TeamResponse>(
                  this, METHODID_SELECT_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class TeamServiceStub extends io.grpc.stub.AbstractStub<TeamServiceStub> {
    private TeamServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeamServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeamServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加团队
     * </pre>
     */
    public void add(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除团队
     * </pre>
     */
    public void delete(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *修改团队
     * </pre>
     */
    public void update(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询单个团队
     * </pre>
     */
    public void query(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询所有团队
     * </pre>
     */
    public void selectAll(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_ALL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TeamServiceBlockingStub extends io.grpc.stub.AbstractStub<TeamServiceBlockingStub> {
    private TeamServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeamServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeamServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加团队
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeamProto.TeamResponse add(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD, getCallOptions(), request);
    }

    /**
     * <pre>
     *删除团队
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeamProto.TeamResponse delete(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     * <pre>
     *修改团队
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeamProto.TeamResponse update(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *查询单个团队
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeamProto.TeamResponse query(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY, getCallOptions(), request);
    }

    /**
     * <pre>
     *查询所有团队
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeamProto.TeamResponse selectAll(cn.vpclub.graduation.project.api.TeamProto.TeamDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_ALL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TeamServiceFutureStub extends io.grpc.stub.AbstractStub<TeamServiceFutureStub> {
    private TeamServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeamServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeamServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加团队
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> add(
        cn.vpclub.graduation.project.api.TeamProto.TeamDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request);
    }

    /**
     * <pre>
     *删除团队
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> delete(
        cn.vpclub.graduation.project.api.TeamProto.TeamDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     * <pre>
     *修改团队
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> update(
        cn.vpclub.graduation.project.api.TeamProto.TeamDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *查询单个团队
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> query(
        cn.vpclub.graduation.project.api.TeamProto.TeamDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request);
    }

    /**
     * <pre>
     *查询所有团队
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeamProto.TeamResponse> selectAll(
        cn.vpclub.graduation.project.api.TeamProto.TeamDTO request) {
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
    private final TeamServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(TeamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((cn.vpclub.graduation.project.api.TeamProto.TeamDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((cn.vpclub.graduation.project.api.TeamProto.TeamDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((cn.vpclub.graduation.project.api.TeamProto.TeamDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((cn.vpclub.graduation.project.api.TeamProto.TeamDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse>) responseObserver);
          break;
        case METHODID_SELECT_ALL:
          serviceImpl.selectAll((cn.vpclub.graduation.project.api.TeamProto.TeamDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeamProto.TeamResponse>) responseObserver);
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
