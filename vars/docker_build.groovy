def call (String projecct, String imagetag, String dockerhubuser){
  sh "docker build -t ${dockerhubuser}/${project}:${imagetag} . "
}
