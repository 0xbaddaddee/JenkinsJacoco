pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withSonarQubeEnv('SonarQube') {
          sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
        }
      }
    }

  }
}