package com.pd.pojo;

public class PdResult {
	// 200�ɹ� 500ʧ��
	private int status;
	// ��״̬������
	private String msg;
	// ���ظ������������
	private Object data;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
