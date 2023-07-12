def call(String mavenGoal){
  
  if ("${mavenGoal}" == "goal")
     {
       sh "mvn clean package"
     }
  // else if ("${mavenGoal}" == "SonarQube Report")
  //    {
  //      sh "mvn clean sonar:sonar"
  //    }
  // else if ("${mavenGoal}" == "Upload Into Nexus")
  //    {
  //      sh "mvn clean deploy"
  //    }
}
