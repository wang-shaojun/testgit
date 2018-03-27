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
    comments = "Source: teacheruser.proto")
public class TeacherUserServiceGrpc {

  private TeacherUserServiceGrpc() {}

  public static final String SERVICE_NAME = "TeacherUserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
      cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> METHOD_ADD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeacherUserService", "add"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
      cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeacherUserService", "delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
      cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeacherUserService", "update"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
      cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> METHOD_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeacherUserService", "query"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
      cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> METHOD_SELECT_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeacherUserService", "selectAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
      cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserLoginResponse> METHOD_LOGIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeacherUserService", "login"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserLoginResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
      cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> METHOD_QUERY_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeacherUserService", "queryId"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
      cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> METHOD_SELECT_BY_TEAM_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TeacherUserService", "selectByTeamId"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeacherUserServiceStub newStub(io.grpc.Channel channel) {
    return new TeacherUserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeacherUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TeacherUserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TeacherUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TeacherUserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TeacherUserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *添加教师用户
     * </pre>
     */
    public void add(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD, responseObserver);
    }

    /**
     * <pre>
     *删除教师用户
     * </pre>
     */
    public void delete(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     * <pre>
     *修改教师用户
     * </pre>
     */
    public void update(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     * <pre>
     *查询单个教师用户
     * </pre>
     */
    public void query(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY, responseObserver);
    }

    /**
     * <pre>
     *查询所有教师用户
     * </pre>
     */
    public void selectAll(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_ALL, responseObserver);
    }

    /**
     * <pre>
     *登录验证
     * </pre>
     */
    public void login(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserLoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGIN, responseObserver);
    }

    /**
     * <pre>
     *根据姓名查询id
     * </pre>
     */
    public void queryId(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY_ID, responseObserver);
    }

    /**
     * <pre>
     *根据团队id查询用户
     * </pre>
     */
    public void selectByTeamId(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_BY_TEAM_ID, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>(
                  this, METHODID_QUERY)))
          .addMethod(
            METHOD_SELECT_ALL,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>(
                  this, METHODID_SELECT_ALL)))
          .addMethod(
            METHOD_LOGIN,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserLoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            METHOD_QUERY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>(
                  this, METHODID_QUERY_ID)))
          .addMethod(
            METHOD_SELECT_BY_TEAM_ID,
            asyncUnaryCall(
              new MethodHandlers<
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO,
                cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>(
                  this, METHODID_SELECT_BY_TEAM_ID)))
          .build();
    }
  }

  /**
   */
  public static final class TeacherUserServiceStub extends io.grpc.stub.AbstractStub<TeacherUserServiceStub> {
    private TeacherUserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherUserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherUserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherUserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加教师用户
     * </pre>
     */
    public void add(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除教师用户
     * </pre>
     */
    public void delete(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *修改教师用户
     * </pre>
     */
    public void update(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询单个教师用户
     * </pre>
     */
    public void query(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询所有教师用户
     * </pre>
     */
    public void selectAll(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_ALL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *登录验证
     * </pre>
     */
    public void login(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserLoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据姓名查询id
     * </pre>
     */
    public void queryId(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据团队id查询用户
     * </pre>
     */
    public void selectByTeamId(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request,
        io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_BY_TEAM_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TeacherUserServiceBlockingStub extends io.grpc.stub.AbstractStub<TeacherUserServiceBlockingStub> {
    private TeacherUserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherUserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherUserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherUserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加教师用户
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse add(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD, getCallOptions(), request);
    }

    /**
     * <pre>
     *删除教师用户
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse delete(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     * <pre>
     *修改教师用户
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse update(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *查询单个教师用户
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse query(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY, getCallOptions(), request);
    }

    /**
     * <pre>
     *查询所有教师用户
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse selectAll(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_ALL, getCallOptions(), request);
    }

    /**
     * <pre>
     *登录验证
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserLoginResponse login(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGIN, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据姓名查询id
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse queryId(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *根据团队id查询用户
     * </pre>
     */
    public cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse selectByTeamId(cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_BY_TEAM_ID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TeacherUserServiceFutureStub extends io.grpc.stub.AbstractStub<TeacherUserServiceFutureStub> {
    private TeacherUserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherUserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherUserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherUserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加教师用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> add(
        cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request);
    }

    /**
     * <pre>
     *删除教师用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> delete(
        cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     * <pre>
     *修改教师用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> update(
        cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *查询单个教师用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> query(
        cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request);
    }

    /**
     * <pre>
     *查询所有教师用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> selectAll(
        cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELECT_ALL, getCallOptions()), request);
    }

    /**
     * <pre>
     *登录验证
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserLoginResponse> login(
        cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据姓名查询id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> queryId(
        cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *根据团队id查询用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse> selectByTeamId(
        cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELECT_BY_TEAM_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_QUERY = 3;
  private static final int METHODID_SELECT_ALL = 4;
  private static final int METHODID_LOGIN = 5;
  private static final int METHODID_QUERY_ID = 6;
  private static final int METHODID_SELECT_BY_TEAM_ID = 7;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TeacherUserServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(TeacherUserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>) responseObserver);
          break;
        case METHODID_SELECT_ALL:
          serviceImpl.selectAll((cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserLoginResponse>) responseObserver);
          break;
        case METHODID_QUERY_ID:
          serviceImpl.queryId((cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>) responseObserver);
          break;
        case METHODID_SELECT_BY_TEAM_ID:
          serviceImpl.selectByTeamId((cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserDTO) request,
              (io.grpc.stub.StreamObserver<cn.vpclub.graduation.project.api.TeacherUserProto.TeacherUserResponse>) responseObserver);
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
        METHOD_SELECT_ALL,
        METHOD_LOGIN,
        METHOD_QUERY_ID,
        METHOD_SELECT_BY_TEAM_ID);
  }

}
