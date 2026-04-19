---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ConnectionPoolSettingsImpl.html
title: ConnectionPoolSettingsImpl
---

# ConnectionPoolSettingsImpl

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class ConnectionPoolSettingsImpl

- java.lang.Object
- - [akka.http.javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")
	- - [akka.http.scaladsl.settings.ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")
		- - akka.http.impl.settings.ConnectionPoolSettingsImpl

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ConnectionPoolSettingsImpl
extends [ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.ConnectionPoolSettingsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectionPoolSettingsImpl](#%3Cinit%3E(int,int,int,int,int,scala.concurrent.duration.Duration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,akka.http.scaladsl.settings.ClientConnectionSettings,scala.concurrent.duration.Duration,scala.collection.immutable.Seq))​(int maxConnections,  int minConnections,  int maxRetries,  int maxOpenRequests,  int pipeliningLimit,  scala.concurrent.duration.Duration maxConnectionLifetime,  scala.concurrent.duration.FiniteDuration baseConnectionBackoff,  scala.concurrent.duration.FiniteDuration maxConnectionBackoff,  scala.concurrent.duration.Duration idleTimeout,  scala.concurrent.duration.Duration keepAliveTimeout,  [ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") connectionSettings,  scala.concurrent.duration.Duration responseEntitySubscriptionTimeout,  scala.collection.immutable.Seq<scala.Tuple2<scala.util.matching.Regex,​[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")>> hostOverrides)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[baseConnectionBackoff](#baseConnectionBackoff())()` |  |
	| `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")` | `[connectionSettings](#connectionSettings())()` |  |
	| `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[copyDeep](#copyDeep(scala.Function1,int,int,int,int,int,scala.concurrent.duration.Duration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,akka.http.scaladsl.settings.ClientConnectionSettings,scala.concurrent.duration.Duration))​(scala.Function1<[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings"),​[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")> mapHostOverrides,  int maxConnections,  int minConnections,  int maxRetries,  int maxOpenRequests,  int pipeliningLimit,  scala.concurrent.duration.Duration maxConnectionLifetime,  scala.concurrent.duration.FiniteDuration baseConnectionBackoff,  scala.concurrent.duration.FiniteDuration maxConnectionBackoff,  scala.concurrent.duration.Duration idleTimeout,  scala.concurrent.duration.Duration keepAliveTimeout,  [ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") connectionSettings,  scala.concurrent.duration.Duration responseEntitySubscriptionTimeout)` | INTERNAL API |
	| `static [ConnectionPoolSettingsImpl](ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `scala.collection.immutable.Seq<scala.Tuple2<scala.util.matching.Regex,​[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")>>` | `[hostOverrides](#hostOverrides())()` |  |
	| `static scala.util.matching.Regex` | `[hostRegex](#hostRegex(java.lang.String))​(java.lang.String pattern)` |  |
	| `scala.concurrent.duration.Duration` | `[idleTimeout](#idleTimeout())()` |  |
	| `scala.concurrent.duration.Duration` | `[keepAliveTimeout](#keepAliveTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[maxConnectionBackoff](#maxConnectionBackoff())()` |  |
	| `scala.concurrent.duration.Duration` | `[maxConnectionLifetime](#maxConnectionLifetime())()` |  |
	| `int` | `[maxConnections](#maxConnections())()` |  |
	| `int` | `[maxOpenRequests](#maxOpenRequests())()` |  |
	| `int` | `[maxRetries](#maxRetries())()` |  |
	| `int` | `[minConnections](#minConnections())()` |  |
	| `int` | `[pipeliningLimit](#pipeliningLimit())()` |  |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.concurrent.duration.Duration` | `[responseEntitySubscriptionTimeout](#responseEntitySubscriptionTimeout())()` | The time after which the pool will drop an entity automatically if it wasn't read or discarded |
	| `[ConnectionPoolSettingsImpl](ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings")` | `[withUpdatedConnectionSettings](#withUpdatedConnectionSettings(scala.Function1))​(scala.Function1<[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings"),​[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")> f)` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.settings.[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[appendHostOverride](../../scaladsl/settings/ConnectionPoolSettings.html#appendHostOverride(java.lang.String,akka.http.scaladsl.settings.ConnectionPoolSettings)), [forHost](../../scaladsl/settings/ConnectionPoolSettings.html#forHost(java.lang.String)), [transport](../../scaladsl/settings/ConnectionPoolSettings.html#transport()), [withBaseConnectionBackoff](../../scaladsl/settings/ConnectionPoolSettings.html#withBaseConnectionBackoff(scala.concurrent.duration.FiniteDuration)), [withConnectionSettings](../../scaladsl/settings/ConnectionPoolSettings.html#withConnectionSettings(akka.http.scaladsl.settings.ClientConnectionSettings)), [withHostOverrides](../../scaladsl/settings/ConnectionPoolSettings.html#withHostOverrides(scala.collection.immutable.Seq)), [withIdleTimeout](../../scaladsl/settings/ConnectionPoolSettings.html#withIdleTimeout(scala.concurrent.duration.Duration)), [withKeepAliveTimeout](../../scaladsl/settings/ConnectionPoolSettings.html#withKeepAliveTimeout(scala.concurrent.duration.Duration)), [withMaxConnectionBackoff](../../scaladsl/settings/ConnectionPoolSettings.html#withMaxConnectionBackoff(scala.concurrent.duration.FiniteDuration)), [withMaxConnectionLifetime](../../scaladsl/settings/ConnectionPoolSettings.html#withMaxConnectionLifetime(scala.concurrent.duration.Duration)), [withMaxConnections](../../scaladsl/settings/ConnectionPoolSettings.html#withMaxConnections(int)), [withMaxOpenRequests](../../scaladsl/settings/ConnectionPoolSettings.html#withMaxOpenRequests(int)), [withMaxRetries](../../scaladsl/settings/ConnectionPoolSettings.html#withMaxRetries(int)), [withMinConnections](../../scaladsl/settings/ConnectionPoolSettings.html#withMinConnections(int)), [withPipeliningLimit](../../scaladsl/settings/ConnectionPoolSettings.html#withPipeliningLimit(int)), [withResponseEntitySubscriptionTimeout](../../scaladsl/settings/ConnectionPoolSettings.html#withResponseEntitySubscriptionTimeout(scala.concurrent.duration.Duration)), [withTransport](../../scaladsl/settings/ConnectionPoolSettings.html#withTransport(akka.http.scaladsl.ClientTransport))`
		- ### Methods inherited from class akka.http.javadsl.settings.[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")
		
		
		`[appendHostOverride](../../javadsl/settings/ConnectionPoolSettings.html#appendHostOverride(java.lang.String,akka.http.javadsl.settings.ConnectionPoolSettings)), [create](../../javadsl/settings/ConnectionPoolSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/ConnectionPoolSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/ConnectionPoolSettings.html#create(java.lang.String)), [getBaseConnectionBackoff](../../javadsl/settings/ConnectionPoolSettings.html#getBaseConnectionBackoff()), [getConnectionSettings](../../javadsl/settings/ConnectionPoolSettings.html#getConnectionSettings()), [getIdleTimeout](../../javadsl/settings/ConnectionPoolSettings.html#getIdleTimeout()), [getKeepAliveTimeout](../../javadsl/settings/ConnectionPoolSettings.html#getKeepAliveTimeout()), [getMaxConnectionBackoff](../../javadsl/settings/ConnectionPoolSettings.html#getMaxConnectionBackoff()), [getMaxConnectionLifetime](../../javadsl/settings/ConnectionPoolSettings.html#getMaxConnectionLifetime()), [getMaxConnections](../../javadsl/settings/ConnectionPoolSettings.html#getMaxConnections()), [getMaxOpenRequests](../../javadsl/settings/ConnectionPoolSettings.html#getMaxOpenRequests()), [getMaxRetries](../../javadsl/settings/ConnectionPoolSettings.html#getMaxRetries()), [getMinConnections](../../javadsl/settings/ConnectionPoolSettings.html#getMinConnections()), [getPipeliningLimit](../../javadsl/settings/ConnectionPoolSettings.html#getPipeliningLimit()), [getResponseEntitySubscriptionTimeout](../../javadsl/settings/ConnectionPoolSettings.html#getResponseEntitySubscriptionTimeout()), [withConnectionSettings](../../javadsl/settings/ConnectionPoolSettings.html#withConnectionSettings(akka.http.javadsl.settings.ClientConnectionSettings)), [withHostOverrides](../../javadsl/settings/ConnectionPoolSettings.html#withHostOverrides(java.util.List)), [withTransport](../../javadsl/settings/ConnectionPoolSettings.html#withTransport(akka.http.javadsl.ClientTransport))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### ConnectionPoolSettingsImpl
		
		
		
		```
		public ConnectionPoolSettingsImpl​(int maxConnections,
		                                  int minConnections,
		                                  int maxRetries,
		                                  int maxOpenRequests,
		                                  int pipeliningLimit,
		                                  scala.concurrent.duration.Duration maxConnectionLifetime,
		                                  scala.concurrent.duration.FiniteDuration baseConnectionBackoff,
		                                  scala.concurrent.duration.FiniteDuration maxConnectionBackoff,
		                                  scala.concurrent.duration.Duration idleTimeout,
		                                  scala.concurrent.duration.Duration keepAliveTimeout,
		                                  [ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") connectionSettings,
		                                  scala.concurrent.duration.Duration responseEntitySubscriptionTimeout,
		                                  scala.collection.immutable.Seq<scala.Tuple2<scala.util.matching.Regex,​[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")>> hostOverrides)
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [ConnectionPoolSettingsImpl](ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                                       com.typesafe.config.Config c)
		```
		- #### hostRegex
		
		
		
		```
		public static scala.util.matching.Regex hostRegex​(java.lang.String pattern)
		```
		- #### prefix
		
		
		
		```
		protected static java.lang.String prefix()
		```
		- #### apply
		
		
		
		```
		public static T apply​(akka.actor.ActorSystem system)
		```
		- #### apply
		
		
		
		```
		public static T apply​(java.lang.String configOverrides)
		```
		- #### apply
		
		
		
		```
		public static T apply​(com.typesafe.config.Config config)
		```
		- #### maxConnections
		
		
		
		```
		public int maxConnections()
		```
		
		
		Specified by:
		`[maxConnections](../../scaladsl/settings/ConnectionPoolSettings.html#maxConnections())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### minConnections
		
		
		
		```
		public int minConnections()
		```
		
		
		Specified by:
		`[minConnections](../../scaladsl/settings/ConnectionPoolSettings.html#minConnections())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxRetries
		
		
		
		```
		public int maxRetries()
		```
		
		
		Specified by:
		`[maxRetries](../../scaladsl/settings/ConnectionPoolSettings.html#maxRetries())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxOpenRequests
		
		
		
		```
		public int maxOpenRequests()
		```
		
		
		Specified by:
		`[maxOpenRequests](../../scaladsl/settings/ConnectionPoolSettings.html#maxOpenRequests())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### pipeliningLimit
		
		
		
		```
		public int pipeliningLimit()
		```
		
		
		Specified by:
		`[pipeliningLimit](../../scaladsl/settings/ConnectionPoolSettings.html#pipeliningLimit())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxConnectionLifetime
		
		
		
		```
		public scala.concurrent.duration.Duration maxConnectionLifetime()
		```
		
		
		Specified by:
		`[maxConnectionLifetime](../../scaladsl/settings/ConnectionPoolSettings.html#maxConnectionLifetime())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### baseConnectionBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration baseConnectionBackoff()
		```
		
		
		Specified by:
		`[baseConnectionBackoff](../../scaladsl/settings/ConnectionPoolSettings.html#baseConnectionBackoff())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxConnectionBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration maxConnectionBackoff()
		```
		
		
		Specified by:
		`[maxConnectionBackoff](../../scaladsl/settings/ConnectionPoolSettings.html#maxConnectionBackoff())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### idleTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration idleTimeout()
		```
		
		
		Specified by:
		`[idleTimeout](../../scaladsl/settings/ConnectionPoolSettings.html#idleTimeout())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### keepAliveTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration keepAliveTimeout()
		```
		
		
		Specified by:
		`[keepAliveTimeout](../../scaladsl/settings/ConnectionPoolSettings.html#keepAliveTimeout())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### connectionSettings
		
		
		
		```
		public [ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") connectionSettings()
		```
		
		
		Specified by:
		`[connectionSettings](../../scaladsl/settings/ConnectionPoolSettings.html#connectionSettings())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### responseEntitySubscriptionTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration responseEntitySubscriptionTimeout()
		```
		
		Description copied from class: `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html#responseEntitySubscriptionTimeout())`
		The time after which the pool will drop an entity automatically if it wasn't read or discarded
		
		Specified by:
		`[responseEntitySubscriptionTimeout](../../scaladsl/settings/ConnectionPoolSettings.html#responseEntitySubscriptionTimeout())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### hostOverrides
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<scala.util.matching.Regex,​[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")>> hostOverrides()
		```
		
		
		Specified by:
		`[hostOverrides](../../scaladsl/settings/ConnectionPoolSettings.html#hostOverrides())` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### withUpdatedConnectionSettings
		
		
		
		```
		public [ConnectionPoolSettingsImpl](ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings") withUpdatedConnectionSettings​(scala.Function1<[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings"),​[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")> f)
		```
		
		
		Specified by:
		`[withUpdatedConnectionSettings](../../scaladsl/settings/ConnectionPoolSettings.html#withUpdatedConnectionSettings(scala.Function1))` in class `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")`
		- #### copyDeep
		
		
		
		```
		public [ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") copyDeep​(scala.Function1<[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings"),​[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")> mapHostOverrides,
		                                       int maxConnections,
		                                       int minConnections,
		                                       int maxRetries,
		                                       int maxOpenRequests,
		                                       int pipeliningLimit,
		                                       scala.concurrent.duration.Duration maxConnectionLifetime,
		                                       scala.concurrent.duration.FiniteDuration baseConnectionBackoff,
		                                       scala.concurrent.duration.FiniteDuration maxConnectionBackoff,
		                                       scala.concurrent.duration.Duration idleTimeout,
		                                       scala.concurrent.duration.Duration keepAliveTimeout,
		                                       [ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") connectionSettings,
		                                       scala.concurrent.duration.Duration responseEntitySubscriptionTimeout)
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ConnectionPoolSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ConnectionPoolSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ConnectionPoolSettingsImpl.html)*