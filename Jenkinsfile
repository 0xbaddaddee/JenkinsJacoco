pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        script {
          scannerHome = tool 'SonarQubeScanner 4.7'
        }
        withSonarQubeEnv('SonarQube') {
          sh "${scannerHome}/bin/sonar-scanner"
        }
      }
    }

  }
}