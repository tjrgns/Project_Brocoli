package com.kh.brocoli.admin.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.brocoli.member.model.vo.Change;
import com.kh.brocoli.member.model.vo.Orders;
import com.kh.brocoli.member.model.vo.Reject;

@Repository("AODao")
public class AdminOrdersDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	/**
	 * 작성자 : 신은지 
	 * 1. 주문 현황 목록 list Dao
	 * @return
	 */
	public ArrayList<Orders> selectOrdersList() {
		return (ArrayList)sqlSession.selectList("AdminOrders.selectOrdersList");
	}

	/**
	 * 작성자 : 신은지
	 * 2. 주문 현황 상태 변화
	 * @param orderStatus
	 * @return
	 */
	public int orderStatusChange(Orders orders) {
		return sqlSession.update("AdminOrders.orderStatusChange",orders);
	}

	/**
	 * 작성자 : 신은지
	 * 3. 교환 list
	 * @return
	 */
	public ArrayList<Change> selectChangeList() {
		return (ArrayList)sqlSession.selectList("AdminOrders.selectChangeList");
	}

	/**
	 * 작성자 : 신은지
	 * 4. 환불 list
	 * @return
	 */
	public ArrayList<Reject> selectRejectList() {
		return (ArrayList)sqlSession.selectList("AdminOrders.selectRejectList");
	}
	
}
