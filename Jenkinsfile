pipeline{
  agent any
  stages('Deploy'){
    steps{
      echo "Test successful"
      bat"mav compile"
    }
  }
  stage('Build'){
    steps{
      echo "build successful"
      bat"mav clean"
    }
  }
  stage('Test'){
    steps{
      echo "Test successful"
      bat"mav test"
    }
  }
}
}
