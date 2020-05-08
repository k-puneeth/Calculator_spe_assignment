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
    stage('Deploy using Rundeck') {
      agent any
      steps {
        script {
          step([$class: "RundeckNotifier",
          rundeckInstance: "Rundeck",
          options: """
            BUILD_VERSION=$BUILD_NUMBER
          """,
          jobId: "d0b18ecc-9734-4277-a42e-867aee27a2b4"])
        }
      }
    }
   }
 }
