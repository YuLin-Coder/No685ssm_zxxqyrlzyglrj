package com.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.TrainingDAO;
import com.entity.Training;
import com.service.TrainingService;

@Service("trainingService")
public class TrainingServiceImpl implements TrainingService {
	@Autowired
	private TrainingDAO trainingDAO;
	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertTraining(Training training) {
		return this.trainingDAO.insertTraining(training);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateTraining(Training training) {
		return this.trainingDAO.updateTraining(training);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteTraining(String trainingid) {
		return this.trainingDAO.deleteTraining(trainingid);
	}

	@Override // 继承接口的查询全部
	public List<Training> getAllTraining() {
		return this.trainingDAO.getAllTraining();
	}

	@Override // 继承接口的按条件精确查询
	public List<Training> getTrainingByCond(Training training) {
		return this.trainingDAO.getTrainingByCond(training);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Training> getTrainingByLike(Training training) {
		return this.trainingDAO.getTrainingByLike(training);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Training getTrainingById(String trainingid) {
		return this.trainingDAO.getTrainingById(trainingid);
	}

}


