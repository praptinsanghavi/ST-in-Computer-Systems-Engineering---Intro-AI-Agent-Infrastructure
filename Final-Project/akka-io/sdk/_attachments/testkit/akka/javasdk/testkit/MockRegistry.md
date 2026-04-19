---
description: 'declaration: package: akka.javasdk.testkit, interface: MockRegistry'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:18Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/MockRegistry.html
title: MockRegistry
---

# MockRegistry

> **Summary:** declaration: package: akka.javasdk.testkit, interface: MockRegistry

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Interface MockRegistry

---

public interface MockRegistry
This trait is meant to allow for unit testing when a service has cross\-component or cross\-service
 calls. The set of mocks or stubs will be matched by its class type upon a call of an external
 component or service.

- ## Field Summary

Fields

Modifier and Type
Field
Description
`static final [MockRegistry](MockRegistry.html "interface in akka.javasdk.testkit")`
`[EMPTY](#EMPTY)`
- ## Method Summary

Modifier and Type
Method
Description
`static [MockRegistry](MockRegistry.html "interface in akka.javasdk.testkit")`
`[create](#create())()`

Returns an empty instance of MockRegistry that can be chained with \`withMock\`

`<T> [MockRegistry](MockRegistry.html "interface in akka.javasdk.testkit")`
`[withMock](#withMock(java.lang.Class,T))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> clazz,
 T instance)`

Returns a new MockRegistry with the new mock added to previous ones.

- ## Field Details

	- ### EMPTY
	
	
	static final [MockRegistry](MockRegistry.html "interface in akka.javasdk.testkit") EMPTY
- ## Method Details

	- ### withMock
	
	
	\<T\> [MockRegistry](MockRegistry.html "interface in akka.javasdk.testkit") withMock([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> clazz,
	 T instance)
	Returns a new MockRegistry with the new mock added to previous ones.
	
	Type Parameters:
	`T` \- The service interface to be mocked.
	Parameters:
	`clazz` \- The class type used to identify the mock.
	`instance` \- The instance object to be used as a mock\-
	Returns:
	A copy of this MockRegistry.
	- ### create
	
	
	static [MockRegistry](MockRegistry.html "interface in akka.javasdk.testkit") create()
	Returns an empty instance of MockRegistry that can be chained with \`withMock\`
	
	Returns:
	a new instance of MockRegistry

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/MockRegistry.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/MockRegistry.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/MockRegistry.html)*