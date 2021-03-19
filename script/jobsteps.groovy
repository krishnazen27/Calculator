//Declarative pipeline syntax
pipeline {
    agent any
    stages{
        stage('checkout branch') {
            steps {
                script {
                    sh "ls -la"
                    println "this is forom my branch Vinay"
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