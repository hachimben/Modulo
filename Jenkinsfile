pipeline {
    agent any
  stages {
    stage('debut du traitement') {
      steps {
        echo 'debut du traitement'
      }
    }
    stage('git clone') {
      steps {
	git 'https://github.com/hachimben/Modulo.git'
	}
    }
    stage ('Compile Stage') {
		steps {
                bat 'mvn clean compile'
              }
        }
    stage ('Testing Stage') {

            steps {
                    bat 'mvn test'
                
            }
        }
        stage ('Deployment Stage') {
            steps {
                    bat 'mvn clean install'
                
            }
        }
        stage('fin du traitement') {
      steps {
        echo 'fin du traitement'
      }
    
  }
}}
