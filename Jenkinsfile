pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        script {
          scannerHome = tool 'SonarQubeScanner 4.7'
        }
        withSonarQubeEnv(installationName: 'SonarQube', credentialsId:'6d7392aa8135e726b9e1d5b6461851183ed37146') {
          sh "mvn clean verify sonar:sonar"
        }
      }
    }

  }
}