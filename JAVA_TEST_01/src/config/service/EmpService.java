package config.service;

import java.util.List;

import config.dao.EmpDao;
import config.vo.EmpVO;

/*
 * @return slist
 */

public class EmpService {

	EmpDao eDao = new EmpDao();

	public List<EmpVO> select_emp_service() {

		List<EmpVO> sList = eDao.emp_dao();

		return sList;

	}
}
