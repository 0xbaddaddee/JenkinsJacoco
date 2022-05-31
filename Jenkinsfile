pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building'
        withSonarQubeEnv 'sonarqube-scanner'
      }
    }

  }
}