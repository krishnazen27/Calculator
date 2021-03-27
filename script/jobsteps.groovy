//Declarative pipeline syntax
pipeline {
    agent any
    stages{
        stage('checkout branch') {
            steps {
                script {
                    sh 'printenv'
                    sh "ssd -lahsd"
                    println "this is forom my branch Vinay"
                }
                println "checkout branch"
            }
        }
        stage('build repo') {
            steps {
                script {
                    buildName "#${env.BUILD_NUMBER} : Branch ${env.BRANCH_NAME} => ${DEPLOYMENT_ENV}"
                }
                println "build code"
            }
        }
        stage('QA test') {
            steps {
                println "build code"
            }
        }
        stage('trigger adobe job'){
            steps {
                build quietPeriod: 1, job: 'Adobe2_Releases', parameters: [string(name: 'BRANCH_NAME', value: 'master'), string(name: 'DEPLOYMENT_ENV', value: 'dev'), booleanParam(name: 'TEST_ONLY_VALIDATION', value: true)]
            }
        }
        stage('Deploy') {
            steps {
                println "build code"
            }
        }
    }
}