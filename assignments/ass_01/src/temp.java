class test{

	static public void main(String args[]){
		Temperature tm = new Temperature(-500);
		System.out.println(tm.getFarenheit());
		tm.setFarenheit(212);
		System.out.println(tm.getCelcius());
		System.out.println(tm.getKelvin());
	}
}
