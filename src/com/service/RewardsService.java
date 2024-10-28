package com.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Rewards;
@Service("rewardsService")
public interface RewardsService {
	// 插入数据 调用rewardsDAO里的insertRewards配置
	public int insertRewards(Rewards rewards);

	// 更新数据 调用rewardsDAO里的updateRewards配置
	public int updateRewards(Rewards rewards);

	// 删除数据 调用rewardsDAO里的deleteRewards配置
	public int deleteRewards(String rewardsid);

	// 查询全部数据 调用rewardsDAO里的getAllRewards配置
	public List<Rewards> getAllRewards();

	// 按照Rewards类里面的字段名称精确查询 调用rewardsDAO里的getRewardsByCond配置
	public List<Rewards> getRewardsByCond(Rewards rewards);

	// 按照Rewards类里面的字段名称模糊查询 调用rewardsDAO里的getRewardsByLike配置
	public List<Rewards> getRewardsByLike(Rewards rewards);

	// 按主键查询表返回单一的Rewards实例 调用rewardsDAO里的getRewardsById配置
	public Rewards getRewardsById(String rewardsid);

}

