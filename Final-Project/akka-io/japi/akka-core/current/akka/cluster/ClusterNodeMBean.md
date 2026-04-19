---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:50:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterNodeMBean.html
title: ClusterNodeMBean
---

# ClusterNodeMBean

## Content

Package [akka.cluster](package-summary.html)
## Interface ClusterNodeMBean

- ---

```
public interface ClusterNodeMBean
```

Interface for the cluster JMX MBean.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[down](#down(java.lang.String))​(java.lang.String address)` | Send command to DOWN the node specified by 'address'. |
	| `java.lang.String` | `[getClusterStatus](#getClusterStatus())()` |  |
	| `java.lang.String` | `[getLeader](#getLeader())()` | Get the address of the current leader. |
	| `java.lang.String` | `[getMembers](#getMembers())()` | Comma separated addresses of member nodes, sorted in the cluster ring order. |
	| `java.lang.String` | `[getMemberStatus](#getMemberStatus())()` | Member status for this node. |
	| `java.lang.String` | `[getUnreachable](#getUnreachable())()` | Comma separated addresses of unreachable member nodes. |
	| `boolean` | `[isAvailable](#isAvailable())()` | Returns true if the node is not unreachable and not `Down`  and not `Removed`. |
	| `boolean` | `[isSingleton](#isSingleton())()` | Does the cluster consist of only one member? |
	| `void` | `[join](#join(java.lang.String))​(java.lang.String address)` | Try to join this cluster node with the node specified by 'address'. |
	| `void` | `[leave](#leave(java.lang.String))​(java.lang.String address)` | Send command to issue state transition to LEAVING for the node specified by 'address'. |

- - ### Method Detail
	
	
	
		- #### down
		
		
		
		```
		void down​(java.lang.String address)
		```
		
		Send command to DOWN the node specified by 'address'.
		 The address format is `akka://actor-system-name@hostname:port`
		- #### getClusterStatus
		
		
		
		```
		java.lang.String getClusterStatus()
		```
		- #### getLeader
		
		
		
		```
		java.lang.String getLeader()
		```
		
		Get the address of the current leader.
		 The address format is `akka://actor-system-name@hostname:port`
		- #### getMemberStatus
		
		
		
		```
		java.lang.String getMemberStatus()
		```
		
		Member status for this node.
		- #### getMembers
		
		
		
		```
		java.lang.String getMembers()
		```
		
		Comma separated addresses of member nodes, sorted in the cluster ring order.
		 The address format is `akka://actor-system-name@hostname:port`
		- #### getUnreachable
		
		
		
		```
		java.lang.String getUnreachable()
		```
		
		Comma separated addresses of unreachable member nodes.
		 The address format is `akka://actor-system-name@hostname:port`
		- #### isAvailable
		
		
		
		```
		boolean isAvailable()
		```
		
		Returns true if the node is not unreachable and not `Down`
		 and not `Removed`.
		- #### isSingleton
		
		
		
		```
		boolean isSingleton()
		```
		
		Does the cluster consist of only one member?
		- #### join
		
		
		
		```
		void join​(java.lang.String address)
		```
		
		Try to join this cluster node with the node specified by 'address'.
		 The address format is `akka://actor-system-name@hostname:port`.
		 A 'Join(thisNodeAddress)' command is sent to the node to join.
		- #### leave
		
		
		
		```
		void leave​(java.lang.String address)
		```
		
		Send command to issue state transition to LEAVING for the node specified by 'address'.
		 The address format is `akka://actor-system-name@hostname:port`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterNodeMBean.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterNodeMBean.html)*