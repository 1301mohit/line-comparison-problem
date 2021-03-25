package com.linecomparisonproblem;

public class Length {

	private double x1;
	private double y1;
	private double x2;
	private double y2;

	public Length(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public double calculateLength() {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Length other = (Length) obj;
		if(other.calculateLength() != this.calculateLength())
			return false;
		return true;
	}

}
