package com.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Rewards;

@Repository("rewardsDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface RewardsDAO {

	/**
* RewardsDAO 接口 可以按名称直接调用rewards.xml配置文件的SQL语句
 */

	// 插入数据 调用entity包rewards.xml里的insertRewards配置 返回值0(失败),1(成功)
	public int insertRewards(Rewards rewards);

	// 更新数据 调用entity包rewards.xml里的updateRewards配置 返回值0(失败),1(成功)
	public int updateRewards(Rewards rewards);

	// 删除数据 调用entity包rewards.xml里的deleteRewards配置 返回值0(失败),1(成功)
	public int deleteRewards(String rewardsid);

	// 查询全部数据 调用entity包rewards.xml里的getAllRewards配置 返回List类型的数据
	public List<Rewards> getAllRewards();

	// 按照Rewards类里面的值精确查询 调用entity包rewards.xml里的getRewardsByCond配置 返回List类型的数据
	public List<Rewards> getRewardsByCond(Rewards rewards);

	// 按照Rewards类里面的值模糊查询 调用entity包rewards.xml里的getRewardsByLike配置 返回List类型的数据
	public List<Rewards> getRewardsByLike(Rewards rewards);

	// 按主键查询表返回单一的Rewards实例 调用entity包rewards.xml里的getRewardsById配置
	public Rewards getRewardsById(String rewardsid);

}


