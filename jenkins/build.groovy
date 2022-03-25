node(''){
    properties([parameters([string(defaultValue: '100', name: 'MAX_NUM')])])

    stage('git clone'){
        git branch: 'moshe/7boom', url: 'https://github.com/mosheeven/gradle-hello-world.git'
    }

    stage('test code'){
        sh ''' docker build -t boom:${env.BUILD_ID} .
        '''
    }


}