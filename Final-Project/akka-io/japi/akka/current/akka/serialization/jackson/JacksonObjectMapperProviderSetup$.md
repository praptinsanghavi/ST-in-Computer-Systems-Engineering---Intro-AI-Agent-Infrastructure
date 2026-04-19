---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html
title: JacksonObjectMapperProviderSetup$
---

# JacksonObjectMapperProviderSetup$

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class JacksonObjectMapperProviderSetup$

- java.lang.Object
- - akka.serialization.jackson.JacksonObjectMapperProviderSetup$

- ---

```
public class JacksonObjectMapperProviderSetup$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JacksonObjectMapperProviderSetup$](JacksonObjectMapperProviderSetup$.html "class in akka.serialization.jackson")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JacksonObjectMapperProviderSetup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson")` | `[apply](#apply(akka.serialization.jackson.JacksonObjectMapperFactory))​([JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory)` | Scala API: factory for defining a `JacksonObjectMapperProvider` that is passed in when ActorSystem  is created rather than creating one from configured class name. |
	| `[JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson")` | `[create](#create(akka.serialization.jackson.JacksonObjectMapperFactory))​([JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory)` | Java API: factory for defining a `JacksonObjectMapperProvider` that is passed in when ActorSystem  is created rather than creating one from configured class name. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JacksonObjectMapperProviderSetup$](JacksonObjectMapperProviderSetup$.html "class in akka.serialization.jackson") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JacksonObjectMapperProviderSetup$
		
		
		
		```
		public JacksonObjectMapperProviderSetup$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson") apply​([JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory)
		```
		
		Scala API: factory for defining a `JacksonObjectMapperProvider` that is passed in when ActorSystem
		 is created rather than creating one from configured class name.
		- #### create
		
		
		
		```
		public [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson") create​([JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") factory)
		```
		
		Java API: factory for defining a `JacksonObjectMapperProvider` that is passed in when ActorSystem
		 is created rather than creating one from configured class name.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperFactory.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html)*