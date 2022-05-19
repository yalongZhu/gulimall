package com.atguigu.gulimall.gulimallmember.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @title: CouponFeignService
 * @projectName gulimall
 * @description: TODO
 * @date 2022-05-19-17:10
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
