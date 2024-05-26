package br.com.modesto.templatemethod;

public abstract class BeveragePrepare {

	public final void prepare() {
	
		this.boil();
		
		this.brew();
		
		if(this.putCondiments()) {
			this.addCondiments();
		}
		
		this.hook();
	}
	
	public void hook() {
		
	}

	public boolean putCondiments() {
		return false;
	}

	public void boil() {
		System.out.println("boil the water");
	}
	public abstract void brew();
	
	public abstract void addCondiments();
	
	
}
