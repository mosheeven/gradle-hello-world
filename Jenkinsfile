node('slave1'){
  currentBuild.result = 'SUCCESS'
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
    currentBuild.result = 'FAILURE'
    echo "Erroe occurd"
  }
  stage('post'){
    if( currentBuild.result == 'SUCCESS'){
      addBadge(icon: 'green.gif', text: "its working")
    }
    if(currentBuild.result == 'FAILURE'){
      addBadge(icon: 'red.gif', text: "its working")
    }
  }
}
