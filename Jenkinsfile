node('slave1'){
  stage('checkout'){ 
    //get code from repository
    checkout scm
  }
  stage('build'){
   //bulid the code
   def gradleHome = tool 'gradle4' 
    ${gradleHome}/bin/gradle build
  }
  post('badge'){
  addBadge(icon: green.gif, text: "its working")
  
  }
}
