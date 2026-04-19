---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:51:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/Deploy.html
title: Deploy
---

# Deploy

## Content

Package [akka.actor](package-summary.html)
## Class Deploy

- java.lang.Object
- - akka.actor.Deploy

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Deploy
extends java.lang.Object
implements java.io.Serializable, scala.Product, scala.Equals
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Deploy)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Deploy](#%3Cinit%3E(akka.actor.Scope))​([Scope](Scope.html "interface in akka.actor") scope)` | Java API to create a Deploy with the given Scope |
	| `[Deploy](#%3Cinit%3E(akka.routing.RouterConfig))​([RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routing)` | Java API to create a Deploy with the given RouterConfig |
	| `[Deploy](#%3Cinit%3E(akka.routing.RouterConfig,akka.actor.Scope))​([RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routing,  [Scope](Scope.html "interface in akka.actor") scope)` | Java API to create a Deploy with the given RouterConfig with Scope |
	| `[Deploy](#%3Cinit%3E(java.lang.String,com.typesafe.config.Config,akka.routing.RouterConfig,akka.actor.Scope,java.lang.String,java.lang.String))​(java.lang.String path,  com.typesafe.config.Config config,  [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig,  [Scope](Scope.html "interface in akka.actor") scope,  java.lang.String dispatcher,  java.lang.String mailbox)` |  |
	| `[Deploy](#%3Cinit%3E(java.lang.String,com.typesafe.config.Config,akka.routing.RouterConfig,akka.actor.Scope,java.lang.String,java.lang.String,scala.collection.immutable.Set))​(java.lang.String path,  com.typesafe.config.Config config,  [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig,  [Scope](Scope.html "interface in akka.actor") scope,  java.lang.String dispatcher,  java.lang.String mailbox,  scala.collection.immutable.Set<java.lang.String> tags)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` | This class represents deployment configuration for a given actor path. |
	| `static com.typesafe.config.Config` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static [RouterConfig](../routing/RouterConfig.html "interface in akka.routing")` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static [Scope](Scope.html "interface in akka.actor")` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `static java.lang.String` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `static java.lang.String` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `static scala.collection.immutable.Set<java.lang.String>` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `static [Deploy](Deploy.html "class in akka.actor")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config,akka.routing.RouterConfig,akka.actor.Scope,java.lang.String,java.lang.String))​(java.lang.String path,  com.typesafe.config.Config config,  [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig,  [Scope](Scope.html "interface in akka.actor") scope,  java.lang.String dispatcher,  java.lang.String mailbox)` |  |
	| `static java.lang.String` | `[apply$default$1](#apply$default$1())()` |  |
	| `static com.typesafe.config.Config` | `[apply$default$2](#apply$default$2())()` |  |
	| `static [RouterConfig](../routing/RouterConfig.html "interface in akka.routing")` | `[apply$default$3](#apply$default$3())()` |  |
	| `static [Scope](Scope.html "interface in akka.actor")` | `[apply$default$4](#apply$default$4())()` |  |
	| `static java.lang.String` | `[apply$default$5](#apply$default$5())()` |  |
	| `static java.lang.String` | `[apply$default$6](#apply$default$6())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object that)` |  |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `[Deploy](Deploy.html "class in akka.actor")` | `[copy](#copy(java.lang.String,com.typesafe.config.Config,akka.routing.RouterConfig,akka.actor.Scope,java.lang.String,java.lang.String))​(java.lang.String path,  com.typesafe.config.Config config,  [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig,  [Scope](Scope.html "interface in akka.actor") scope,  java.lang.String dispatcher,  java.lang.String mailbox)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `com.typesafe.config.Config` | `[copy$default$2](#copy$default$2())()` |  |
	| `[RouterConfig](../routing/RouterConfig.html "interface in akka.routing")` | `[copy$default$3](#copy$default$3())()` |  |
	| `[Scope](Scope.html "interface in akka.actor")` | `[copy$default$4](#copy$default$4())()` |  |
	| `java.lang.String` | `[copy$default$5](#copy$default$5())()` |  |
	| `java.lang.String` | `[copy$default$6](#copy$default$6())()` |  |
	| `java.lang.String` | `[dispatcher](#dispatcher())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static [Deploy](Deploy.html "class in akka.actor")` | `[local](#local())()` |  |
	| `java.lang.String` | `[mailbox](#mailbox())()` |  |
	| `static java.lang.String` | `[NoDispatcherGiven](#NoDispatcherGiven())()` |  |
	| `static java.lang.String` | `[NoMailboxGiven](#NoMailboxGiven())()` |  |
	| `java.lang.String` | `[path](#path())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int n)` |  |
	| `[RouterConfig](../routing/RouterConfig.html "interface in akka.routing")` | `[routerConfig](#routerConfig())()` |  |
	| `[Scope](Scope.html "interface in akka.actor")` | `[scope](#scope())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[tags](#tags())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple6<java.lang.String,​com.typesafe.config.Config,​[RouterConfig](../routing/RouterConfig.html "interface in akka.routing"),​[Scope](Scope.html "interface in akka.actor"),​java.lang.String,​java.lang.String>>` | `[unapply](#unapply(akka.actor.Deploy))​([Deploy](Deploy.html "class in akka.actor") deploy)` |  |
	| `[Deploy](Deploy.html "class in akka.actor")` | `[withFallback](#withFallback(akka.actor.Deploy))​([Deploy](Deploy.html "class in akka.actor") other)` | Do a merge between this and the other Deploy, where values from \&ldquo;this\&rdquo; take  precedence. |
	| `[Deploy](Deploy.html "class in akka.actor")` | `[withTags](#withTags(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> tags)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### Deploy
		
		
		
		```
		public Deploy​(java.lang.String path,
		              com.typesafe.config.Config config,
		              [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig,
		              [Scope](Scope.html "interface in akka.actor") scope,
		              java.lang.String dispatcher,
		              java.lang.String mailbox,
		              scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### Deploy
		
		
		
		```
		public Deploy​(java.lang.String path,
		              com.typesafe.config.Config config,
		              [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig,
		              [Scope](Scope.html "interface in akka.actor") scope,
		              java.lang.String dispatcher,
		              java.lang.String mailbox)
		```
		- #### Deploy
		
		
		
		```
		public Deploy​([RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routing)
		```
		
		Java API to create a Deploy with the given RouterConfig
		- #### Deploy
		
		
		
		```
		public Deploy​([RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routing,
		              [Scope](Scope.html "interface in akka.actor") scope)
		```
		
		Java API to create a Deploy with the given RouterConfig with Scope
		- #### Deploy
		
		
		
		```
		public Deploy​([Scope](Scope.html "interface in akka.actor") scope)
		```
		
		Java API to create a Deploy with the given Scope

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static java.lang.String $lessinit$greater$default$1()
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
		public static com.typesafe.config.Config $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public static [Scope](Scope.html "interface in akka.actor") $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public static java.lang.String $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public static java.lang.String $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public static scala.collection.immutable.Set<java.lang.String> $lessinit$greater$default$7()
		```
		- #### NoDispatcherGiven
		
		
		
		```
		public static final java.lang.String NoDispatcherGiven()
		```
		- #### NoMailboxGiven
		
		
		
		```
		public static final java.lang.String NoMailboxGiven()
		```
		- #### local
		
		
		
		```
		public static [Deploy](Deploy.html "class in akka.actor") local()
		```
		- #### apply
		
		
		
		```
		public static [Deploy](Deploy.html "class in akka.actor") apply​(java.lang.String path,
		                           com.typesafe.config.Config config,
		                           [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig,
		                           [Scope](Scope.html "interface in akka.actor") scope,
		                           java.lang.String dispatcher,
		                           java.lang.String mailbox)
		```
		- #### apply$default$1
		
		
		
		```
		public static java.lang.String apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public static com.typesafe.config.Config apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public static [Scope](Scope.html "interface in akka.actor") apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public static java.lang.String apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public static java.lang.String apply$default$6()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple6<java.lang.String,​com.typesafe.config.Config,​[RouterConfig](../routing/RouterConfig.html "interface in akka.routing"),​[Scope](Scope.html "interface in akka.actor"),​java.lang.String,​java.lang.String>> unapply​([Deploy](Deploy.html "class in akka.actor") deploy)
		```
		- #### path
		
		
		
		```
		public java.lang.String path()
		```
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		- #### routerConfig
		
		
		
		```
		public [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig()
		```
		- #### scope
		
		
		
		```
		public [Scope](Scope.html "interface in akka.actor") scope()
		```
		- #### dispatcher
		
		
		
		```
		public java.lang.String dispatcher()
		```
		- #### mailbox
		
		
		
		```
		public java.lang.String mailbox()
		```
		- #### tags
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> tags()
		```
		- #### withFallback
		
		
		
		```
		public [Deploy](Deploy.html "class in akka.actor") withFallback​([Deploy](Deploy.html "class in akka.actor") other)
		```
		
		Do a merge between this and the other Deploy, where values from \&ldquo;this\&rdquo; take
		 precedence. The \&ldquo;path\&rdquo; of the other Deploy is not taken into account. All
		 other members are merged using `X.withFallback(other.X)`.
		- #### withTags
		
		
		
		```
		public [Deploy](Deploy.html "class in akka.actor") withTags​(scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### copy
		
		
		
		```
		public [Deploy](Deploy.html "class in akka.actor") copy​(java.lang.String path,
		                   com.typesafe.config.Config config,
		                   [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig,
		                   [Scope](Scope.html "interface in akka.actor") scope,
		                   java.lang.String dispatcher,
		                   java.lang.String mailbox)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public com.typesafe.config.Config copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public [Scope](Scope.html "interface in akka.actor") copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public java.lang.String copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public java.lang.String copy$default$6()
		```
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int n)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object that)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Code Examples

### Example 1: $lessinit$greater$default$1

```text
val remoteProps = someProps.withDeploy(Deploy(scope = RemoteScope("someOtherNodeName")))
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/Deploy.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/Scope.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/Deploy.html](https://doc.akka.io/japi/akka-core/current/akka/actor/Deploy.html)*