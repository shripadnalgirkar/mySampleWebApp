FROM tomcat:8-jre8
Copy ./target/myWebApp-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
