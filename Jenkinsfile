pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building'
        withSonarQubeEnv('SonarQube') {
          echo 'HU'
        }

      }
    }

  }
}