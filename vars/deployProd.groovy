package com.cloudbees

@Library('CloudBees') _

def call(){
    printf "testCalled"
    standardChange()
}