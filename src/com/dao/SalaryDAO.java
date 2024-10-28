package com.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Salary;

@Repository("salaryDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface SalaryDAO {

	/**
* SalaryDAO 接口 可以按名称直接调用salary.xml配置文件的SQL语句
 */

	// 插入数据 调用entity包salary.xml里的insertSalary配置 返回值0(失败),1(成功)
	public int insertSalary(Salary salary);

	// 更新数据 调用entity包salary.xml里的updateSalary配置 返回值0(失败),1(成功)
	public int updateSalary(Salary salary);

	// 删除数据 调用entity包salary.xml里的deleteSalary配置 返回值0(失败),1(成功)
	public int deleteSalary(String salaryid);

	// 查询全部数据 调用entity包salary.xml里的getAllSalary配置 返回List类型的数据
	public List<Salary> getAllSalary();

	// 按照Salary类里面的值精确查询 调用entity包salary.xml里的getSalaryByCond配置 返回List类型的数据
	public List<Salary> getSalaryByCond(Salary salary);

	// 按照Salary类里面的值模糊查询 调用entity包salary.xml里的getSalaryByLike配置 返回List类型的数据
	public List<Salary> getSalaryByLike(Salary salary);

	// 按主键查询表返回单一的Salary实例 调用entity包salary.xml里的getSalaryById配置
	public Salary getSalaryById(String salaryid);

}


