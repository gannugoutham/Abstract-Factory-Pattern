
public class DemoBackpacks {

	public static void main(String[] args) {
		
		System.out.println("BackPacks size and types \n\n------------------------------------------------------------\n");
		
		BackpackFactory backPackSize = new BackpackSizeFactory();
		
		backPackSize.getBackpackSize("Small");//Medium,Big
		 
		BackpackFactory backPackType = new BackpackTypeFactory();
		
		backPackType.getBackpackType("WHeel");//Frameless,mini

	}

}
