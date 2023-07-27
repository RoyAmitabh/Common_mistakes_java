package open.arc.org;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEmpty {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		boolean isEmptyCheckOnSize = collection.size() == 0; // Avoid this
		boolean isEmptyCheck = collection.isEmpty(); // Best
		
	}

}
