#!/bin/bash

# 停止es进程
PID=`jps -mvl | grep "org.elasticsearch.bootstrap.Elasticsearch"  | awk '{print $1}'`

if [ -n "${PID}" ]
then
    for pid in $PID
	{  
		kill $pid
		echo "kill es process $pid success!"
	}
else
	echo "es process is not running, please check in"	
fi


# arr=($PID)
# for loop in arr
# do
#     echo "The value is: $loop"
# done
# kill pids
# echo '$pids 已经'