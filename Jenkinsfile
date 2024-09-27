pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Dimitria-Dev/handling-form-submission.git'
                sh './mvnw clean compile'
            }
        }
    }
}