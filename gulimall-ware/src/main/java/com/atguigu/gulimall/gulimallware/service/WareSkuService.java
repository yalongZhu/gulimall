package com.atguigu.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.gulimallware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author yalongZhu
 * @email 1032065185@qq.com
 * @date 2022-05-19 14:56:02
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

