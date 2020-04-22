package com.kh.brocoli.owner.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.brocoli.member.model.vo.Orders;
import com.kh.brocoli.owner.model.dao.ownerOrderDao;
import com.kh.brocoli.owner.model.dao.ownerProductDao;
import com.kh.brocoli.owner.model.dao.ownerReviewDao;
import com.kh.brocoli.product.model.vo.Review;
import com.kh.brocoli.product.model.vo.Statistics;

@Service("ownerReViewService")
public class ownerReviewServiceimpl implements ownerReviewService{

	//	@Autowired ownerProductDao oDao;
	@Autowired ownerReviewDao oDao;

	@Override
	public ArrayList<Review> noReadReviewSelect(int bNO) {
		return oDao.SelectNoReadReview(bNO);
	}
	
	
	
	
	
	
	
	
}
