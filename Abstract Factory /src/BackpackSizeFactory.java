
public class BackpackSizeFactory extends BackpackFactory {

	@Override
	Backpack getBackpackType(String type) {
		 
		return null;
	}

	@Override
	BackpackSize getBackpackSize(String size) {
		
		if(size.equalsIgnoreCase("Small"))
		{ 
			return new SmallSizeBackPack();
		} else if(size.equalsIgnoreCase("Medium")) {
			return new MediumBackPacks();
		}else if(size.equalsIgnoreCase("Big")) {
			return new BigBackpacks();
		}
		 
		return null;
	}

}
