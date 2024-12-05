package enties;

public class Retangulo{

    private Double width;
    private Double height;

    public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double calcArea() {
        return this.getWidth() * this.getHeight();
    }

    public Double calcPerimeter() {
        return 2 * (this.getHeight() + this.getWidth());
    }

    public Double calcDiagonal() {
        return Math.sqrt(this.getWidth() * this.getWidth() + this.getHeight() * this.getHeight());
    }
}