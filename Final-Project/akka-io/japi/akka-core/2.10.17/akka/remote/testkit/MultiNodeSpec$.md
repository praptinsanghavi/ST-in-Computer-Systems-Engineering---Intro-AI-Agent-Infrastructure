---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec$.html
title: MultiNodeSpec$
---

# MultiNodeSpec$

## Content

Package [akka.remote.testkit](package-summary.html)
## Class MultiNodeSpec$

- java.lang.Object
- - akka.remote.testkit.MultiNodeSpec$

- ---

```
public class MultiNodeSpec$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MultiNodeSpec$](MultiNodeSpec$.html "class in akka.remote.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MultiNodeSpec$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[configureNextPortIfFixed](#configureNextPortIfFixed(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `int` | `[maxNodes](#maxNodes())()` | Number of nodes node taking part in this test. |
	| `java.lang.Integer` | `[selfIndex](#selfIndex())()` | Index of this node in the roles sequence. |
	| `java.lang.String` | `[selfName](#selfName())()` | Name (or IP address; must be resolvable using InetAddress.getByName)  of the host this node is running on. |
	| `int` | `[selfPort](#selfPort())()` | Port number of this node. |
	| `java.lang.String` | `[serverName](#serverName())()` | Name (or IP address; must be resolvable using InetAddress.getByName)  of the host that the server node is running on. |
	| `int` | `[serverPort](#serverPort())()` | Port number of the node that's running the server system. |
	| `int` | `[tcpPort](#tcpPort())()` | TCP Port number to be used when running tests on TCP. |
	| `scala.Option<java.lang.Object>` | `[udpPort](#udpPort())()` | UDP Port number to be used when running tests on UDP. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MultiNodeSpec$](MultiNodeSpec$.html "class in akka.remote.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MultiNodeSpec$
		
		
		
		```
		public MultiNodeSpec$()
		```

	- ### Method Detail
	
	
	
		- #### maxNodes
		
		
		
		```
		public int maxNodes()
		```
		
		Number of nodes node taking part in this test.
		 
		
		
		
		```
		
		 -Dmultinode.max-nodes=4
		 
		```
		- #### selfName
		
		
		
		```
		public java.lang.String selfName()
		```
		
		Name (or IP address; must be resolvable using InetAddress.getByName)
		 of the host this node is running on.
		 
		
		
		
		```
		
		 -Dmultinode.host=host.example.com
		 
		```
		
		
		 InetAddress.getLocalHost.getHostAddress is used if empty or "localhost"
		 is defined as system property "multinode.host".
		- #### tcpPort
		
		
		
		```
		public int tcpPort()
		```
		
		TCP Port number to be used when running tests on TCP. 0 means a random port.
		 
		
		
		
		```
		
		 -Dmultinode.port=0
		 
		```
		- #### udpPort
		
		
		
		```
		public scala.Option<java.lang.Object> udpPort()
		```
		
		UDP Port number to be used when running tests on UDP. 0 means a random port.
		 
		
		
		
		```
		
		 -Dmultinode.udp.port=0
		 
		```
		- #### selfPort
		
		
		
		```
		public int selfPort()
		```
		
		Port number of this node.
		 
		 This is defined in function of property `multinode.protocol`.
		 If set to 'udp', udpPort will be used. If unset or any other value, it will default to tcpPort.
		- #### serverName
		
		
		
		```
		public java.lang.String serverName()
		```
		
		Name (or IP address; must be resolvable using InetAddress.getByName)
		 of the host that the server node is running on.
		 
		
		
		
		```
		
		 -Dmultinode.server-host=server.example.com
		 
		```
		- #### serverPort
		
		
		
		```
		public int serverPort()
		```
		
		Port number of the node that's running the server system. Defaults to 4711\.
		 
		
		
		
		```
		
		 -Dmultinode.server-port=4711
		 
		```
		- #### selfIndex
		
		
		
		```
		public java.lang.Integer selfIndex()
		```
		
		Index of this node in the roles sequence. The TestConductor
		 is started in \&ldquo;controller\&rdquo; mode on selfIndex 0, i.e. there you can inject
		 failures and shutdown other nodes etc.
		 
		
		
		
		```
		
		 -Dmultinode.index=0
		 
		```
		- #### configureNextPortIfFixed
		
		
		
		```
		public com.typesafe.config.Config configureNextPortIfFixed​(com.typesafe.config.Config config)
		```

## Code Examples

### Example 1: maxNodes

```text
-Dmultinode.max-nodes=4
```

### Example 2: selfName

```text
-Dmultinode.host=host.example.com
```

### Example 3: tcpPort

```text
-Dmultinode.port=0
```

### Example 4: udpPort

```text
-Dmultinode.udp.port=0
```

### Example 5: serverName

```text
-Dmultinode.server-host=server.example.com
```

### Example 6: serverPort

```text
-Dmultinode.server-port=4711
```

### Example 7: selfIndex

```text
-Dmultinode.index=0
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec$.html)*