package cn.wolfcode.feign;


import cn.wolfcode.common.web.Result;
import cn.wolfcode.domain.SeckillProductVo;
import cn.wolfcode.feign.fallback.ProductFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 这是一个远程调用类，调用了秒杀服务，并关联了降级类
 * This is a remote call class with Feign that calls seckill-server
 * and associates the Fallback class
 */

@FeignClient(name = "seckill-service",fallback = ProductFeignFallback.class)
public interface SeckillProductFeignApi {

    @RequestMapping("/skillProduct/queryTime")
    Result<List<SeckillProductVo>>  queryByTime(@RequestParam("time") int time);

}
