node(''){
    stage('git clone'){
        git branch: 'moshe/7boom', url: 'https://github.com/mosheeven/gradle-hello-world.git'
    }
}