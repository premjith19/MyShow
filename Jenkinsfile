pipeline {
   agent slave1

   stages {
      stage('Build') {
         steps {
            echo 'Build Stage'
echo "${BUILD_NUMBER}"
echo "${BUILD_ID}"
echo "${BUILD_DISPLAY_NAME}"
echo "${JOB_NAME}"
echo "${JOB_BASE_NAME}"
echo "${BUILD_TAG}"
echo "${EXECUTOR_NUMBER}"
echo "${NODE_NAME}"
echo "${NODE_LABELS}"
echo "${WORKSPACE}"
echo "${JENKINS_HOME}"
echo "${JENKINS_URL}"
echo "${BUILD_URL}"
echo "${JOB_URL}"
echo "${GIT_COMMIT}"
echo "${GIT_PREVIOUS_COMMIT}"
echo "${GIT_PREVIOUS_SUCCESSFUL_COMMIT}"
echo "${GIT_BRANCH}"
echo "${GIT_URL}"



            
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
         emailext body: '''<html>
<head>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>

<h2>HTML Table</h2>

<table>
  <tr>
    <th>Env</th>
    <th>UAT1</th>
    <th>UAT2</th>
    <th>UAT3</th>
    <th>DEV1</th>
    <th>DEV2</th>
    <th>DEV4</th>
  
  
  
  
  </tr>

<tr>
     <td>Process1</td>
    <td>     [0]</td>
    <td>     [1].Process1</td>
    <td>     [2].Process1</td>
    <td>     [3].Process1</td>
    <td>     [4].Process1</td>
    <td>     [5].Process1</td>

</tr>

<tr>
     <td>Process2</td>
    <td>     [0].Process2</td>
    <td>     [1].Process2</td>
    <td>     [2].Process2</td>
    <td>     [3].Process2</td>
    <td>     [4].Process2</td>
    <td>     [5].Process2</td>

</tr>
<tr>
     <td>Process3</td>
    <td>     [0].Process3</td>
    <td>     [1].Process3</td>
    <td>     [2].Process3</td>
    <td>     [3].Process3</td>
    <td>     [4].Process3</td>
    <td>     [5].Process3</td>

</tr>
<tr>
     <td>Process4</td>
    <td>     [0].Process4</td>
    <td>     [1].Process4</td>
    <td>     [2].Process4</td>
    <td>     [3].Process4</td>
    <td>     [4].Process4</td>
    <td>     [5].Process4</td>

</tr>
<tr>
     <td>Process5</td>
    <td>     [0].Process5</td>
    <td>     [1].Process5</td>
    <td>     [2].Process5</td>
    <td>     [3].Process5</td>
    <td>     [4].Process5</td>
    <td>     [5].Process5</td>

</tr>



</table>

</body>
</html>



''', subject: 'Power Deployment Mail', to: 'premjith.rk@gmail.com'
         
         
      }
      failure{
         echo 'Failure Build'
      }
   }
}
