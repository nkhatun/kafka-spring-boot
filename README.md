# kafka-spring-boot
spring boot application using apache Kafka


# APACHE KAFKA QUICKSTART

## STEP 1: GET KAFKA
Get the binary download
unompress the tar : tar -xzf <.tar file name>
## STEP 2: START THE KAFKA ENVIRONMENT
### Start the ZooKeeper service
$ bin/zookeeper-server-start.sh config/zookeeper.properties
In another terminal
### Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties
## STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS
$ bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092
## STEP 4: WRITE SOME EVENTS INTO THE TOPIC
$ bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
## STEP 5: READ THE EVENTS
$ bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

You can stop the producer client with Ctrl-C at any time.
If you also want to delete any data of your local Kafka environment including any events you have created along the way, run the command:
$ rm -rf /tmp/kafka-logs /tmp/zookeeper
