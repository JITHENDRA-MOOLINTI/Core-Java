package com.publisher;



public class Publisher {
	 private String publisherName ;
	 private String publisherLocation ;
	 private String licenseCode ;
	 
	//private constructor
		private  Publisher(String publisherName,String publisherLocation,String licenseCode) {
			this.publisherName=publisherName;
		    this.publisherLocation=publisherLocation;
		    this.licenseCode= licenseCode;
		
		}
		
		//setters
		
		public void setPublisherName(String publisherName) {
			this.publisherName=publisherName;
		}
		public void setManfacturerAddress(String publisherLocation) {
			this.publisherLocation=publisherLocation;
		}
		public void setLicenseCode(String licenseCode) {
			this.licenseCode= licenseCode;
		}
		
		
		//getters
		public String getPublisherName() {
			return this.publisherName;
		}
		public String setPublisherLocation() {
			return this.publisherLocation;
		}
		public String setLicenseCode() {
			return this.licenseCode;
		}
		
		@Override
		public String toString() {
			return "Publisher Name:"+this.publisherName+"\nPublisher Location:"+this.publisherLocation+"\nLicense Code:"+this.licenseCode;
		}
		
		//Indirectly creating object of 
		public static Publisher getManufacturerObject(String publisherName,String publisherLocation,String licenseCode) {
			if(licenseCode.startsWith("PUB")&&licenseCode.length()==8) {
				return new Publisher( publisherName,publisherLocation,licenseCode);
			}
			 return null;
			
		}
}
