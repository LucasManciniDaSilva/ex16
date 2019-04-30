package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		//instantiate the class Client and add new values.
		Client c1 = new Client("Ike", "Ike@gmail.com");
		Client c2 = new Client("Roy", "Roy@gmail.com");
		
		//Print the hash code of c1
		System.out.println(c1.hashCode());
		//Print the hash code of c2
		System.out.println(c2.hashCode());
		//equals to verify is the values in c1 are the same of c2
		System.out.println(c1.equals(c2));

	}

}
