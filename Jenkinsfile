pipeline {
    agent any
    environment {
        JAVA_HOME = '/home/julianalima/.sdkman/candidates/java/17.0.3-zulu'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Starting Build'
                sh 'mvn -s settings.xml -B -DskipTests clean install -Dmaven.compiler.source=17 -Dmaven.compiler.target=17'
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
