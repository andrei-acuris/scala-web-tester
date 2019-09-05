if [ $# -eq 1 ]
  then
    if [ $1 == 'build' ] 
    then
      docker-compose up --build -d
    fi
fi

docker exec -it $(docker ps -aq --filter="name=scala-web-tester_tester") /bin/bash -c "sbt gatling:test"