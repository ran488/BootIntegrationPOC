Quick POC for strapping up Spring Integration XML-based config from a stand-alone Spring Boot application.

To generate Eclipse meta-data (.project, .classpath):

	gradlew eclipse
	
To build:
	
	gradlew build
	
To run Spring Boot app from Gradle:

	gradlew bootRun
	
To run from command line:

	java -jar build/libs/boot-integration-0.jar
	
