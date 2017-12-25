package test.spring.di;

public class Phone {
	private String beanName;
	private int home;
	private int cell;
	private int work;

	Phone(int home, int cell, int work) {
		this.home = home;
		this.cell = cell;
		this.work = work;
	}

	public int getHome() {
		return home;
	}

	public int getCell() {
		return cell;
	}

	public int getWork() {
		return work;
	}

	public void setHome(int home) {
		this.home = home;
	}

	public void setCell(int cell) {
		this.cell = cell;
	}

	public void setWork(int work) {
		this.work = work;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
