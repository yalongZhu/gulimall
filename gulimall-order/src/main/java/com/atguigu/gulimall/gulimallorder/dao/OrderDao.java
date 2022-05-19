package com.atguigu.gulimall.gulimallorder.dao;

import com.atguigu.gulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yalongZhu
 * @email 1032065185@qq.com
 * @date 2022-05-19 14:43:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
