#!groovy
pipeline {
    agent any
   stages {
    stage('Running Maven and Generating .jar file') {
  steps {
       sh 'mvn clean package -DskipTests'
       }
     }
     stage('BUILD Docker Images'){
     steps{
      sh 'docker build -t puneethk26/di:calimg .'
     }
     }
     stage('PUBLISH to DockerHub')
 		{
 		    steps
 		    {
 	        	withDockerRegistry([ credentialsId: "DockerHub", url: "" ])
 	        	{
 	        		sh 'docker push puneethk26/di:calimg'

 	      		}
 		    }
 		}
   }
 }
