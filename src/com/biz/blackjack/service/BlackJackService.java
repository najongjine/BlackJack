package com.biz.blackjack.service;

import java.util.List;

import com.biz.blackjack.domain.CardVO;
import com.biz.blackjack.domain.PlayerVO;

public interface BlackJackService {
	public void calculate(PlayerVO vo);
	public void CheckBlackJack();//합 11
	public void checkBust();//21 넘어서 패배
	public void checkPush();//비김
	public void stay();
	public void hit(PlayerVO playerVO, int cardSet);
	public void surrender();
	public void insurance();
	public void evenMoney();
	public void doubleDown();
	public void split();
	
	public List<CardVO> getCards();
	public void setCards(List<CardVO> cards);
	String toString(int index);
	public void forceSet(PlayerVO playerVO);

}
