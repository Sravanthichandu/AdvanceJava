package com.generalization;

public class UsinggeneralizationMethod {

	public void showWork(Developer e)
	{
		e.work();
	}
	public static void main(String[] args) {
		
		UsinggeneralizationMethod m = new UsinggeneralizationMethod();
		m.showWork(new Tester());
	}
}
