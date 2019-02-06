class ImmutableString {


	public static void main(String[] args){

		String s = "Ayush";  //<--duplicates not allowed-------Stored in non constant pool---------------> 
		String s1 = new String("Ayush");//<-----duplicates are allowed-----------Stored in constant pool because new keyword is applied----------->

		System.out.println(s);
		System.out.println(s1);
	}
}