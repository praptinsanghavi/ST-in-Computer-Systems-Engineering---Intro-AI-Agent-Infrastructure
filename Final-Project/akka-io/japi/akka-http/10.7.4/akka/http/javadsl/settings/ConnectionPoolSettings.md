---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ConnectionPoolSettings.html
title: ConnectionPoolSettings
---

# ConnectionPoolSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class ConnectionPoolSettings

- java.lang.Object
- - akka.http.javadsl.settings.ConnectionPoolSettings

- Direct Known Subclasses:
`[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`

---

```
public abstract class ConnectionPoolSettings
extends java.lang.Object
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectionPoolSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[appendHostOverride](#appendHostOverride(java.lang.String,akka.http.javadsl.settings.ConnectionPoolSettings))​(java.lang.String hostPattern,  [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings)` |  |
	| `static [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[getBaseConnectionBackoff](#getBaseConnectionBackoff())()` |  |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[getConnectionSettings](#getConnectionSettings())()` |  |
	| `scala.concurrent.duration.Duration` | `[getIdleTimeout](#getIdleTimeout())()` |  |
	| `scala.concurrent.duration.Duration` | `[getKeepAliveTimeout](#getKeepAliveTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[getMaxConnectionBackoff](#getMaxConnectionBackoff())()` |  |
	| `java.time.Duration` | `[getMaxConnectionLifetime](#getMaxConnectionLifetime())()` |  |
	| `int` | `[getMaxConnections](#getMaxConnections())()` |  |
	| `int` | `[getMaxOpenRequests](#getMaxOpenRequests())()` |  |
	| `int` | `[getMaxRetries](#getMaxRetries())()` |  |
	| `int` | `[getMinConnections](#getMinConnections())()` |  |
	| `int` | `[getPipeliningLimit](#getPipeliningLimit())()` |  |
	| `scala.concurrent.duration.Duration` | `[getResponseEntitySubscriptionTimeout](#getResponseEntitySubscriptionTimeout())()` |  |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withBaseConnectionBackoff](#withBaseConnectionBackoff(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withConnectionSettings](#withConnectionSettings(akka.http.javadsl.settings.ClientConnectionSettings))​([ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withHostOverrides](#withHostOverrides(java.util.List))​(java.util.List<scala.Tuple2<java.lang.String,​[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")>> hostOverrides)` |  |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withIdleTimeout](#withIdleTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withKeepAliveTimeout](#withKeepAliveTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withMaxConnectionBackoff](#withMaxConnectionBackoff(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration newValue)` |  |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withMaxConnectionLifetime](#withMaxConnectionLifetime(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withMaxConnections](#withMaxConnections(int))​(int n)` |  |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withMaxOpenRequests](#withMaxOpenRequests(int))​(int newValue)` |  |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withMaxRetries](#withMaxRetries(int))​(int n)` |  |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withMinConnections](#withMinConnections(int))​(int n)` |  |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withPipeliningLimit](#withPipeliningLimit(int))​(int newValue)` | Client\-side pipelining is not currently supported, see https://github.com/akka/akka\-http/issues/32 |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withResponseEntitySubscriptionTimeout](#withResponseEntitySubscriptionTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")` | `[withTransport](#withTransport(akka.http.javadsl.ClientTransport))​([ClientTransport](../ClientTransport.html "class in akka.http.javadsl") newValue)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConnectionPoolSettings
		
		
		
		```
		public ConnectionPoolSettings()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") create​(com.typesafe.config.Config config)
		```
		- #### create
		
		
		
		```
		public static [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") create​(java.lang.String configOverrides)
		```
		- #### create
		
		
		
		```
		public static [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") create​(akka.actor.ActorSystem system)
		```
		- #### getMaxConnections
		
		
		
		```
		public int getMaxConnections()
		```
		- #### getMinConnections
		
		
		
		```
		public int getMinConnections()
		```
		- #### getMaxRetries
		
		
		
		```
		public int getMaxRetries()
		```
		- #### getMaxOpenRequests
		
		
		
		```
		public int getMaxOpenRequests()
		```
		- #### getPipeliningLimit
		
		
		
		```
		public int getPipeliningLimit()
		```
		- #### getMaxConnectionLifetime
		
		
		
		```
		public java.time.Duration getMaxConnectionLifetime()
		```
		- #### getBaseConnectionBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration getBaseConnectionBackoff()
		```
		- #### getMaxConnectionBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration getMaxConnectionBackoff()
		```
		- #### getIdleTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration getIdleTimeout()
		```
		- #### getKeepAliveTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration getKeepAliveTimeout()
		```
		- #### getConnectionSettings
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") getConnectionSettings()
		```
		- #### getResponseEntitySubscriptionTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration getResponseEntitySubscriptionTimeout()
		```
		- #### withHostOverrides
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withHostOverrides​(java.util.List<scala.Tuple2<java.lang.String,​[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings")>> hostOverrides)
		```
		- #### appendHostOverride
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") appendHostOverride​(java.lang.String hostPattern,
		                                                 [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings)
		```
		- #### withMaxConnections
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withMaxConnections​(int n)
		```
		- #### withMinConnections
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withMinConnections​(int n)
		```
		- #### withMaxRetries
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withMaxRetries​(int n)
		```
		- #### withMaxOpenRequests
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withMaxOpenRequests​(int newValue)
		```
		- #### withPipeliningLimit
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withPipeliningLimit​(int newValue)
		```
		
		Client\-side pipelining is not currently supported, see https://github.com/akka/akka\-http/issues/32
		- #### withBaseConnectionBackoff
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withBaseConnectionBackoff​(scala.concurrent.duration.FiniteDuration newValue)
		```
		- #### withMaxConnectionBackoff
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withMaxConnectionBackoff​(scala.concurrent.duration.FiniteDuration newValue)
		```
		- #### withIdleTimeout
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withIdleTimeout​(scala.concurrent.duration.Duration newValue)
		```
		- #### withKeepAliveTimeout
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withKeepAliveTimeout​(scala.concurrent.duration.Duration newValue)
		```
		- #### withMaxConnectionLifetime
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withMaxConnectionLifetime​(scala.concurrent.duration.Duration newValue)
		```
		- #### withConnectionSettings
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withConnectionSettings​([ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") newValue)
		```
		- #### withResponseEntitySubscriptionTimeout
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withResponseEntitySubscriptionTimeout​(scala.concurrent.duration.Duration newValue)
		```
		- #### withTransport
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.javadsl.settings") withTransport​([ClientTransport](../ClientTransport.html "class in akka.http.javadsl") newValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ConnectionPoolSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ConnectionPoolSettings.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ConnectionPoolSettings.html)*