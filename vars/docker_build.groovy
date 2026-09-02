def call (String project, String imagetag, String dockerhubuser){
  sh "docker build -t ${dockerhubuser}/${project}:${imagetag} . "
}
