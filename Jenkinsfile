pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building'
        withSonarQubeEnv(installationName: 'sonarqube-scanner', credentialsId: 'cf')
      }
    }

  }
}