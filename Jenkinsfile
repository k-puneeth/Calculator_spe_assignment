#!groovy
pipeline {
    agent none
   stages {
    stage('Maven Install') {
  steps {
       sh 'mvn clean package'
       sh 'java -cp /target/ui-0.0.1-SNAPSHOT.jar calculator'
       }
     }
   }
 }
