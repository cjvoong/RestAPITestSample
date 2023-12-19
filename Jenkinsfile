pipeline {
    agent {
        docker {
            image "246775129594.dkr.ecr.eu-west-1.amazonaws.com/isp-be-integration-test:${params.branch}"
            args '-e HOME=. -v /etc/passwd:/etc/passwd'
            alwaysPull true
            reuseNode true
        }
    }
    environment {
        STASH = credentials('StashCredentials')
    }
    stages {
        stage('Run docker test') {
            steps {
                sh "cd /build/isp-be-integration-test && mvn clean verify -Dmaven.repo.local=/build/isp-be-integration-test/.m2/repository -Dtests.included.groups=${params.TEST_TAG}"
                }
            }
    }
    post {
        always {
            sh "cp -R /build/isp-be-integration-test/target/**/*.xml ${WORKSPACE}/"
            junit allowEmptyResults: false, testResults: '**/*.xml'      
            script {
                currentBuild.result = currentBuild.result ?: 'SUCCESS'
                cleanWs()
            }                  
        }
        
    }
}
