---
description: 'declaration: package: akka.javasdk, interface: Principals'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:46Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principals.html
title: Principals
---

# Principals

> **Summary:** declaration: package: akka.javasdk, interface: Principals

## Content

Package [akka.javasdk](package-summary.html)
# Interface Principals

---

public interface Principals
The principals associated with a request.

- ## Method Summary

Modifier and Type
Method
Description
`[Collection](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html "class or interface in java.util")<[Principal](Principal.html "interface in akka.javasdk")>`
`[get](#get())()`

Get the principals associated with this request.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[getLocalService](#getLocalService())()`

Get the service that invoked this call, if any.

`boolean`
`[isAnyLocalService](#isAnyLocalService())()`

Whether this request was from any service in the local project.

`boolean`
`[isBackoffice](#isBackoffice())()`

Whether this request is a backoffice request.

`boolean`
`[isInternet](#isInternet())()`

Whether this request was from the internet.

`boolean`
`[isLocalService](#isLocalService(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Whether this request was from a service in the local project.

`boolean`
`[isSelf](#isSelf())()`

Whether this is a self request.

- ## Method Details

	- ### isInternet
	
	
	boolean isInternet()
	Whether this request was from the internet.
	- ### isSelf
	
	
	boolean isSelf()
	Whether this is a self request.
	- ### isBackoffice
	
	
	boolean isBackoffice()
	Whether this request is a backoffice request.
	- ### isLocalService
	
	
	boolean isLocalService([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Whether this request was from a service in the local project.
	
	Parameters:
	`name` \- The name of the service.
	- ### isAnyLocalService
	
	
	boolean isAnyLocalService()
	Whether this request was from any service in the local project.
	- ### getLocalService
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> getLocalService()
	Get the service that invoked this call, if any.
	- ### get
	
	
	[Collection](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html "class or interface in java.util")\<[Principal](Principal.html "interface in akka.javasdk")\> get()
	Get the principals associated with this request.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principal.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principals.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principals.html)*