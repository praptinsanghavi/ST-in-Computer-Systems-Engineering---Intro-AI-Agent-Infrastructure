---
description: 'declaration: package: akka.javasdk.testkit, interface: WebSocketRouteTester,
  record: WsConnection'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:30Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/WebSocketRouteTester.WsConnection.html
title: WebSocketRouteTester.WsConnection
---

# WebSocketRouteTester.WsConnection

> **Summary:** declaration: package: akka.javasdk.testkit, interface: WebSocketRouteTester, record: WsConnection

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Record Class WebSocketRouteTester.WsConnection\<T\>

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.testkit.WebSocketRouteTester.WsConnection\<T\>

Enclosing interface:
`[WebSocketRouteTester](WebSocketRouteTester.html "interface in akka.javasdk.testkit")`

---

public static record WebSocketRouteTester.WsConnection\<T\>(akka.stream.testkit.TestPublisher.Probe\<[T](WebSocketRouteTester.WsConnection.html "type parameter in WebSocketRouteTester.WsConnection")\> publisher, akka.stream.testkit.TestSubscriber.Probe\<[T](WebSocketRouteTester.WsConnection.html "type parameter in WebSocketRouteTester.WsConnection")\> subscriber)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")

- ## Constructor Summary

Constructors

Constructor
Description
`[WsConnection](#%3Cinit%3E(akka.stream.testkit.TestPublisher.Probe,akka.stream.testkit.TestSubscriber.Probe))(akka.stream.testkit.TestPublisher.Probe<[T](WebSocketRouteTester.WsConnection.html "type parameter in WebSocketRouteTester.WsConnection")> publisher,
 akka.stream.testkit.TestSubscriber.Probe<[T](WebSocketRouteTester.WsConnection.html "type parameter in WebSocketRouteTester.WsConnection")> subscriber)`

Creates an instance of a `WsConnection` record class.
- ## Method Summary

Modifier and Type
Method
Description
`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`akka.stream.testkit.TestPublisher.Probe<[T](WebSocketRouteTester.WsConnection.html "type parameter in WebSocketRouteTester.WsConnection")>`
`[publisher](#publisher())()`

Returns the value of the `publisher` record component.

`akka.stream.testkit.TestSubscriber.Probe<[T](WebSocketRouteTester.WsConnection.html "type parameter in WebSocketRouteTester.WsConnection")>`
`[subscriber](#subscriber())()`

Returns the value of the `subscriber` record component.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### WsConnection
	
	
	public WsConnection(akka.stream.testkit.TestPublisher.Probe\<[T](WebSocketRouteTester.WsConnection.html "type parameter in WebSocketRouteTester.WsConnection")\> publisher,
	 akka.stream.testkit.TestSubscriber.Probe\<[T](WebSocketRouteTester.WsConnection.html "type parameter in WebSocketRouteTester.WsConnection")\> subscriber)
	Creates an instance of a `WsConnection` record class.
	
	Parameters:
	`publisher` \- the value for the `publisher` record component
	`subscriber` \- the value for the `subscriber` record component
- ## Method Details

	- ### toString
	
	
	public final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") toString()
	Returns a string representation of this record class. The representation contains the name of the class, followed by the name and value of each of the record components.
	
	Specified by:
	`[toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#toString() "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Returns:
	a string representation of this object
	- ### hashCode
	
	
	public final int hashCode()
	Returns a hash code value for this object. The value is derived from the hash code of each of the record components.
	
	Specified by:
	`[hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#hashCode() "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Returns:
	a hash code value for this object
	- ### equals
	
	
	public final boolean equals([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)
	Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object) "class or interface in java.util").
	
	Specified by:
	`[equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#equals(java.lang.Object) "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Parameters:
	`o` \- the object with which to compare
	Returns:
	`true` if this object is the same as the `o` argument; `false` otherwise.
	- ### publisher
	
	
	public akka.stream.testkit.TestPublisher.Probe\<[T](WebSocketRouteTester.WsConnection.html "type parameter in WebSocketRouteTester.WsConnection")\> publisher()
	Returns the value of the `publisher` record component.
	
	Returns:
	the value of the `publisher` record component
	- ### subscriber
	
	
	public akka.stream.testkit.TestSubscriber.Probe\<[T](WebSocketRouteTester.WsConnection.html "type parameter in WebSocketRouteTester.WsConnection")\> subscriber()
	Returns the value of the `subscriber` record component.
	
	Returns:
	the value of the `subscriber` record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/WebSocketRouteTester.WsConnection.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/WebSocketRouteTester.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/WebSocketRouteTester.WsConnection.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/WebSocketRouteTester.WsConnection.html)*