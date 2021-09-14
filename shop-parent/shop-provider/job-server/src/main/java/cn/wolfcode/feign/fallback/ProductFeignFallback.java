package cn.wolfcode.feign.fallback;

import cn.wolfcode.common.web.Result;
import cn.wolfcode.domain.SeckillProductVo;
import cn.wolfcode.feign.SeckillProductFeignApi;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 这是一个降级类，可以用来提供兜底数据，防止雪崩
 * This is a FallBack class .
 * It can provide Bottom data and prevent avalanche.
 */

@Component
public class ProductFeignFallback implements SeckillProductFeignApi {


    @Override
    public Result<List<SeckillProductVo>> queryByTime(int time) {
        return null;
    }
}
