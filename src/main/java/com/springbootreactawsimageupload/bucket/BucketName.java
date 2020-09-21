package com.springbootreactawsimageupload.bucket;



public enum BucketName {
	PROFILE_IMAGE("springboot-react-imageupload");
	
	private final String bucketName;
	BucketName(String bucketName){
		this.bucketName=bucketName;
	}
	
    public String getBucketName() {
		return bucketName;
    	
		
	}
}
