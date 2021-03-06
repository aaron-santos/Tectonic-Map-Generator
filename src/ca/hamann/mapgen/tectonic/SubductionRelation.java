package ca.hamann.mapgen.tectonic;

public class SubductionRelation implements Comparable<SubductionRelation> {

	private int top, bottom;

	public SubductionRelation(int top, int bottom) {
		this.top = top;
		this.bottom = bottom;
	}

	public boolean equals(Object obj) {
		if (obj != null && obj.getClass() == getClass()) {
			return compareTo((SubductionRelation) obj) == 0;
		}
		return false;
	}

	public int compareTo(SubductionRelation rel) {

		if (rel.top == top && rel.bottom == bottom) {
			return 0;
		} else if (rel.top < top) {
			return 1;
		} else if (rel.top > top) {
			return -1;
		} else if (rel.bottom < bottom) {
			return 1;
		}

		return -1;
	}

	public int hashCode() {
		return top ^ bottom;
	}

}
