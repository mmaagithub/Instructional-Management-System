package com.role;

public class Page {
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int count;//�õ����ݵ�������
	private int  slide=4; //ÿҳ��ʾ��4��
	private int offsetone;//ÿҳ�ĵ�һ��
	private int pageCount;// ��ҳ��
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSlide() {
		return slide;
	}
	public Page(int count, int slide, int offsetone, int pageCount) {
		super();
		this.count = count;
		this.slide = slide;
		this.offsetone = offsetone;
		this.pageCount = pageCount;
	}
	public void setSlide(int slide) {
		this.slide = slide;
	}
	public int getOffsetone() {
		return offsetone;
	}
	public void setOffsetone(int offsetone) {
		this.offsetone = offsetone;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}
