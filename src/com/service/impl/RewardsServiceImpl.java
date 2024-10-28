package com.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.RewardsDAO;
import com.entity.Rewards;
import com.service.RewardsService;

@Service("rewardsService")
public class RewardsServiceImpl implements RewardsService {
	@Autowired
	private RewardsDAO rewardsDAO;
	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertRewards(Rewards rewards) {
		return this.rewardsDAO.insertRewards(rewards);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateRewards(Rewards rewards) {
		return this.rewardsDAO.updateRewards(rewards);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteRewards(String rewardsid) {
		return this.rewardsDAO.deleteRewards(rewardsid);
	}

	@Override // 继承接口的查询全部
	public List<Rewards> getAllRewards() {
		return this.rewardsDAO.getAllRewards();
	}

	@Override // 继承接口的按条件精确查询
	public List<Rewards> getRewardsByCond(Rewards rewards) {
		return this.rewardsDAO.getRewardsByCond(rewards);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Rewards> getRewardsByLike(Rewards rewards) {
		return this.rewardsDAO.getRewardsByLike(rewards);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Rewards getRewardsById(String rewardsid) {
		return this.rewardsDAO.getRewardsById(rewardsid);
	}

}


