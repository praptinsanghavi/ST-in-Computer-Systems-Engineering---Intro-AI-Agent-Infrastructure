---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Deploy$.html
title: Deploy$
---

# Deploy$

## Content

Package [akka.actor](package-summary.html)
## Class Deploy$

- java.lang.Object
- - akka.actor.Deploy$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Deploy$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Deploy$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Deploy$](Deploy$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Deploy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` | This class represents deployment configuration for a given actor path. |
	| `com.typesafe.config.Config` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[RouterConfig](../routing/RouterConfig.html "interface in akka.routing")` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[Scope](Scope.html "interface in akka.actor")` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `java.lang.String` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `java.lang.String` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `[Deploy](Deploy.html "class in akka.actor")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config,akka.routing.RouterConfig,akka.actor.Scope,java.lang.String,java.lang.String))​(java.lang.String path,  com.typesafe.config.Config config,  [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig,  [Scope](Scope.html "interface in akka.actor") scope,  java.lang.String dispatcher,  java.lang.String mailbox)` |  |
	| `java.lang.String` | `[apply$default$1](#apply$default$1())()` |  |
	| `com.typesafe.config.Config` | `[apply$default$2](#apply$default$2())()` |  |
	| `[RouterConfig](../routing/RouterConfig.html "interface in akka.routing")` | `[apply$default$3](#apply$default$3())()` |  |
	| `[Scope](Scope.html "interface in akka.actor")` | `[apply$default$4](#apply$default$4())()` |  |
	| `java.lang.String` | `[apply$default$5](#apply$default$5())()` |  |
	| `java.lang.String` | `[apply$default$6](#apply$default$6())()` |  |
	| `[Deploy](Deploy.html "class in akka.actor")` | `[local](#local())()` |  |
	| `java.lang.String` | `[NoDispatcherGiven](#NoDispatcherGiven())()` |  |
	| `java.lang.String` | `[NoMailboxGiven](#NoMailboxGiven())()` |  |
	| `scala.Option<scala.Tuple6<java.lang.String,​com.typesafe.config.Config,​[RouterConfig](../routing/RouterConfig.html "interface in akka.routing"),​[Scope](Scope.html "interface in akka.actor"),​java.lang.String,​java.lang.String>>` | `[unapply](#unapply(akka.actor.Deploy))​([Deploy](Deploy.html "class in akka.actor") deploy)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Deploy$](Deploy$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Deploy$
		
		
		
		```
		public Deploy$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public java.lang.String $lessinit$greater$default$1()
		```
		
		This class represents deployment configuration for a given actor path. It is
		 marked final in order to guarantee stable merge semantics (i.e. what
		 overrides what in case multiple configuration sources are available) and is
		 fully extensible via its Scope argument, and by the fact that an arbitrary
		 Config section can be passed along with it (which will be merged when merging
		 two Deploys).
		 
		 The path field is used only when inserting the Deploy into a deployer and
		 not needed when just doing deploy\-as\-you\-go:
		 
		
		
		
		
		
		```
		
		 val remoteProps = someProps.withDeploy(Deploy(scope = RemoteScope("someOtherNodeName")))
		 
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public com.typesafe.config.Config $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public [Scope](Scope.html "interface in akka.actor") $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public java.lang.String $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public java.lang.String $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> $lessinit$greater$default$7()
		```
		- #### NoDispatcherGiven
		
		
		
		```
		public final java.lang.String NoDispatcherGiven()
		```
		- #### NoMailboxGiven
		
		
		
		```
		public final java.lang.String NoMailboxGiven()
		```
		- #### local
		
		
		
		```
		public [Deploy](Deploy.html "class in akka.actor") local()
		```
		- #### apply
		
		
		
		```
		public [Deploy](Deploy.html "class in akka.actor") apply​(java.lang.String path,
		                    com.typesafe.config.Config config,
		                    [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig,
		                    [Scope](Scope.html "interface in akka.actor") scope,
		                    java.lang.String dispatcher,
		                    java.lang.String mailbox)
		```
		- #### apply$default$1
		
		
		
		```
		public java.lang.String apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public com.typesafe.config.Config apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public [Scope](Scope.html "interface in akka.actor") apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public java.lang.String apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public java.lang.String apply$default$6()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple6<java.lang.String,​com.typesafe.config.Config,​[RouterConfig](../routing/RouterConfig.html "interface in akka.routing"),​[Scope](Scope.html "interface in akka.actor"),​java.lang.String,​java.lang.String>> unapply​([Deploy](Deploy.html "class in akka.actor") deploy)
		```

## Code Examples

### Example 1: $lessinit$greater$default$1

```text
val remoteProps = someProps.withDeploy(Deploy(scope = RemoteScope("someOtherNodeName")))
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Deploy$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Deploy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Scope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Deploy$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Deploy$.html)*