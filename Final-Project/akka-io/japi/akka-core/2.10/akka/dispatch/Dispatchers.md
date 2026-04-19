---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:46:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Dispatchers.html
title: Dispatchers
---

# Dispatchers

## Content

Package [akka.dispatch](package-summary.html)
## Class Dispatchers

- java.lang.Object
- - akka.dispatch.Dispatchers

- ---

```
public class Dispatchers
extends java.lang.Object
```

Dispatchers are to be defined in configuration to allow for tuning
 for different environments. Use the `lookup` method to create
 a dispatcher as specified in configuration.
 
 A dispatcher config can also be an alias, in that case it is a config string value pointing
 to the actual dispatcher config.
 

 Look in `akka.actor.default-dispatcher` section of the reference.conf
 for documentation of dispatcher options.
 

 Not for user instantiation or extension

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.dispatch.CachingConfig` | `[cachingConfig](#cachingConfig())()` |  |
	| `static java.lang.String` | `[DefaultBlockingDispatcherId](#DefaultBlockingDispatcherId())()` | The id of a default dispatcher to use for operations known to be blocking. |
	| `com.typesafe.config.Config` | `[defaultDispatcherConfig](#defaultDispatcherConfig())()` |  |
	| `static java.lang.String` | `[DefaultDispatcherId](#DefaultDispatcherId())()` | The id of the default dispatcher, also the full key of the  configuration of the default dispatcher. |
	| `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")` | `[defaultGlobalDispatcher](#defaultGlobalDispatcher())()` | The one and only default dispatcher. |
	| `boolean` | `[hasDispatcher](#hasDispatcher(java.lang.String))​(java.lang.String id)` | Checks that the configuration provides a section for the given dispatcher. |
	| `[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch")` | `[lookup](#lookup(java.lang.String))​(java.lang.String id)` | Returns a dispatcher as specified in configuration. |
	| `[DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch")` | `[prerequisites](#prerequisites())()` |  |
	| `boolean` | `[registerConfigurator](#registerConfigurator(java.lang.String,akka.dispatch.MessageDispatcherConfigurator))​(java.lang.String id,  [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch") configurator)` | Register a [`MessageDispatcherConfigurator`](MessageDispatcherConfigurator.html "class in akka.dispatch") that will be  used by [`lookup(java.lang.String)`](#lookup(java.lang.String)) and [`hasDispatcher(java.lang.String)`](#hasDispatcher(java.lang.String)) instead of looking  up the configurator from the system configuration. |
	| `[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor")` | `[settings](#settings())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### DefaultDispatcherId
		
		
		
		```
		public static final java.lang.String DefaultDispatcherId()
		```
		
		The id of the default dispatcher, also the full key of the
		 configuration of the default dispatcher.
		- #### DefaultBlockingDispatcherId
		
		
		
		```
		public static final java.lang.String DefaultBlockingDispatcherId()
		```
		
		The id of a default dispatcher to use for operations known to be blocking. Note that
		 for optimal performance you will want to isolate different blocking resources
		 on different thread pools.
		- #### settings
		
		
		
		```
		public [ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings()
		```
		- #### prerequisites
		
		
		
		```
		public [DispatcherPrerequisites](DispatcherPrerequisites.html "interface in akka.dispatch") prerequisites()
		```
		- #### cachingConfig
		
		
		
		```
		public akka.dispatch.CachingConfig cachingConfig()
		```
		- #### defaultDispatcherConfig
		
		
		
		```
		public com.typesafe.config.Config defaultDispatcherConfig()
		```
		- #### defaultGlobalDispatcher
		
		
		
		```
		public [MessageDispatcher](MessageDispatcher.html "class in akka.dispatch") defaultGlobalDispatcher()
		```
		
		The one and only default dispatcher.
		- #### lookup
		
		
		
		```
		public [MessageDispatcher](MessageDispatcher.html "class in akka.dispatch") lookup​(java.lang.String id)
		```
		
		Returns a dispatcher as specified in configuration. Please note that this
		 method \_may\_ create and return a NEW dispatcher, \_every\_ call (depending on the `MessageDispatcherConfigurator` /
		 dispatcher config the id points to).
		 
		 A dispatcher id can also be an alias. In the case it is a string value in the config it is treated as the id
		 of the actual dispatcher config to use. If several ids leading to the same actual dispatcher config is used only one
		 instance is created. This means that for dispatchers you expect to be shared they will be.
		 
		
		
		 Throws ConfigurationException if the specified dispatcher cannot be found in the configuration.
		- #### hasDispatcher
		
		
		
		```
		public boolean hasDispatcher​(java.lang.String id)
		```
		
		Checks that the configuration provides a section for the given dispatcher.
		 This does not guarantee that no ConfigurationException will be thrown when
		 using this dispatcher, because the details can only be checked by trying
		 to instantiate it, which might be undesirable when just checking.
		- #### registerConfigurator
		
		
		
		```
		public boolean registerConfigurator​(java.lang.String id,
		                                    [MessageDispatcherConfigurator](MessageDispatcherConfigurator.html "class in akka.dispatch") configurator)
		```
		
		Register a [`MessageDispatcherConfigurator`](MessageDispatcherConfigurator.html "class in akka.dispatch") that will be
		 used by [`lookup(java.lang.String)`](#lookup(java.lang.String)) and [`hasDispatcher(java.lang.String)`](#hasDispatcher(java.lang.String)) instead of looking
		 up the configurator from the system configuration.
		 This enables dynamic addition of dispatchers, as used by the
		 [`BalancingPool`](../routing/BalancingPool.html "class in akka.routing").
		 
		 A configurator for a certain id can only be registered once, i.e.
		 it can not be replaced. It is safe to call this method multiple times,
		 but only the first registration will be used. This method returns `true` if
		 the specified configurator was successfully registered.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DispatcherPrerequisites.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcherConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/BalancingPool.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Dispatchers.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Dispatchers.html)*