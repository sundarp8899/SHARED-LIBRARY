import com.i27.builds.calculator

def call(Map pipelineParams){
    Calculator calculator = new Calculator(this)
    pipeline {
        agent {
            label 'slave1'
        }
        stages {
            stage ('calculate'){
                steps {
                    script {
                        echo "calling add method for reuse"
                        echo "printing the sum of values"
                        println calculator.add(2,3)
                    }
                }
            }
            stage('build') {
                steps {
                    echo "buliding the application"
                }
            }
            stage('test') {
                steps {
                    echo "application testing"
                }
            }
            stage('devdeploy') {
                steps {
                    echo "deploying to dev"
                }
            }
            stage('production') {
                steps {
                    echo "deplyoing prod"
                }
            }
        }
    }
}