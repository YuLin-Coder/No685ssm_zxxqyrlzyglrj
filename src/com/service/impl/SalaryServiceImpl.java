package com.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.SalaryDAO;
import com.entity.Salary;
import com.service.SalaryService;

@Service("salaryService")
public class SalaryServiceImpl implements SalaryService {
	@Autowired
	private SalaryDAO salaryDAO;
	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertSalary(Salary salary) {
		return this.salaryDAO.insertSalary(salary);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateSalary(Salary salary) {
		return this.salaryDAO.updateSalary(salary);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteSalary(String salaryid) {
		return this.salaryDAO.deleteSalary(salaryid);
	}

	@Override // 继承接口的查询全部
	public List<Salary> getAllSalary() {
		return this.salaryDAO.getAllSalary();
	}

	@Override // 继承接口的按条件精确查询
	public List<Salary> getSalaryByCond(Salary salary) {
		return this.salaryDAO.getSalaryByCond(salary);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Salary> getSalaryByLike(Salary salary) {
		return this.salaryDAO.getSalaryByLike(salary);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Salary getSalaryById(String salaryid) {
		return this.salaryDAO.getSalaryById(salaryid);
	}

}


