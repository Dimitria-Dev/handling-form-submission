pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Dimitria-Dev/handling-form-submission.git'
                sh './mvnw clean compile'
            }
        }
        stage('Test'){
            steps {
                sh './mvnw test'
            }
            post {
                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
        stage('Build Docker Image'){
            steps {
                script {
                    sh 'docker build -t dimitriadeveaux/form-automation .'
                }
            }
        }
    }
}