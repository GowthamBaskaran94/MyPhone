package org.phone;

public class PhoneInfo {
	private void phoneName() {
		//giving phone name
		System.out.println("Phone Name: Nokia 1100");
	}
    private void phoneMieiNumber() {
    	//giving phonemieinumber;
    	System.out.println("MieiNumber: 7876537Hd9K");
    }
    private void camera() {
    	//giving Camera pixel
    	System.out.println("Camera Pixel: 128MP");
    }
    private void storage() {
    	//giving memory storage details 
    	System.out.println("Internal storage: 1TB");
    }
    private void osName() {
    	// giving phone os version details
    	System.out.println("Phone Os version: Android9.1");
	System.out.println("Git message1");
	
    }
    public static void main(String[] args) {
		PhoneInfo p= new PhoneInfo();
		p.osName();
		p.phoneMieiNumber();
		p.phoneName();
		p.storage();
		p.camera();
	}
}


