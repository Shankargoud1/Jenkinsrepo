@Library('myLibrary') _
pipeline {
    agent any
    stages {
        
        stage('Hello World') {
            steps {
                script    
                {
                    hello.hello()
                }
            }
        }
        
        stage('Checkout code from Git') {
            steps {
                 
                 dir("spring-boot-war-example"){script {checkout_git.checkout_git("spring-boot-war-example","master")}}
                
                
            }
        }
        
        stage('create tag on git repo') {
            steps {                                
                 dir("spring-boot-war-example") {                        
                script {create_tag.create_tag("${tag}")}                
                 }
            }
        }
        
        stage('aws code build') {
            steps {
                 
                                      
                 dir("spring-boot-war-example"){script {awscodebuild.awscodebuild("java-project-2", "${tag}")}}
                 
                
            }
        } 


       
    } 
    
  
    
}