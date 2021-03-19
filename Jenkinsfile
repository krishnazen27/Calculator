//Declarative pipeline syntax
pipeline {
    agent {
        any
    }
    stages{
        stage('checkout branch') {
            steps {
                script {
                    sh "ls -la"
                }
                println "checkout branch"
            }
        }
        stage('build repo') {
            steps {
                println "build code"
            }
        }
        stage('QA test') {
            steps {
                println "build code"
            }
        }
        stage('Deploy') {
            steps {
                println "build code"
            }
        }
    }
}