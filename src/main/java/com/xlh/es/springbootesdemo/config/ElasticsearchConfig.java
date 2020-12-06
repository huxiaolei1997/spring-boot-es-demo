package com.xlh.es.springbootesdemo.config;

import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2020年12月06日 20:55 胡晓磊 Exp $
 */
@Configuration
public class ElasticsearchConfig {

    @Value("${spring.elasticsearch.cluster-nodes}")
    private String clusterNodes;

    @Value("${spring.elasticsearch.cluster-name}")
    private String clusterName;

    @Bean
    public RestHighLevelClient restHighLevelClient() {
        String[] nodes = clusterNodes.split(",");
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(nodes)
                .build();

        return RestClients.create(clientConfiguration).rest();
    }
}
