node(''){
    properties([parameters([string(defaultValue: '100', name: 'MAX_NUM')])])

    stage('git clone'){
        git branch: 'moshe/7boom', url: 'https://github.com/mosheeven/gradle-hello-world.git'
    }

    stage('docker build and run'){
        sh '''docker build -t boom:${BUILD_ID} .
        docker run -e MAX_NUM=${MAX_NUM} boom:${BUILD_ID}'''
    }

    stage('clean'){
       sh'docker image rmi -f $(docker images -q)'

    }


}