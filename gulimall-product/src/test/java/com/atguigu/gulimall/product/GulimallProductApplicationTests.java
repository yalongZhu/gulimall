package com.atguigu.gulimall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("huawei");
//        brandService.save(brandEntity);
//        System.out.println("save success");
//        brandService.updateById(brandEntity);
//        System.out.println("update success");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });

    }

    @Test
    void testUpload() throws FileNotFoundException {
//        String endpoint = "oss-cn-shenzhen.aliyuncs.com";
//        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5tJcwnhokAPdHR1VLdka";
//        String accessKeySecret = "UkET5z4z6uDI8cWklaamjNhF9FnSiv";
//
//        // 填写Bucket名称，例如examplebucket。
        String bucketName = "gulimall-yalong";
//        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
        String objectName = "oppo.png";
//        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
//        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
        String filePath= "E:\\谷粒mall\\docs\\pics\\oppo.png";
//
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
        InputStream inputStream = new FileInputStream(filePath);
//        // 创建PutObject请求。
        ossClient.putObject(bucketName, objectName, inputStream);
        ossClient.shutdown();

        System.out.println("success");
    }
}



