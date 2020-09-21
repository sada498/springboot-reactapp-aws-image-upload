
# springboot-react-aws-image-upload
 Springboot  and  React frontend Application Integrated with AWS Cloud.
### To work this application list of thing you need to change or create to work with is application.
1.	Aws cloud account [free tire](https://aws.amazon.com/free/?all-free-tier.sort-by=item.additionalFields.SortRank&all-free-tier.sort-order=asc)
2.	Create a user in IAM or you can use root access for the security credentials. I would recommend to use IAM dev role for security credentials.
3.	Generate the security credentials 
 ![ecurity credentials](https://github.com/sada498/springboot-reactapp-aws-image-upload/blob/master/src/main/resources/aws.png)
4.	Add the Access key and AWS Secret access key in
```
 src/main/java/com/springbootreactawsimageupload/config/AmazonConfig.java
 ```
5.	Download the react app required modules
6.	Start the Springboot application.
7.	Go to the frontend floder in Terminal to start the react application
    ```
     npm start 
     ```
