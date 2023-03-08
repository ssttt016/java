package com.kbstar.dto;

public class ItemDTO {
	private int itemNo;
	private String itemName;
	private int itemQt;
	
	public ItemDTO() {
	}
	
	public ItemDTO(int itemNo, String itemName, int itemQt) {
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.itemQt = itemQt;
	}

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemQt() {
		return itemQt;
	}

	public void setItemQt(int itemQt) {
		this.itemQt = itemQt;
	}

	@Override
	public String toString() {
		return "ItemDTO [itemNo=" + itemNo + ", itemName=" + itemName + ", itemQt=" + itemQt + "]";
	}

	
}
