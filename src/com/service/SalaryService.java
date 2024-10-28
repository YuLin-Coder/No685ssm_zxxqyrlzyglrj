package com.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Salary;
@Service("salaryService")
public interface SalaryService {
	// 插入数据 调用salaryDAO里的insertSalary配置
	public int insertSalary(Salary salary);

	// 更新数据 调用salaryDAO里的updateSalary配置
	public int updateSalary(Salary salary);

	// 删除数据 调用salaryDAO里的deleteSalary配置
	public int deleteSalary(String salaryid);

	// 查询全部数据 调用salaryDAO里的getAllSalary配置
	public List<Salary> getAllSalary();

	// 按照Salary类里面的字段名称精确查询 调用salaryDAO里的getSalaryByCond配置
	public List<Salary> getSalaryByCond(Salary salary);

	// 按照Salary类里面的字段名称模糊查询 调用salaryDAO里的getSalaryByLike配置
	public List<Salary> getSalaryByLike(Salary salary);

	// 按主键查询表返回单一的Salary实例 调用salaryDAO里的getSalaryById配置
	public Salary getSalaryById(String salaryid);

}

