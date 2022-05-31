pipeline {
  agent any
  stages {
    stage('SonarQube analysis') {
      def scannerHome = tool 'SonarQubeScanner 4.7' // Defined globally
      steps {

        echo 'Building'
        withSonarQubeEnv('SonarQube') {
          //SonarQube installation a.k.a your server name, by default from the configurations
          sh "${scannerHome}/bin/sonar-scanner"
        }
      }
    }

  }
}