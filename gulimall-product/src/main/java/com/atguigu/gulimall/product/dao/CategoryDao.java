package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yalongZhu
 * @email 1032065185@qq.com
 * @date 2022-05-18 18:18:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}