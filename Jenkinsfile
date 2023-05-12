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
                sh 'mvn -s settings.xml -B -DskipTests clean install -Dmaven.compiler.source=17 -Dmaven.compiler.target=17 -Djdk.home=/home/julianalima/.sdkman/candidates/java/17.0.3-zulu'
            }
        }

        stage('Test') {
            steps {
            echo 'Starting Test'
                sh 'mvn test -Djdk.home=/home/julianalima/.sdkman/candidates/java/17.0.3-zulu'
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
