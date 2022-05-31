pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building'
        def scannerHome = tool 'SonarQubeScanner 4.7' // Defined globally
        withSonarQubeEnv('SonarQube') {  //SonarQube installation a.k.a your server name, by default from the configurations
          sh "${scannerHome}/bin/sonar-scanner"
        }

      }
    }

  }
}