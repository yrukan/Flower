package by.htp.flowers.model;

public class Gardener {

	public String name;
	
	public Gardener(String name){
	   this.name = name;	
	}
	
	public void informAboutFlowerState(Flower flower){
		//NPE
		if(flower != null){
		System.out.println("Flower title: " + flower.title);
		System.out.println("Flower color: " + flower.color);
		if(flower.petal != null){
			this.informAboutFlowerPetals(flower.petal);
		}
	}
	}
	public void informAboutFlowerPetals(Petal[] petals){
		
	System.out.println("Flower petal count: " + getPetalsCount(petals));
	System.out.println("================Info about petals================");
			
	//NPE
	for(Petal petal: petals){
		if(petal != null){
	    System.out.println("Petal size: " + petal.size);
	    System.out.println("Petal shape: " + petal.shape);
		System.out.println("Petal color: " + petal.color);
		System.out.println("____________________________");}
	}
    }
	
	public int getPetalsCount(Petal[] petals){
		int count = 0;
		for(Petal petal: petals){
			if(petal != null){
				count++;
			}
		}
	return count;	
	}
}