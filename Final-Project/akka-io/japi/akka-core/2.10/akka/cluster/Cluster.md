---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:18:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.ClusterLogger$.html
title: Cluster.ClusterLogger$
---

# Cluster.ClusterLogger$

## Content

Package [akka.cluster](package-summary.html)
## Class Cluster.ClusterLogger$

- java.lang.Object
- - akka.cluster.Cluster.ClusterLogger$

- Enclosing class:
[Cluster](Cluster.html "class in akka.cluster")

---

```
public class Cluster.ClusterLogger$
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterLogger$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled())()` |  |
	| `void` | `[logDebug](#logDebug(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[logDebug](#logDebug(java.lang.String,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[logDebug](#logDebug(java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[logDebug](#logDebug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[logError](#logError(akka.event.LogMarker,java.lang.String))​([LogMarker](../event/LogMarker.html "class in akka.event") marker,  java.lang.String message)` |  |
	| `void` | `[logError](#logError(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[logError](#logError(java.lang.String,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[logError](#logError(java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[logError](#logError(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[logError](#logError(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `void` | `[logError](#logError(java.lang.Throwable,java.lang.String,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[logError](#logError(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[logError](#logError(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[logInfo](#logInfo(akka.event.LogMarker,java.lang.String))​([LogMarker](../event/LogMarker.html "class in akka.event") marker,  java.lang.String message)` |  |
	| `void` | `[logInfo](#logInfo(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](../event/LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[logInfo](#logInfo(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](../event/LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[logInfo](#logInfo(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](../event/LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[logInfo](#logInfo(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[logInfo](#logInfo(java.lang.String,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[logInfo](#logInfo(java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[logInfo](#logInfo(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[logWarning](#logWarning(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](../event/LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[logWarning](#logWarning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](../event/LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[logWarning](#logWarning(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[logWarning](#logWarning(java.lang.String,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[logWarning](#logWarning(java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[logWarning](#logWarning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterLogger$
		
		
		
		```
		public ClusterLogger$()
		```

	- ### Method Detail
	
	
	
		- #### isDebugEnabled
		
		
		
		```
		public boolean isDebugEnabled()
		```
		- #### logDebug
		
		
		
		```
		public void logDebug​(java.lang.String message)
		```
		- #### logDebug
		
		
		
		```
		public void logDebug​(java.lang.String template,
		                     java.lang.Object arg1)
		```
		- #### logDebug
		
		
		
		```
		public void logDebug​(java.lang.String template,
		                     java.lang.Object arg1,
		                     java.lang.Object arg2)
		```
		- #### logDebug
		
		
		
		```
		public void logDebug​(java.lang.String template,
		                     java.lang.Object arg1,
		                     java.lang.Object arg2,
		                     java.lang.Object arg3)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​(java.lang.String message)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​([LogMarker](../event/LogMarker.html "class in akka.event") marker,
		                    java.lang.String message)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​(java.lang.String template,
		                    java.lang.Object arg1)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​([LogMarker](../event/LogMarker.html "class in akka.event") marker,
		                    java.lang.String template,
		                    java.lang.Object arg1)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​(java.lang.String template,
		                    java.lang.Object arg1,
		                    java.lang.Object arg2)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​([LogMarker](../event/LogMarker.html "class in akka.event") marker,
		                    java.lang.String template,
		                    java.lang.Object arg1,
		                    java.lang.Object arg2)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​(java.lang.String template,
		                    java.lang.Object arg1,
		                    java.lang.Object arg2,
		                    java.lang.Object arg3)
		```
		- #### logInfo
		
		
		
		```
		public void logInfo​([LogMarker](../event/LogMarker.html "class in akka.event") marker,
		                    java.lang.String template,
		                    java.lang.Object arg1,
		                    java.lang.Object arg2,
		                    java.lang.Object arg3)
		```
		- #### logWarning
		
		
		
		```
		public void logWarning​(java.lang.String message)
		```
		- #### logWarning
		
		
		
		```
		public void logWarning​(java.lang.String template,
		                       java.lang.Object arg1)
		```
		- #### logWarning
		
		
		
		```
		public void logWarning​([LogMarker](../event/LogMarker.html "class in akka.event") marker,
		                       java.lang.String template,
		                       java.lang.Object arg1)
		```
		- #### logWarning
		
		
		
		```
		public void logWarning​(java.lang.String template,
		                       java.lang.Object arg1,
		                       java.lang.Object arg2)
		```
		- #### logWarning
		
		
		
		```
		public void logWarning​([LogMarker](../event/LogMarker.html "class in akka.event") marker,
		                       java.lang.String template,
		                       java.lang.Object arg1,
		                       java.lang.Object arg2)
		```
		- #### logWarning
		
		
		
		```
		public void logWarning​(java.lang.String template,
		                       java.lang.Object arg1,
		                       java.lang.Object arg2,
		                       java.lang.Object arg3)
		```
		- #### logError
		
		
		
		```
		public void logError​(java.lang.String message)
		```
		- #### logError
		
		
		
		```
		public void logError​([LogMarker](../event/LogMarker.html "class in akka.event") marker,
		                     java.lang.String message)
		```
		- #### logError
		
		
		
		```
		public void logError​(java.lang.String template,
		                     java.lang.Object arg1)
		```
		- #### logError
		
		
		
		```
		public void logError​(java.lang.String template,
		                     java.lang.Object arg1,
		                     java.lang.Object arg2)
		```
		- #### logError
		
		
		
		```
		public void logError​(java.lang.String template,
		                     java.lang.Object arg1,
		                     java.lang.Object arg2,
		                     java.lang.Object arg3)
		```
		- #### logError
		
		
		
		```
		public void logError​(java.lang.Throwable cause,
		                     java.lang.String message)
		```
		- #### logError
		
		
		
		```
		public void logError​(java.lang.Throwable cause,
		                     java.lang.String template,
		                     java.lang.Object arg1)
		```
		- #### logError
		
		
		
		```
		public void logError​(java.lang.Throwable cause,
		                     java.lang.String template,
		                     java.lang.Object arg1,
		                     java.lang.Object arg2)
		```
		- #### logError
		
		
		
		```
		public void logError​(java.lang.Throwable cause,
		                     java.lang.String template,
		                     java.lang.Object arg1,
		                     java.lang.Object arg2,
		                     java.lang.Object arg3)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LogMarker.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.ClusterLogger$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.ClusterLogger$.html)*