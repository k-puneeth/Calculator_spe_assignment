#!groovy
pipeline {
    agent any
   stages {
    stage('Maven Install and Build Jar') {
  steps {
       sh 'mvn clean package -DskipTests'
       sh 'java -jar ./target/ui-0.0.1-SNAPSHOT.jar'
       }
     }
   }
 }
