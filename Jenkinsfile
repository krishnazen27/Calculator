//Declarative pipeline syntax
pipeline {
    agent any
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
        stage('trigger adobe job'){
            build quietPeriod: 1, job: 'Adobe2_Releases', parameters: [string(name: 'BRANCH_NAME', value: 'master'), string(name: 'DEPLOYMENT_ENV', value: 'dev'), booleanParam(name: 'TEST_ONLY_VALIDATION', value: true)]
        }
        stage('Deploy') {
            steps {
                println "build code"
            }
        }
    }
}