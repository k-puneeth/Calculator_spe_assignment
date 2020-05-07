#!groovy
pipeline {
    agent any
   stages {
    stage('Running Maven and Generating .jar file') {
  steps {
       sh 'mvn clean package -DskipTests'
       sh 'java -cp target/my-app-1.0-SNAPSHOT.jar Calculator'
       }
     }
     stage('BUILD Docker Images'){
     steps{
      sh 'docker build -t puneethk26/di:calimg'
     }
     }
   }
 }
