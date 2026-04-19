---
description: 'declaration: package: akka.javasdk, interface: DependencyProvider'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:45Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DependencyProvider.html
title: DependencyProvider
---

# DependencyProvider

> **Summary:** declaration: package: akka.javasdk, interface: DependencyProvider

## Content

Package [akka.javasdk](package-summary.html)
# Interface DependencyProvider

---

public interface DependencyProvider
A factory method to provide additional dependencies to the component implementations.

 Implementations of this interface must be thread\-safe.

 

The `DependencyProvider` must be configured using the [`ServiceSetup.createDependencyProvider()`](ServiceSetup.html#createDependencyProvider()) method. This ensures that the correct dependencies are
 available to the component implementations at runtime.

- ## Method Summary

Modifier and Type
Method
Description
`<T> T`
`[getDependency](#getDependency(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> clazz)`

Get a dependency for a given class.

`static [DependencyProvider](DependencyProvider.html "interface in akka.javasdk")`
`[single](#single(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") single)`

Create a dependency provider that always returns the same instance for a given class.

- ## Method Details

	- ### getDependency
	
	
	\<T\> T getDependency([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> clazz)
	Get a dependency for a given class. If the dependency is not found, an exception should be
	 thrown.
	
	 Returned instance for a given class must be safe to use concurrently.
	
	
	
	Type Parameters:
	`T` \- The type of the dependency
	Parameters:
	`clazz` \- The class of the dependency to get
	Returns:
	The dependency instance
	- ### single
	
	
	static [DependencyProvider](DependencyProvider.html "interface in akka.javasdk") single([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") single)
	Create a dependency provider that always returns the same instance for a given class.
	
	Parameters:
	`single` \- The single instance to return
	Returns:
	The dependency provider

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DependencyProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/ServiceSetup.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DependencyProvider.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DependencyProvider.html)*