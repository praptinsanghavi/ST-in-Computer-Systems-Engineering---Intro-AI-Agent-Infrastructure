---
description: 'declaration: package: akka.javasdk.testkit, class: KeyValueEntityTestKit,
  class: MethodRef'
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:26Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityTestKit.MethodRef.html
title: KeyValueEntityTestKit.MethodRef
---

# KeyValueEntityTestKit.MethodRef

> **Summary:** declaration: package: akka.javasdk.testkit, class: KeyValueEntityTestKit, class: MethodRef

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Class KeyValueEntityTestKit.MethodRef\<R\>

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.testkit.KeyValueEntityTestKit.MethodRef\<R\>

Enclosing class:
`[KeyValueEntityTestKit](KeyValueEntityTestKit.html "class in akka.javasdk.testkit")<[S](KeyValueEntityTestKit.html "type parameter in KeyValueEntityTestKit"),[E](KeyValueEntityTestKit.html "type parameter in KeyValueEntityTestKit") extends akka.javasdk.keyvalueentity.KeyValueEntity<[S](KeyValueEntityTestKit.html "type parameter in KeyValueEntityTestKit")>>`

---

public final class KeyValueEntityTestKit.MethodRef\<R\>
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

- ## Constructor Summary

Constructors

Constructor
Description
`[MethodRef](#%3Cinit%3E(akka.japi.function.Function,akka.javasdk.Metadata))(akka.japi.function.Function<[E](KeyValueEntityTestKit.html "type parameter in KeyValueEntityTestKit"),akka.javasdk.keyvalueentity.KeyValueEntity.Effect<[R](KeyValueEntityTestKit.MethodRef.html "type parameter in KeyValueEntityTestKit.MethodRef")>> func,
 akka.javasdk.Metadata metadata)`
- ## Method Summary

Modifier and Type
Method
Description
`[KeyValueEntityResult](KeyValueEntityResult.html "interface in akka.javasdk.testkit")<[R](KeyValueEntityTestKit.MethodRef.html "type parameter in KeyValueEntityTestKit.MethodRef")>`
`[invoke](#invoke())()`
 
`[KeyValueEntityTestKit](KeyValueEntityTestKit.html "class in akka.javasdk.testkit")<[S](KeyValueEntityTestKit.html "type parameter in KeyValueEntityTestKit"),[E](KeyValueEntityTestKit.html "type parameter in KeyValueEntityTestKit")>.[MethodRef](KeyValueEntityTestKit.MethodRef.html "class in akka.javasdk.testkit")<[R](KeyValueEntityTestKit.MethodRef.html "type parameter in KeyValueEntityTestKit.MethodRef")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))(akka.javasdk.Metadata metadata)`
 

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### MethodRef
	
	
	public MethodRef(akka.japi.function.Function\<[E](KeyValueEntityTestKit.html "type parameter in KeyValueEntityTestKit"),akka.javasdk.keyvalueentity.KeyValueEntity.Effect\<[R](KeyValueEntityTestKit.MethodRef.html "type parameter in KeyValueEntityTestKit.MethodRef")\>\> func,
	 akka.javasdk.Metadata metadata)
- ## Method Details

	- ### withMetadata
	
	
	public [KeyValueEntityTestKit](KeyValueEntityTestKit.html "class in akka.javasdk.testkit")\<[S](KeyValueEntityTestKit.html "type parameter in KeyValueEntityTestKit"),[E](KeyValueEntityTestKit.html "type parameter in KeyValueEntityTestKit")\>.[MethodRef](KeyValueEntityTestKit.MethodRef.html "class in akka.javasdk.testkit")\<[R](KeyValueEntityTestKit.MethodRef.html "type parameter in KeyValueEntityTestKit.MethodRef")\> withMetadata(akka.javasdk.Metadata metadata)
	- ### invoke
	
	
	public [KeyValueEntityResult](KeyValueEntityResult.html "interface in akka.javasdk.testkit")\<[R](KeyValueEntityTestKit.MethodRef.html "type parameter in KeyValueEntityTestKit.MethodRef")\> invoke()

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityResult.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityTestKit.MethodRef.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityTestKit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityTestKit.MethodRef.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityTestKit.MethodRef.html)*