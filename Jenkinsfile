pipeline {
    agent any
  stages {
    stage('Beginn von Testen') {
      steps {
        echo 'Beginn von Testen'
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
        stage('Ende von Testen') {
      steps {
        echo 'Ende von Testen'
      }
    
  }
}}
