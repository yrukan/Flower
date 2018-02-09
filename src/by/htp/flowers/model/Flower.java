package by.htp.flowers.model;

public class Flower {

	public String title;
	public String color;
	public Petal[] petal;
	public Bud[] bud;
	
	public Flower(){
		
	}
	
	public Flower(String title, String color){
		this.color = color;
		this.title = title;
	}
	
	
	public void bloom(int budCount){
		if(budCount > 0){
			bud = new Bud[budCount];
			
			for(int i=0; i<budCount; i++){
			bud[i] = new Bud(4, "white");
			}		
			System.out.println();
		}
	}
	/*public void bloom(int petalCount){
		if(petalCount > 0){
			petal = new Petal[petalCount];
			
			for(int i=0; i<petalCount; i++){
			petal[i] = new Petal(4, "Oval", "white");
			}		
			System.out.println();
		}
	}*/
		
    public void littleFade(){
   	    this.color = "brown";
		for(int i=0; i<this.bud.length; i+=3){
			this.bud[i] = null;
		}
	}
	
	/*public void totalFade(){
		this.color = "black";
		for(int i=0; i<this.petal.length; i++){
			if(this.petal != null){
			this.petal[i] = null;
			}
		}
	}*/

}
