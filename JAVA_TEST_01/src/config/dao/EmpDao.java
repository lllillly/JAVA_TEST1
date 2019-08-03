package config.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.DBconnection;
import config.controller.EmpController;
import config.vo.EmpVO;

public class EmpDao {

	public List<EmpVO> emp_dao() {
		
		DBconnection db = new DBconnection();
		
		String query = "";
		query += " SELECT ";
		query += " 		EMPNO, ";
		query += " 		ENAME, ";
		query += " 		SAL, ";
		query += " 		DEPTNO, ";
		query += " 		COMM, ";
		query += " 		HIREDATE ";
		query += " FROM EMP ";
//		query += "WHERE EMPNO = ' " +  + " ' ";
//		where절.......

		
		
		
		ResultSet rs = db.selectQuery(query);
		
		List<EmpVO> list = new ArrayList<EmpVO>();
		
		try {
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getNString("EMPNO"));
				vo.setEname(rs.getNString("ENAME"));
				vo.setSal(rs.getNString("SAL"));
				vo.setDeptno(rs.getNString("DEPTNO"));
				vo.setComm(rs.getNString("COMM"));
				vo.setHiredate(rs.getNString("HIREDATE"));
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}

		
}
