#!groovy
pipeline {
    agent any
   stages {
    stage('Maven Install and Build Jar') {
  steps {
       sh 'mvn clean package'
       sh 'java -cp /target/ui-0.0.1-SNAPSHOT.jar calculator'
       }
     }
   }
 }
