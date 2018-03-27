package cn.vpclub.graduation.project.config;

import cn.vpclub.graduation.project.api.TeamServiceGrpc;
import cn.vpclub.spring.boot.grpc.annotations.GRpcClient;
import io.grpc.ManagedChannel;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class TeamGrpcConfiguration {
    /*
    注意，这里的名称和yml配置文件的名称对应
        grpc\client\micro-service-provider:
    */
    @GRpcClient("graduation-project-provider")
    private ManagedChannel channel;
    /*
        * 注意：此处只能以工厂方法注入，忘记服务名称叫什么，请查看你的proto文件的描述定义
        * 或者到target\generated-sources\protobuf\grpc-java 目录查看
        * */
    @Bean
    public TeamServiceGrpc.TeamServiceBlockingStub teamServiceBlockingStub() {
        return TeamServiceGrpc.newBlockingStub(channel);
    }
}
