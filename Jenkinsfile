pipeline {
    agent any

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
        stage('Push Image to Docker Hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpw')]) {
                    sh 'docker login -u dimitriad -p ${dockerhubpw}'
                    }
                    sh 'docker push dimitriad/docker-repo:form-automation'
                }
            }
        }
    }
}