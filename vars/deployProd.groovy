package com.cloudbees

@Library('CloudBees@master') _

def call(){
    printf "testCalled"
    standardChange()
}