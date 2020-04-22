package com.kh.brocoli.commons;

import com.kh.brocoli.board.model.vo.PageInfo;

public class Pagination {
	
	public static PageInfo getPageInfo(int currentPage, int listCount) {
		
		PageInfo pi = null;
		
		int pageLimit = 10; //한 페이지에서 보여질 페이징 수
		int maxPage; 		//전체 페이징 수 중 가장 마지막 페이지
		int startPage;		//현재 페이지에서 보여질 페이징 버튼의 시작페이지
		int endPage;		//현재 페이이에서 보여질 페이징 버튼의 끝 페이지
		
		int Limit = 7; //한 페이지에 보여질 게시슬 개수 
		//* maxPage : 총 페이지 수 
		maxPage = (int)Math.ceil((double)listCount/Limit);
		
		//* startPage : 현재 페이지에 보여질 시작 페이지 수 
		startPage = (currentPage - 1) / pageLimit * pageLimit + 1;
		
		//* endPage : 현재 페이지에서 보여질 마지막 페이지 수 
		endPage = startPage + pageLimit + 1;
		
		//마지막 페이지 수가 총 페이지 수 보다 클 경우
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		pi = new PageInfo(currentPage,listCount,pageLimit,maxPage,startPage,endPage,Limit);
		
		return pi;
		
		}
	}