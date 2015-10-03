class Temperature{
	private double farenheit;

	Temperature(double farenheit){
		if (farenheit >= -459.67){
			this.farenheit = farenheit;
		}
	}
	
	public void setFarenheit(double farenheit){
		if (farenheit >= -459.67){
			this.farenheit = farenheit;
		}
	}

	public double getFarenheit(){
		return farenheit;
	}

	public double getCelcius(){
		return ((farenheit - 32) * 5 / 9);
	}

	public double getKelvin(){
		return (getCelcius() + 273.15);
	}
}
