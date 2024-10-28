package com.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Training;
@Service("trainingService")
public interface TrainingService {
	// 插入数据 调用trainingDAO里的insertTraining配置
	public int insertTraining(Training training);

	// 更新数据 调用trainingDAO里的updateTraining配置
	public int updateTraining(Training training);

	// 删除数据 调用trainingDAO里的deleteTraining配置
	public int deleteTraining(String trainingid);

	// 查询全部数据 调用trainingDAO里的getAllTraining配置
	public List<Training> getAllTraining();

	// 按照Training类里面的字段名称精确查询 调用trainingDAO里的getTrainingByCond配置
	public List<Training> getTrainingByCond(Training training);

	// 按照Training类里面的字段名称模糊查询 调用trainingDAO里的getTrainingByLike配置
	public List<Training> getTrainingByLike(Training training);

	// 按主键查询表返回单一的Training实例 调用trainingDAO里的getTrainingById配置
	public Training getTrainingById(String trainingid);

}

