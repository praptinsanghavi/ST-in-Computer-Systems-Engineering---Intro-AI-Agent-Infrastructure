---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceProbe.html
title: PersistenceProbe
---

# PersistenceProbe

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface PersistenceProbe\<T\>

- ---

```
public interface PersistenceProbe<T>
```

Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<[T](PersistenceProbe.html "type parameter in PersistenceProbe")>>` | `[drain](#drain())()` | Collect all persistence effects from the probe and empty the probe |
	| `[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<[T](PersistenceProbe.html "type parameter in PersistenceProbe")>` | `[expectPersisted](#expectPersisted(T))​([T](PersistenceProbe.html "type parameter in PersistenceProbe") obj)` | Assert that the given object was persisted in the oldest persistence effect and  remove that persistence effect |
	| `[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<[T](PersistenceProbe.html "type parameter in PersistenceProbe")>` | `[expectPersisted](#expectPersisted(T,java.lang.String))​([T](PersistenceProbe.html "type parameter in PersistenceProbe") obj,  java.lang.String tag)` | Assert that the given object was persisted with the given tag in the oldest  persistence effect and remove that persistence effect. |
	| `[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<[T](PersistenceProbe.html "type parameter in PersistenceProbe")>` | `[expectPersisted](#expectPersisted(T,scala.collection.immutable.Set))​([T](PersistenceProbe.html "type parameter in PersistenceProbe") obj,  scala.collection.immutable.Set<java.lang.String> tags)` | Assert that the given object was persisted with the given tags in the oldest  persistence effect and remove that persistence effect. |
	| `<S extends [T](PersistenceProbe.html "type parameter in PersistenceProbe")>[PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<S>` | `[expectPersistedType](#expectPersistedType(scala.reflect.ClassTag))​(scala.reflect.ClassTag<S> evidence$1)` | Get and remove the oldest persistence effect from the probe, failing if the  persisted object is not of the requested type |
	| `[PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<[T](PersistenceProbe.html "type parameter in PersistenceProbe")>` | `[extract](#extract())()` | Get and remove the oldest persistence effect from the probe |
	| `boolean` | `[hasEffects](#hasEffects())()` | Are there any persistence effects? |

- - ### Method Detail
	
	
	
		- #### drain
		
		
		
		```
		scala.collection.immutable.Seq<[PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<[T](PersistenceProbe.html "type parameter in PersistenceProbe")>> drain()
		```
		
		Collect all persistence effects from the probe and empty the probe
		- #### expectPersisted
		
		
		
		```
		[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<[T](PersistenceProbe.html "type parameter in PersistenceProbe")> expectPersisted​([T](PersistenceProbe.html "type parameter in PersistenceProbe") obj)
		```
		
		Assert that the given object was persisted in the oldest persistence effect and
		 remove that persistence effect
		- #### expectPersisted
		
		
		
		```
		[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<[T](PersistenceProbe.html "type parameter in PersistenceProbe")> expectPersisted​([T](PersistenceProbe.html "type parameter in PersistenceProbe") obj,
		                                    java.lang.String tag)
		```
		
		Assert that the given object was persisted with the given tag in the oldest
		 persistence effect and remove that persistence effect. If the persistence
		 effect has multiple tags, only one of them has to match in order for the
		 assertion to succeed.
		- #### expectPersisted
		
		
		
		```
		[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<[T](PersistenceProbe.html "type parameter in PersistenceProbe")> expectPersisted​([T](PersistenceProbe.html "type parameter in PersistenceProbe") obj,
		                                    scala.collection.immutable.Set<java.lang.String> tags)
		```
		
		Assert that the given object was persisted with the given tags in the oldest
		 persistence effect and remove that persistence effect. If the persistence
		 effect has tags which are not given, the assertion fails.
		- #### expectPersistedType
		
		
		
		```
		<S extends [T](PersistenceProbe.html "type parameter in PersistenceProbe")> [PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<S> expectPersistedType​(scala.reflect.ClassTag<S> evidence$1)
		```
		
		Get and remove the oldest persistence effect from the probe, failing if the
		 persisted object is not of the requested type
		- #### extract
		
		
		
		```
		[PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<[T](PersistenceProbe.html "type parameter in PersistenceProbe")> extract()
		```
		
		Get and remove the oldest persistence effect from the probe
		- #### hasEffects
		
		
		
		```
		boolean hasEffects()
		```
		
		Are there any persistence effects?

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceProbe.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceProbe.html)*