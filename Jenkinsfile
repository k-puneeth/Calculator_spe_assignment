#!groovy
pipeline {
    agent any
   stages {
    stage('BUILD') {
  	steps {
       		sh 'mvn clean package -DskipTests'
       	      }
     	}
     stage('TEST'){
     steps{
      sh 'mvn test'
     }
     }
     stage('DOCKER IMAGE'){
     steps{
      sh 'docker build -t puneethk26/di:calimg .'
     }
     }
     stage('PUBLISH TO DockerHub')
 		{
 		    steps
 		    {
 	        	withDockerRegistry([ credentialsId: "DockerHub", url: "" ])
 	        	{
 	        		sh 'docker push puneethk26/di:calimg'

 	      		}
 		    }
 		}
    stage('Deploy to Rundeck') {
      agent any
      steps {
        script {
          step([$class: "RundeckNotifier",
          rundeckInstance: "Rundeck",
          shouldFailTheBuild: true,
          shouldWaitForRundeckJob: true,
          options: """
            BUILD_VERSION=$BUILD_NUMBER
          """,
          jobId: "d0b18ecc-9734-4277-a42e-867aee27a2b4"])
        }
      }
    }
   }
 }
