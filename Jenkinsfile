pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building...'
      }
    }

    stage('Test') {
      steps {
        echo 'Testing...'
        sh 'mvn clean test'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying!...'
      }
    }

  }
}