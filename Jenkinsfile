pipeline {
    agent any
//     small change to confirm automation

    environment {
        DOCKERHUB_CREDENTIALS=credentials('dockerhub-usr-pwd')
    }
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Dimitria-Dev/handling-form-submission.git'
                sh './mvnw clean install'
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
        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t dimitriadeveaux/form-automation .'
                }
            }
        }
        stage('Login'){
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('Push Image to Docker Hub') {
            steps {
                sh 'docker push dimitriad/docker-repo:latest'
            }
        }

    }
}