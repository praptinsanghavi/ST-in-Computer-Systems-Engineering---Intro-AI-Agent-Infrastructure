---
description: 'declaration: package: akka.javasdk.testkit, class: EventSourcedTestKit,
  class: MethodRef'
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:21Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedTestKit.MethodRef.html
title: EventSourcedTestKit.MethodRef
---

# EventSourcedTestKit.MethodRef

> **Summary:** declaration: package: akka.javasdk.testkit, class: EventSourcedTestKit, class: MethodRef

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Class EventSourcedTestKit.MethodRef\<R\>

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.testkit.EventSourcedTestKit.MethodRef\<R\>

Enclosing class:
`[EventSourcedTestKit](EventSourcedTestKit.html "class in akka.javasdk.testkit")<[S](EventSourcedTestKit.html "type parameter in EventSourcedTestKit"),[E](EventSourcedTestKit.html "type parameter in EventSourcedTestKit"),[ES](EventSourcedTestKit.html "type parameter in EventSourcedTestKit") extends akka.javasdk.eventsourcedentity.EventSourcedEntity<[S](EventSourcedTestKit.html "type parameter in EventSourcedTestKit"),[E](EventSourcedTestKit.html "type parameter in EventSourcedTestKit")>>`

---

public final class EventSourcedTestKit.MethodRef\<R\>
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

- ## Constructor Summary

Constructors

Constructor
Description
`[MethodRef](#%3Cinit%3E(akka.japi.function.Function,akka.javasdk.Metadata))(akka.japi.function.Function<[ES](EventSourcedTestKit.html "type parameter in EventSourcedTestKit"),akka.javasdk.eventsourcedentity.EventSourcedEntity.Effect<[R](EventSourcedTestKit.MethodRef.html "type parameter in EventSourcedTestKit.MethodRef")>> func,
 akka.javasdk.Metadata metadata)`
- ## Method Summary

Modifier and Type
Method
Description
`[EventSourcedResult](EventSourcedResult.html "interface in akka.javasdk.testkit")<[R](EventSourcedTestKit.MethodRef.html "type parameter in EventSourcedTestKit.MethodRef")>`
`[invoke](#invoke())()`
 
`[EventSourcedTestKit](EventSourcedTestKit.html "class in akka.javasdk.testkit")<[S](EventSourcedTestKit.html "type parameter in EventSourcedTestKit"),[E](EventSourcedTestKit.html "type parameter in EventSourcedTestKit"),[ES](EventSourcedTestKit.html "type parameter in EventSourcedTestKit")>.[MethodRef](EventSourcedTestKit.MethodRef.html "class in akka.javasdk.testkit")<[R](EventSourcedTestKit.MethodRef.html "type parameter in EventSourcedTestKit.MethodRef")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))(akka.javasdk.Metadata metadata)`
 

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### MethodRef
	
	
	public MethodRef(akka.japi.function.Function\<[ES](EventSourcedTestKit.html "type parameter in EventSourcedTestKit"),akka.javasdk.eventsourcedentity.EventSourcedEntity.Effect\<[R](EventSourcedTestKit.MethodRef.html "type parameter in EventSourcedTestKit.MethodRef")\>\> func,
	 akka.javasdk.Metadata metadata)
- ## Method Details

	- ### withMetadata
	
	
	public [EventSourcedTestKit](EventSourcedTestKit.html "class in akka.javasdk.testkit")\<[S](EventSourcedTestKit.html "type parameter in EventSourcedTestKit"),[E](EventSourcedTestKit.html "type parameter in EventSourcedTestKit"),[ES](EventSourcedTestKit.html "type parameter in EventSourcedTestKit")\>.[MethodRef](EventSourcedTestKit.MethodRef.html "class in akka.javasdk.testkit")\<[R](EventSourcedTestKit.MethodRef.html "type parameter in EventSourcedTestKit.MethodRef")\> withMetadata(akka.javasdk.Metadata metadata)
	- ### invoke
	
	
	public [EventSourcedResult](EventSourcedResult.html "interface in akka.javasdk.testkit")\<[R](EventSourcedTestKit.MethodRef.html "type parameter in EventSourcedTestKit.MethodRef")\> invoke()

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedResult.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedTestKit.MethodRef.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedTestKit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedTestKit.MethodRef.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedTestKit.MethodRef.html)*