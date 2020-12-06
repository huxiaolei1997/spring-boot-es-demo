package com.xlh.es.springbootesdemo;

import com.xlh.es.springbootesdemo.pojo.Stu;
import com.xlh.es.springbootesdemo.utils.EsUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.ReactiveElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;

import java.io.IOException;

@SpringBootTest
class SpringBootEsDemoApplicationTests {
    @Autowired
    private EsUtil esUtil;

//    ReactiveElasticsearchTemplate elasticsearchTemplate
    @Test
    void contextLoads() throws IOException {
//        Stu stu = new Stu();
//        stu.setStuId(1001L);
//        stu.setName("bat man");
//        stu.setAge(18);
////        new Stu()
//        IndexQuery indexQuery = new IndexQueryBuilder().withObject(stu).build();

        esUtil.createIndex("stu");
//        elasticsearchRestTemplate.index(indexQuery);
    }

}
