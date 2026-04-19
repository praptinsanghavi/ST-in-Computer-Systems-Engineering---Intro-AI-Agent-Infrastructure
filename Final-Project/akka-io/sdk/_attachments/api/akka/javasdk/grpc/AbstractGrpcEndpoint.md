---
description: 'declaration: package: akka.javasdk.grpc, class: AbstractGrpcEndpoint'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:41Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/AbstractGrpcEndpoint.html
title: AbstractGrpcEndpoint
---

# AbstractGrpcEndpoint

> **Summary:** declaration: package: akka.javasdk.grpc, class: AbstractGrpcEndpoint

## Content

Package [akka.javasdk.grpc](package-summary.html)
# Class AbstractGrpcEndpoint

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.grpc.AbstractGrpcEndpoint

---

public abstract class AbstractGrpcEndpoint
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
Optional base class for gRPC endpoints giving access to a request context without additional
 constructor parameters

- ## Constructor Summary

Constructors

Constructor
Description
`[AbstractGrpcEndpoint](#%3Cinit%3E())()`
- ## Method Summary

Modifier and Type
Method
Description
`protected final [GrpcRequestContext](GrpcRequestContext.html "interface in akka.javasdk.grpc")`
`[requestContext](#requestContext())()`

Always available from request handling methods, not available from the constructor.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### AbstractGrpcEndpoint
	
	
	public AbstractGrpcEndpoint()
- ## Method Details

	- ### requestContext
	
	
	protected final [GrpcRequestContext](GrpcRequestContext.html "interface in akka.javasdk.grpc") requestContext()
	Always available from request handling methods, not available from the constructor.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/GrpcRequestContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/AbstractGrpcEndpoint.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/AbstractGrpcEndpoint.html)*