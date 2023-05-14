
public class SortedIntList extends IntList {
	public SortedIntList(int size) {
		super(size);
	}
	
	public void add(int value) {
		if (numElements == list.length) {
			System.out.println("Can't add, list is full");
		} else if (numElements == 0) {
			list[numElements] = value;
			numElements++;
		} else {
			for (int i = numElements - 1; i >= 0; i--) {
				if (value > list[i]) {
					for (int k = 8; k > i; k--) {
						list[k + 1] = list[k];
					}
					list[i + 1] = value;
					numElements++;
					return;
				}
			}
			
			for (int k = numElements - 1; k >= 0; k--) {
				list[k + 1] = list[k];
			}
			list[0] = value;
			numElements++;
		}
	}
}
