pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withSonarQubeEnv(installationName: 'SonarQube', credentialsId:'6d7392aa8135e726b9e1d5b6461851183ed37146') {
          sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
        }
      }
    }

  }
}