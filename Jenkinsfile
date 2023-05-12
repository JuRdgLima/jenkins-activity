groovy
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Starting Build'
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
            echo 'Starting Test'
                sh 'mvn test'
            }
        }

        stage('Archive') {
            steps {
                echo 'Starting Archive'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }
}