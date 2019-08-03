package config.controller;

import java.util.List;
import java.util.Scanner;

import config.DBconnection;
import config.service.EmpService;
import config.vo.EmpVO;

public class EmpController {
	public static void main(String[] args) {

		EmpService ss = new EmpService();
		
		
		System.out.println("사원번호를 입력하세요  >>    ");

		Scanner sc = new Scanner(System.in);

		String empno = sc.nextLine();
		
		DBconnection dd = new DBconnection();

		List<EmpVO> list = ss.select_emp_service();

		for (int i = 0; i < list.size(); i++) {
			System.out.println("==================================");
			System.out.println("조회하신 사원번호 : " + list.get(i).getEmpno());
			System.out.println(list.get(i).getEname());
			System.out.println(list.get(i).getSal());
			System.out.println(list.get(i).getDeptno());
			System.out.println(list.get(i).getComm());
			System.out.println(list.get(i).getHiredate());
			System.out.println(list.get(i).getJob());
			System.out.println(list.get(i).getMgr());
			System.out.println("==================================");
		}
	}
}
