# Service Discovery

## Build and Push of Docker Images
- We are using `jib-maven-plugin` for build and push of Docker images.
- Build and push the docker images using
- `mvn compile jib:build`

## Deployment of Kubernetes Cluster
- I have used Kubernetes cluster based k3s, although we can use any Kubernetes cluster solution.
- For details of setting up of k3s cluster, please refer [here](https://mynotesontech.wordpress.com/2021/06/19/kubernetes-101/).
- Create all the objects defined under `infrastructure` module.
- `kubectl apply -f infrastructure/ --recursive`
- Once done with experiments, we can delete the cluster using
- `kubectl delete -f infrastructure/ --recursive`