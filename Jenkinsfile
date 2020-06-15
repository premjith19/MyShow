pipeline {
   agent any

   stages {
      stage('Build') {
         steps {
            echo 'Build Stage'
            echo "Build ID is ${BUILD_ID}"
            echo "Build Number is ${BUILD_NUMBER}"
         }
      }
      
      stage('Test') {
         steps {
            echo 'Test Stage'
         }
      }
      stage('Deploy') {
         steps {
            echo 'Deploy Stage'
         }
      }
   }
   
   post{
      always{
         echo 'Compulsory Build'
      }
      success{
         echo 'Successful Build'
      }
      failure{
         echo 'Failure Build'
      }
   }
}
