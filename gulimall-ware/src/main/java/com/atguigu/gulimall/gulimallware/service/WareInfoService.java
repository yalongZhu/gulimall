package com.atguigu.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.gulimallware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author yalongZhu
 * @email 1032065185@qq.com
 * @date 2022-05-19 14:56:02
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

