package cn.wolfcode.job;


import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 一个秒杀相关的定时任务
 */
@Setter@Getter
@Component
@Slf4j
public class MyInitSeckillProduct implements SimpleJob {

    @Value("${jobCron.initSeckillProduct}")
    private String cron;


    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("分片参数为"+shardingContext.getShardingParameter());
        //System.out.println("任务已经被执行了");
        doWork(shardingContext.getShardingParameter());
    }

    private void doWork(String shardingParameter) {
        //1 远程调用秒杀服务把数据查询出来

        //2 查询出来的数据放入到redis当中

    }
}
