node('slave1'){
  try{
    stage('checkout'){ 
    //get code from repository
    checkout scm
    }
    stage('build'){
     //bulid the code
     def gradleHome = tool 'gradle4' 
     sh "${gradleHome}/bin/gradle build"
    }
  } catch (ex){
    echo "Erroe occurd"
  }
  stage('post'){
    if( currentBuild.result == 'SUCCESS'){
      addBadge(icon: green.gif, text: "its working")
    }  
  }
}
