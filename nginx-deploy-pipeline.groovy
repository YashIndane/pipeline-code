node {
    stage('Prepare Env'){
        git branch:'main',url:'https://github.com/YashIndane/nginxapp.git'
    }
    
    stage('Deploy'){
        sh 'ssh ubuntu@13.232.202.162'
        sh 'scp -r index.html ubuntu@13.232.202.162:/etc/nginx/website/'
    }
}
