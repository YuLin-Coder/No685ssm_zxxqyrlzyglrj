package com.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Training;

@Repository("trainingDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface TrainingDAO {

	/**
* TrainingDAO 接口 可以按名称直接调用training.xml配置文件的SQL语句
 */

	// 插入数据 调用entity包training.xml里的insertTraining配置 返回值0(失败),1(成功)
	public int insertTraining(Training training);

	// 更新数据 调用entity包training.xml里的updateTraining配置 返回值0(失败),1(成功)
	public int updateTraining(Training training);

	// 删除数据 调用entity包training.xml里的deleteTraining配置 返回值0(失败),1(成功)
	public int deleteTraining(String trainingid);

	// 查询全部数据 调用entity包training.xml里的getAllTraining配置 返回List类型的数据
	public List<Training> getAllTraining();

	// 按照Training类里面的值精确查询 调用entity包training.xml里的getTrainingByCond配置 返回List类型的数据
	public List<Training> getTrainingByCond(Training training);

	// 按照Training类里面的值模糊查询 调用entity包training.xml里的getTrainingByLike配置 返回List类型的数据
	public List<Training> getTrainingByLike(Training training);

	// 按主键查询表返回单一的Training实例 调用entity包training.xml里的getTrainingById配置
	public Training getTrainingById(String trainingid);

}


