Starter App for DDD demo

#Basic installations
1. Install Latest Vagrant (https://www.vagrantup.com/downloads.html)
2. Install latest VirtualBox(https://www.virtualbox.org/)
3. Run `vagrant up`
4. After the VM is up do `vagrant ssh`
5. Check if command `docker info` is successful.

#To run rabbitmq inside VM

1. `vagrant ssh`
2. `docker run -d --hostname rabbitmqserver --name rabbitmq -p 5672:5672 rabbitmq:latest`


#To run any service inside VM
1. `vagrant ssh`
2. `cd /vagrant`
3. go to respective service folder
    `cd eshop-order`
4. run `./gradlew clean build copyDockerFile`
5. Create docker image by 
    `docker build -t {image_name} ./build/`
    `docker build -t eshop-order-image ./build/`
6. you can start independent service by 
    `docker run --name {service-name} -p {forwarded-port} {image-name}`
    `eg. docker run --name orderservice -p 8082:8082 eshop-order-image`
    
    
#To run all service together in single network

1. `vagrant ssh`
2. `docker network create shopnet`
3. `docker run -d --network shopnet --hostname rabbitmqserver --name rabbitmq -p 5672:5672 rabbitmq:latest`
4. While running individual service, use network name to start
    `docker run --network shopnet --name orderservice -p 8082:8082 eshop-order-image`
5. To test if services are started use `docker ps`


