---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/ActorSystemResource.html
title: ActorSystemResource
---

# ActorSystemResource

## Content

Package [akka.http.javadsl.testkit](package-summary.html)
## Class ActorSystemResource

- java.lang.Object
- - org.junit.rules.ExternalResource
	- - akka.http.javadsl.testkit.ActorSystemResource

- All Implemented Interfaces:
`org.junit.rules.TestRule`

---

```
public class ActorSystemResource
extends org.junit.rules.ExternalResource
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSystemResource](#%3Cinit%3E(java.lang.String,com.typesafe.config.Config))​(java.lang.String name,  com.typesafe.config.Config additionalConfig)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[after](#after())()` |  |
	| `void` | `[before](#before())()` |  |
	| `protected com.typesafe.config.Config` | `[config](#config())()` |  |
	| `protected akka.actor.ActorSystem` | `[createSystem](#createSystem())()` |  |
	| `akka.stream.Materializer` | `[materializer](#materializer())()` |  |
	| `akka.actor.ActorSystem` | `[system](#system())()` |  |
	
	
		- ### Methods inherited from class org.junit.rules.ExternalResource
		
		
		`apply`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorSystemResource
		
		
		
		```
		public ActorSystemResource​(java.lang.String name,
		                           com.typesafe.config.Config additionalConfig)
		```

	- ### Method Detail
	
	
	
		- #### after
		
		
		
		```
		public void after()
		```
		
		
		Overrides:
		`after` in class `org.junit.rules.ExternalResource`
		- #### before
		
		
		
		```
		public void before()
		```
		
		
		Overrides:
		`before` in class `org.junit.rules.ExternalResource`
		- #### config
		
		
		
		```
		protected com.typesafe.config.Config config()
		```
		- #### createSystem
		
		
		
		```
		protected akka.actor.ActorSystem createSystem()
		```
		- #### materializer
		
		
		
		```
		public akka.stream.Materializer materializer()
		```
		- #### system
		
		
		
		```
		public akka.actor.ActorSystem system()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/ActorSystemResource.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/ActorSystemResource.html)*