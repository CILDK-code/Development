package com.qili.javabean;

public class Shopping {
	private String haveBought;
	private String reason;
	private String webset;
	private String goods;
	private String chooseReason;
	private String buyFreq;
	private String lessCost;
	private String salePromotion;
	private String payMeth;
	public Shopping() {
	}
	public Shopping(String haveBought, String reason, String webset, String goods, String chooseReason, String buyFreq,
			String lessCost, String salePromotion, String payMeth) {
		this.haveBought = haveBought;
		this.reason = reason;
		this.webset = webset;
		this.goods = goods;
		this.chooseReason = chooseReason;
		this.buyFreq = buyFreq;
		this.lessCost = lessCost;
		this.salePromotion = salePromotion;
		this.payMeth = payMeth;
	}
	public String getHaveBought() {
		return haveBought;
	}
	public void setHaveBought(String haveBought) {
		this.haveBought = haveBought;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getWebset() {
		return webset;
	}
	public void setWebset(String webset) {
		this.webset = webset;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getChooseReason() {
		return chooseReason;
	}
	public void setChooseReason(String chooseReason) {
		this.chooseReason = chooseReason;
	}
	public String getBuyFreq() {
		return buyFreq;
	}
	public void setBuyFreq(String buyFreq) {
		this.buyFreq = buyFreq;
	}
	public String getLessCost() {
		return lessCost;
	}
	public void setLessCost(String lessCost) {
		this.lessCost = lessCost;
	}
	public String getSalePromotion() {
		return salePromotion;
	}
	public void setSalePromotion(String salePromotion) {
		this.salePromotion = salePromotion;
	}
	public String getPayMeth() {
		return payMeth;
	}
	public void setPayMeth(String payMeth) {
		this.payMeth = payMeth;
	}
	
}
