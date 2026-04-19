---
description: 'declaration: package: akka.javasdk.grpc, interface: GrpcRequestContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:42Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/GrpcRequestContext.html
title: GrpcRequestContext
---

# GrpcRequestContext

> **Summary:** declaration: package: akka.javasdk.grpc, interface: GrpcRequestContext

## Content

Package [akka.javasdk.grpc](package-summary.html)
# Interface GrpcRequestContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`

---

@DoNotInherit
public interface GrpcRequestContext
extends [Context](../Context.html "interface in akka.javasdk")
Not for user extension, can be injected as constructor parameter into gRPC endpoint components

- ## Method Summary

Modifier and Type
Method
Description
`[JwtClaims](../JwtClaims.html "interface in akka.javasdk")`
`[getJwtClaims](#getJwtClaims())()`
 
`[Principals](../Principals.html "interface in akka.javasdk")`
`[getPrincipals](#getPrincipals())()`

Get the principals associated with this request.

`akka.grpc.javadsl.Metadata`
`[metadata](#metadata())()`
 
`[Tracing](../Tracing.html "interface in akka.javasdk")`
`[tracing](#tracing())()`

Access to tracing for custom app specific tracing.

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

- ## Method Details

	- ### getPrincipals
	
	
	[Principals](../Principals.html "interface in akka.javasdk") getPrincipals()
	Get the principals associated with this request.
	
	Returns:
	The principals associated with this request.
	- ### getJwtClaims
	
	
	[JwtClaims](../JwtClaims.html "interface in akka.javasdk") getJwtClaims()
	
	Returns:
	The JWT claims, if any, associated with this request.
	- ### metadata
	
	
	akka.grpc.javadsl.Metadata metadata()
	
	Returns:
	The metadata associated with the request being processed
	- ### tracing
	
	
	[Tracing](../Tracing.html "interface in akka.javasdk") tracing()
	Access to tracing for custom app specific tracing.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JwtClaims.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principals.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/GrpcRequestContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/GrpcRequestContext.html)*