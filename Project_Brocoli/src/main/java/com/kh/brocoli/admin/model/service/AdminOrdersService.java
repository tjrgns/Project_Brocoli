package com.kh.brocoli.admin.model.service;

import java.util.ArrayList;

import com.kh.brocoli.member.model.vo.Change;
import com.kh.brocoli.member.model.vo.Orders;
import com.kh.brocoli.member.model.vo.Reject;

public interface AdminOrdersService {

	/**
	 * 작성자 : 신은지
	 * 1.주문현황 목록 list Service
	 * @return
	 */
	ArrayList<Orders> selectOrdersList();

	/**
	 * 작성자 : 신은지
	 * 2. Ajax 주문현황 상태 변경
	 * @param orderStatus
	 * @return
	 */
	int orderStatusChange(Orders orders);

	/**
	 * 작성자 : 신은지
	 * 3. 교환list 
	 * @return
	 */
	ArrayList<Change> selectChangeList();

	/**
	 * 작성자 : 신은지
	 * 4. 환불 list
	 * @return
	 */
	ArrayList<Reject> selectRejectList();


}
