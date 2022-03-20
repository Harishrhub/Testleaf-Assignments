package week1.day1;

public class Globalvariables {
	String mobName= "galaxy s9*";
	float wgh= 250.6F;
	boolean isFullyCharged= true;
	int cost=29000;

public static void main(String[] args) {
		Globalvariables mob=new Globalvariables();
		System.out.println(mob.mobName);
		System.out.println(mob.wgh);
		System.out.println(mob.isFullyCharged);
		System.out.println(mob.cost);
		mob.mobileName();
        mob.weigh();
        mob.chargingStatus();
        mob.price();
		
		

}
public void mobileName() {
	String mobName= "Pixel 4A";
	System.out.println(mobName);
}
public void weigh(){
	wgh=250.5f;
	System.out.println(wgh);
}
public void chargingStatus() {
	System.out.println(isFullyCharged);
}
public void price() {
	System.out.println(mobName);
	System.out.println(cost);
	System.out.println(wgh);
}
}

