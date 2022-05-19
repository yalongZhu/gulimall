package com.atguigu.gulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.gulimallmember.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yalongZhu
 * @email 1032065185@qq.com
 * @date 2022-05-19 14:39:00
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

