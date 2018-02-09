package by.htp.flowers.model;

public class Bud {

   //бутон должен менять свой размер и цвет, если цветок расцвел или завял
	//у цветка есть бутон, а у бутона лепестки
	public int size;
	public String color;
	public Petal[] petal;
	
	public Bud(int size, String color){
		this.size = size;
		this.color = color;
	}
	
	public void bloom(int budCount){
	if(budCount > 0){
		petal = new Petal[budCount];
		
		for(int i=0; i<budCount; i++){
		petal[i] = new Petal(4, "Oval", "white");
		}		
		System.out.println();
	   }
     }
	
	public void littleFade(){
	   	    this.color = "brown";
			for(int i=0; i<this.petal.length; i+=3){
				this.petal[i] = null;
			}
	}
		
	public void totalFade(){
	    	this.color = "black";
			for(int i=0; i<this.petal.length; i++){
				if(this.petal != null){
				this.petal[i] = null;
				}
			}
	}


}
