node(''){
    properties([parameters([string(defaultValue: '100', name: 'MAX_NUM')])])

    stage('git clone'){
        git branch: 'moshe/7boom', url: 'https://github.com/mosheeven/gradle-hello-world.git'
    }


}