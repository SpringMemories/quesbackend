pipeline {
    agent any
    environment {
		JOB_NAME="awecloud"
		BUILD_ID=1
	}
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        
        stage('DockerImage') {
		    steps {
		        sh 'mvn docker:build -Ddocker.image.name=${JOB_NAME} -Ddocker.image.tag=1.0.${BUILD_ID}'
		    }
		}

        stage('Startup') {
            steps {
                withEnv(['JENKINS_NODE_COOKIE=dontkillme']){
			        sh 'docker images'
		            sh 'docker run -d -p 8314:8314 --name Awe awecloud'
		        }
            }
        }
    }
}
