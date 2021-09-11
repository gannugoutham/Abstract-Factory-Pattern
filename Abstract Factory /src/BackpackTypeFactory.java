
public class BackpackTypeFactory extends BackpackFactory {

	@Override
	Backpack getBackpackType(String type) {
		
		if(type.equalsIgnoreCase("WHeel"))
		{ 
			return new WheeledBackpack();
		} else if(type.equalsIgnoreCase("Frameless")) {
			return new FramelessBackpack();
		}else if(type.equalsIgnoreCase("Mini")) {
			return new MiniBackpack();
		}
		 
		return null;
	}

	@Override
	BackpackSize getBackpackSize(String size) {
		 
		return null;
	}

}
