pipeline {
   agent any

   stages {
      stage('Build') {
         steps {
            echo 'Build Stage'
            echo ${BRANCH_NAME}
echo ${CHANGE_ID}
echo ${CHANGE_URL}
echo ${CHANGE_TITLE}
echo ${CHANGE_AUTHOR}
echo ${CHANGE_AUTHOR_DISPLAY_NAME}
echo ${CHANGE_AUTHOR_EMAIL}
echo ${CHANGE_TARGET}
echo ${CHANGE_BRANCH}
echo ${CHANGE_FORK}
echo ${TAG_NAME}
echo ${TAG_TIMESTAMP}
echo ${TAG_UNIXTIME}
echo ${TAG_DATE}
echo ${BUILD_NUMBER}
echo ${BUILD_ID}
echo ${BUILD_DISPLAY_NAME}
echo ${JOB_NAME}
echo ${JOB_BASE_NAME}
echo ${BUILD_TAG}
echo ${EXECUTOR_NUMBER}
echo ${NODE_NAME}
echo ${NODE_LABELS}
echo ${WORKSPACE}
echo ${WORKSPACE_TMP}
echo ${JENKINS_HOME}
echo ${JENKINS_URL}
echo ${BUILD_URL}
echo ${JOB_URL}
echo ${GIT_COMMIT}
echo ${GIT_PREVIOUS_COMMIT}
echo ${GIT_PREVIOUS_SUCCESSFUL_COMMIT}
echo ${GIT_BRANCH}
echo ${GIT_LOCAL_BRANCH}
echo ${GIT_CHECKOUT_DIR}
echo ${GIT_URL}
echo ${GIT_COMMITTER_NAME}
echo ${GIT_AUTHOR_NAME}
echo ${GIT_COMMITTER_EMAIL}
echo ${GIT_AUTHOR_EMAIL}



            
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
