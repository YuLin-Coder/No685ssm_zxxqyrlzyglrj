package com.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Attend;
@Service("attendService")
public interface AttendService {
	// 插入数据 调用attendDAO里的insertAttend配置
	public int insertAttend(Attend attend);

	// 更新数据 调用attendDAO里的updateAttend配置
	public int updateAttend(Attend attend);

	// 删除数据 调用attendDAO里的deleteAttend配置
	public int deleteAttend(String attendid);

	// 查询全部数据 调用attendDAO里的getAllAttend配置
	public List<Attend> getAllAttend();

	// 按照Attend类里面的字段名称精确查询 调用attendDAO里的getAttendByCond配置
	public List<Attend> getAttendByCond(Attend attend);

	// 按照Attend类里面的字段名称模糊查询 调用attendDAO里的getAttendByLike配置
	public List<Attend> getAttendByLike(Attend attend);

	// 按主键查询表返回单一的Attend实例 调用attendDAO里的getAttendById配置
	public Attend getAttendById(String attendid);

}

