---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
title: ConnectionPoolSettings
---

# ConnectionPoolSettings

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Class ConnectionPoolSettings

- java.lang.Object
- - [akka.http.javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")
	- - akka.http.scaladsl.settings.ConnectionPoolSettings

- Direct Known Subclasses:
`[ConnectionPoolSettingsImpl](../../impl/settings/ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings")`

---

```
public abstract class ConnectionPoolSettings
extends [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectionPoolSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[appendHostOverride](#appendHostOverride(java.lang.String,akka.http.scaladsl.settings.ConnectionPoolSettings))​(java.lang.String hostPattern,  [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings)` |  |
	| `static [ConnectionPoolSettingsImpl](../../impl/settings/ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [ConnectionPoolSettingsImpl](../../impl/settings/ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `abstract scala.concurrent.duration.FiniteDuration` | `[baseConnectionBackoff](#baseConnectionBackoff())()` |  |
	| `abstract [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings")` | `[connectionSettings](#connectionSettings())()` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[forHost](#forHost(java.lang.String))​(java.lang.String host)` | This checks to see if there's a matching host override. |
	| `abstract scala.collection.immutable.Seq<scala.Tuple2<scala.util.matching.Regex,​[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")>>` | `[hostOverrides](#hostOverrides())()` |  |
	| `abstract scala.concurrent.duration.Duration` | `[idleTimeout](#idleTimeout())()` |  |
	| `abstract scala.concurrent.duration.Duration` | `[keepAliveTimeout](#keepAliveTimeout())()` |  |
	| `abstract scala.concurrent.duration.FiniteDuration` | `[maxConnectionBackoff](#maxConnectionBackoff())()` |  |
	| `abstract scala.concurrent.duration.Duration` | `[maxConnectionLifetime](#maxConnectionLifetime())()` |  |
	| `abstract int` | `[maxConnections](#maxConnections())()` |  |
	| `abstract int` | `[maxOpenRequests](#maxOpenRequests())()` |  |
	| `abstract int` | `[maxRetries](#maxRetries())()` |  |
	| `abstract int` | `[minConnections](#minConnections())()` |  |
	| `abstract int` | `[pipeliningLimit](#pipeliningLimit())()` |  |
	| `abstract scala.concurrent.duration.Duration` | `[responseEntitySubscriptionTimeout](#responseEntitySubscriptionTimeout())()` | The time after which the pool will drop an entity automatically if it wasn't read or discarded |
	| `[ClientTransport](../ClientTransport.html "interface in akka.http.scaladsl")` | `[transport](#transport())()` | Deprecated. Deprecated in favor of connectionSettings.transport. |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withBaseConnectionBackoff](#withBaseConnectionBackoff(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withConnectionSettings](#withConnectionSettings(akka.http.scaladsl.settings.ClientConnectionSettings))​([ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings") newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withHostOverrides](#withHostOverrides(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")>> hostOverrides)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withIdleTimeout](#withIdleTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withKeepAliveTimeout](#withKeepAliveTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxConnectionBackoff](#withMaxConnectionBackoff(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxConnectionLifetime](#withMaxConnectionLifetime(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxConnections](#withMaxConnections(int))​(int n)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxOpenRequests](#withMaxOpenRequests(int))​(int newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxRetries](#withMaxRetries(int))​(int n)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withMinConnections](#withMinConnections(int))​(int n)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withPipeliningLimit](#withPipeliningLimit(int))​(int newValue)` | Client\-side pipelining is not currently supported, see https://github.com/akka/akka\-http/issues/32 |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withResponseEntitySubscriptionTimeout](#withResponseEntitySubscriptionTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withTransport](#withTransport(akka.http.scaladsl.ClientTransport))​([ClientTransport](../ClientTransport.html "interface in akka.http.scaladsl") newValue)` | Since 10\.1\.0, the transport is configured in [`ClientConnectionSettings`](ClientConnectionSettings.html "class in akka.http.scaladsl.settings"). |
	| `abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[withUpdatedConnectionSettings](#withUpdatedConnectionSettings(scala.Function1))​(scala.Function1<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings"),​[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings")> f)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.settings.[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")
		
		
		`[appendHostOverride](../../javadsl/settings/ConnectionPoolSettings.html#appendHostOverride(java.lang.String,akka.http.javadsl.settings.ConnectionPoolSettings)), [create](../../javadsl/settings/ConnectionPoolSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/ConnectionPoolSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/ConnectionPoolSettings.html#create(java.lang.String)), [getBaseConnectionBackoff](../../javadsl/settings/ConnectionPoolSettings.html#getBaseConnectionBackoff()), [getConnectionSettings](../../javadsl/settings/ConnectionPoolSettings.html#getConnectionSettings()), [getIdleTimeout](../../javadsl/settings/ConnectionPoolSettings.html#getIdleTimeout()), [getKeepAliveTimeout](../../javadsl/settings/ConnectionPoolSettings.html#getKeepAliveTimeout()), [getMaxConnectionBackoff](../../javadsl/settings/ConnectionPoolSettings.html#getMaxConnectionBackoff()), [getMaxConnectionLifetime](../../javadsl/settings/ConnectionPoolSettings.html#getMaxConnectionLifetime()), [getMaxConnections](../../javadsl/settings/ConnectionPoolSettings.html#getMaxConnections()), [getMaxOpenRequests](../../javadsl/settings/ConnectionPoolSettings.html#getMaxOpenRequests()), [getMaxRetries](../../javadsl/settings/ConnectionPoolSettings.html#getMaxRetries()), [getMinConnections](../../javadsl/settings/ConnectionPoolSettings.html#getMinConnections()), [getPipeliningLimit](../../javadsl/settings/ConnectionPoolSettings.html#getPipeliningLimit()), [getResponseEntitySubscriptionTimeout](../../javadsl/settings/ConnectionPoolSettings.html#getResponseEntitySubscriptionTimeout()), [withConnectionSettings](../../javadsl/settings/ConnectionPoolSettings.html#withConnectionSettings(akka.http.javadsl.settings.ClientConnectionSettings)), [withHostOverrides](../../javadsl/settings/ConnectionPoolSettings.html#withHostOverrides(java.util.List)), [withTransport](../../javadsl/settings/ConnectionPoolSettings.html#withTransport(akka.http.javadsl.ClientTransport))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConnectionPoolSettings
		
		
		
		```
		public ConnectionPoolSettings()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ConnectionPoolSettingsImpl](../../impl/settings/ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings") apply​(com.typesafe.config.Config config)
		```
		- #### apply
		
		
		
		```
		public static [ConnectionPoolSettingsImpl](../../impl/settings/ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings") apply​(java.lang.String configOverrides)
		```
		- #### maxConnections
		
		
		
		```
		public abstract int maxConnections()
		```
		- #### minConnections
		
		
		
		```
		public abstract int minConnections()
		```
		- #### maxRetries
		
		
		
		```
		public abstract int maxRetries()
		```
		- #### maxOpenRequests
		
		
		
		```
		public abstract int maxOpenRequests()
		```
		- #### pipeliningLimit
		
		
		
		```
		public abstract int pipeliningLimit()
		```
		- #### baseConnectionBackoff
		
		
		
		```
		public abstract scala.concurrent.duration.FiniteDuration baseConnectionBackoff()
		```
		- #### maxConnectionBackoff
		
		
		
		```
		public abstract scala.concurrent.duration.FiniteDuration maxConnectionBackoff()
		```
		- #### idleTimeout
		
		
		
		```
		public abstract scala.concurrent.duration.Duration idleTimeout()
		```
		- #### keepAliveTimeout
		
		
		
		```
		public abstract scala.concurrent.duration.Duration keepAliveTimeout()
		```
		- #### connectionSettings
		
		
		
		```
		public abstract [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings") connectionSettings()
		```
		- #### maxConnectionLifetime
		
		
		
		```
		public abstract scala.concurrent.duration.Duration maxConnectionLifetime()
		```
		- #### hostOverrides
		
		
		
		```
		public abstract scala.collection.immutable.Seq<scala.Tuple2<scala.util.matching.Regex,​[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")>> hostOverrides()
		```
		- #### forHost
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") forHost​(java.lang.String host)
		```
		
		This checks to see if there's a matching host override. When multiple patterns match,
		 the first matching set of overrides is selected.
		
		Parameters:
		`host` \- (undocumented)
		Returns:
		(undocumented)
		- #### transport
		
		
		
		```
		public [ClientTransport](../ClientTransport.html "interface in akka.http.scaladsl") transport()
		```
		
		Deprecated.
		Deprecated in favor of connectionSettings.transport. Since 10\.1\.0\.
		
		The underlying transport used to connect to hosts. By default `ClientTransport.TCP` is used.
		
		Returns:
		(undocumented)
		- #### responseEntitySubscriptionTimeout
		
		
		
		```
		public abstract scala.concurrent.duration.Duration responseEntitySubscriptionTimeout()
		```
		
		The time after which the pool will drop an entity automatically if it wasn't read or discarded
		- #### withHostOverrides
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withHostOverrides​(scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​[ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")>> hostOverrides)
		```
		- #### appendHostOverride
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") appendHostOverride​(java.lang.String hostPattern,
		                                                 [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		- #### withMaxConnections
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withMaxConnections​(int n)
		```
		
		
		Specified by:
		`[withMaxConnections](../../javadsl/settings/ConnectionPoolSettings.html#withMaxConnections(int))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withMinConnections
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withMinConnections​(int n)
		```
		
		
		Specified by:
		`[withMinConnections](../../javadsl/settings/ConnectionPoolSettings.html#withMinConnections(int))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxRetries
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withMaxRetries​(int n)
		```
		
		
		Specified by:
		`[withMaxRetries](../../javadsl/settings/ConnectionPoolSettings.html#withMaxRetries(int))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxOpenRequests
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withMaxOpenRequests​(int newValue)
		```
		
		
		Specified by:
		`[withMaxOpenRequests](../../javadsl/settings/ConnectionPoolSettings.html#withMaxOpenRequests(int))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withBaseConnectionBackoff
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withBaseConnectionBackoff​(scala.concurrent.duration.FiniteDuration newValue)
		```
		
		
		Specified by:
		`[withBaseConnectionBackoff](../../javadsl/settings/ConnectionPoolSettings.html#withBaseConnectionBackoff(scala.concurrent.duration.FiniteDuration))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxConnectionBackoff
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withMaxConnectionBackoff​(scala.concurrent.duration.FiniteDuration newValue)
		```
		
		
		Specified by:
		`[withMaxConnectionBackoff](../../javadsl/settings/ConnectionPoolSettings.html#withMaxConnectionBackoff(scala.concurrent.duration.FiniteDuration))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withPipeliningLimit
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withPipeliningLimit​(int newValue)
		```
		
		Description copied from class: `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html#withPipeliningLimit(int))`
		Client\-side pipelining is not currently supported, see https://github.com/akka/akka\-http/issues/32
		
		Specified by:
		`[withPipeliningLimit](../../javadsl/settings/ConnectionPoolSettings.html#withPipeliningLimit(int))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withIdleTimeout
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withIdleTimeout​(scala.concurrent.duration.Duration newValue)
		```
		
		
		Specified by:
		`[withIdleTimeout](../../javadsl/settings/ConnectionPoolSettings.html#withIdleTimeout(scala.concurrent.duration.Duration))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withKeepAliveTimeout
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withKeepAliveTimeout​(scala.concurrent.duration.Duration newValue)
		```
		
		
		Specified by:
		`[withKeepAliveTimeout](../../javadsl/settings/ConnectionPoolSettings.html#withKeepAliveTimeout(scala.concurrent.duration.Duration))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxConnectionLifetime
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withMaxConnectionLifetime​(scala.concurrent.duration.Duration newValue)
		```
		
		
		Specified by:
		`[withMaxConnectionLifetime](../../javadsl/settings/ConnectionPoolSettings.html#withMaxConnectionLifetime(scala.concurrent.duration.Duration))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withConnectionSettings
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withConnectionSettings​([ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings") newValue)
		```
		- #### withResponseEntitySubscriptionTimeout
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withResponseEntitySubscriptionTimeout​(scala.concurrent.duration.Duration newValue)
		```
		
		
		Specified by:
		`[withResponseEntitySubscriptionTimeout](../../javadsl/settings/ConnectionPoolSettings.html#withResponseEntitySubscriptionTimeout(scala.concurrent.duration.Duration))` in class `[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings")`
		- #### withTransport
		
		
		
		```
		public [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withTransport​([ClientTransport](../ClientTransport.html "interface in akka.http.scaladsl") newValue)
		```
		
		Since 10\.1\.0, the transport is configured in [`ClientConnectionSettings`](ClientConnectionSettings.html "class in akka.http.scaladsl.settings"). This method is a shortcut for
		 `withUpdatedConnectionSettings(_.withTransport(newTransport))`.
		
		Parameters:
		`newValue` \- (undocumented)
		Returns:
		(undocumented)
		- #### withUpdatedConnectionSettings
		
		
		
		```
		public abstract [ConnectionPoolSettings](ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") withUpdatedConnectionSettings​(scala.Function1<[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings"),​[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.scaladsl.settings")> f)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ConnectionPoolSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html)*