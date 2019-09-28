public class ComplexNo {
	private int realPart, imagePart;
	ComplexNo (int r, int i) {
		realPart = r;
		imagePart = i;
	}

	public String toString() {
		return realPart + "+" + imagePart + "i";
	}

	public boolean equals (Object c1) {
		if (c1 instanceof ComplexNo) { 
			ComplexNo temp = (ComplexNo) c1;
			return (realPart==temp.realPart && 
				    imagePart==temp.imagePart);
		}

		return false;
	}
}
