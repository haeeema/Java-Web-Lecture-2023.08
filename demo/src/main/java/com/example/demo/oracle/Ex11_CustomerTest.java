package com.example.demo.oracle;

import java.util.List;

public class Ex11_CustomerTest {
	public static void main(String[] args) {
		CustomerDao cDao = new CustomerDao();
		
		// custId 값으로 검색해서 Customer 객체를 구하고 출력
//		Customer c1 = cDao.getCustomer(6);
//		System.out.println(c1);
//		System.out.println();

		// Insert
//		Customer c3 = new Customer(9, "김민재", "독일 뮌헨", "010-3333-7777");
//		cDao.insertCustomer(c3);
		
		// Update
//		Customer c4 = cDao.getCustomer(8);
//		c4.setName("손흥민");
//		c4.setAddr("영국 런던");
//		c4.setPhone("010-3456-9876");
//		cDao.updateCustomer(c4);
		
		// Delete
//		cDao.deleteCustomer(9);
		
		// Customer List를 가져옴
//		List<Customer> list = cDao.getCustomerList();
//		for (Customer c2: list)
//			System.out.println(c2);
		
//		List<Customer> list1 = cDao.getCustomerListByAddress("대한민국");
//		for (Customer c5: list1)
//			System.out.println(c5);
	
//		System.out.println("Lastname+++++++++++++++");
//		List<Customer> list2 = cDao.getCustomerListByLastname("박");
//		for (Customer c6: list2)
//			System.out.println(c6);
		
		System.out.println();
		List<Customer> list3 = cDao.getCustomerListByFieldAndQuery("name", "박");
		for (Customer c7: list3)
			System.out.println(c7);
	}
}
