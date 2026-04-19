---
description: 'declaration: package: akka.javasdk.testkit, interface: EventSourcedResult'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:34Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedResult.html
title: EventSourcedResult
---

# EventSourcedResult

> **Summary:** declaration: package: akka.javasdk.testkit, interface: EventSourcedResult

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Interface EventSourcedResult\<R\>

Type Parameters:
`R` \- The type of reply that is expected from invoking a command handler

---

public interface EventSourcedResult\<R\>
Represents the result of an EventSourcedEntity handling a command when run in through the
 testkit.

 Not for user extension, returned by the testkit.

- ## Method Summary

Modifier and Type
Method
Description
`boolean`
`[didEmitEvents](#didEmitEvents())()`

Deprecated, for removal: This API element is subject to removal in a future version.
Use [`didPersistEvents()`](#didPersistEvents()) instead.

`boolean`
`[didPersistEvents](#didPersistEvents())()`
 
`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")>`
`[getAllEvents](#getAllEvents())()`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[getError](#getError())()`

The error description.

`io.grpc.Status.Code`
`[getErrorStatusCode](#getErrorStatusCode())()`
 
`<E> E`
`[getNextEventOfType](#getNextEventOfType(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<E> expectedClass)`

Look at the next event and verify that it is of type E or fail if not or if there is no next
 event.

`[R](EventSourcedResult.html "type parameter in EventSourcedResult")`
`[getReply](#getReply())()`

The reply object from the handler if there was one.

`[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")`
`[getUpdatedState](#getUpdatedState())()`
 
`boolean`
`[isError](#isError())()`
 
`boolean`
`[isReply](#isReply())()`

- ## Method Details

	- ### isReply
	
	
	boolean isReply()
	
	Returns:
	true if the call had an effect with a reply, false if not
	- ### getReply
	
	
	[R](EventSourcedResult.html "type parameter in EventSourcedResult") getReply()
	The reply object from the handler if there was one. If the call had an effect without any reply
	 an exception is thrown
	- ### isError
	
	
	boolean isError()
	
	Returns:
	true if the call was an error, false if not
	- ### getError
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") getError()
	The error description. If the result was not an error an exception is thrown
	- ### getErrorStatusCode
	
	
	io.grpc.Status.Code getErrorStatusCode()
	
	Returns:
	The error status code or throws if the effect returned by the action was not an error.
	- ### getUpdatedState
	
	
	[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") getUpdatedState()
	
	Returns:
	The updated state. If the state was not updated (no events emitted) an exception is
	 thrown
	- ### didEmitEvents
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")([since](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#since() "class or interface in java.lang")\="3\.0\.2",
	 [forRemoval](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html#forRemoval() "class or interface in java.lang")\=true)
	boolean didEmitEvents()
	Deprecated, for removal: This API element is subject to removal in a future version.
	Use [`didPersistEvents()`](#didPersistEvents()) instead.
	
	
	Returns:
	Whether the command handler persist events or not.
	- ### didPersistEvents
	
	
	boolean didPersistEvents()
	
	Returns:
	Whether the command handler persist events or not.
	- ### getAllEvents
	
	
	[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")\> getAllEvents()
	
	Returns:
	All the events that were emitted by handling this command.
	- ### getNextEventOfType
	
	
	\<E\> E getNextEventOfType([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<E\> expectedClass)
	Look at the next event and verify that it is of type E or fail if not or if there is no next
	 event. If successful this consumes the event, so that the next call to this method looks at the
	 next event from here.
	
	Returns:
	The next event if it is of type E, for additional assertions.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedResult.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedResult.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventSourcedResult.html)*