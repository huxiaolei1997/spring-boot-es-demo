#!/bin/bash
espath=`pwd`

PID=`jps -mvl | grep "org.elasticsearch.bootstrap.Elasticsearch"  | awk '{print $1}'`

if [ -n "${PID}" ]
then
    for pid in $PID
	{  
		echo "es process is running, port is $pid"
	}
else
	$espath/es-node1/bin/elasticsearch -d
	$espath/es-node2/bin/elasticsearch -d
	$espath/es-node3/bin/elasticsearch -d

	echo "espath is $espath, start success!"
fi