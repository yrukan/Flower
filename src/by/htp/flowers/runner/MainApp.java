package by.htp.flowers.runner;
import by.htp.flowers.model.Flower;
import by.htp.flowers.model.Gardener;

public class MainApp {

	public static void main(String[] args) {
		
		Gardener gardener = new Gardener("John");
		Flower fl = new Flower("Rose", "Red");
		
		gardener.informAboutFlowerState(fl);
		
		fl.bloom(5);
		gardener.informAboutFlowerState(fl);
		
		//fl.littleFade();
		//gardener.informAboutFlowerState(fl);
		
		//fl.totalFade();
		//gardener.informAboutFlowerState(fl);

	}

}
