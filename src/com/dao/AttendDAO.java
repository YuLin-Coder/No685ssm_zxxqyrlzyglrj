package com.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Attend;

@Repository("attendDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface AttendDAO {

	/**
* AttendDAO 接口 可以按名称直接调用attend.xml配置文件的SQL语句
 */

	// 插入数据 调用entity包attend.xml里的insertAttend配置 返回值0(失败),1(成功)
	public int insertAttend(Attend attend);

	// 更新数据 调用entity包attend.xml里的updateAttend配置 返回值0(失败),1(成功)
	public int updateAttend(Attend attend);

	// 删除数据 调用entity包attend.xml里的deleteAttend配置 返回值0(失败),1(成功)
	public int deleteAttend(String attendid);

	// 查询全部数据 调用entity包attend.xml里的getAllAttend配置 返回List类型的数据
	public List<Attend> getAllAttend();

	// 按照Attend类里面的值精确查询 调用entity包attend.xml里的getAttendByCond配置 返回List类型的数据
	public List<Attend> getAttendByCond(Attend attend);

	// 按照Attend类里面的值模糊查询 调用entity包attend.xml里的getAttendByLike配置 返回List类型的数据
	public List<Attend> getAttendByLike(Attend attend);

	// 按主键查询表返回单一的Attend实例 调用entity包attend.xml里的getAttendById配置
	public Attend getAttendById(String attendid);

}


