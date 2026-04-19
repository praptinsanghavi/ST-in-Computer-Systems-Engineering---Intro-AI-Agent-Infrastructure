---
description: 'declaration: package: akka.javasdk.client, interface: ViewClient'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:28Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewClient.html
title: ViewClient
---

# ViewClient

> **Summary:** declaration: package: akka.javasdk.client, interface: ViewClient

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ViewClient

---

@DoNotInherit
public interface ViewClient
Not for user extension

- ## Method Summary

Modifier and Type
Method
Description
`<T,
R> [ComponentInvokeOnlyMethodRef](ComponentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")<R>`
`[method](#method(akka.japi.function.Function))(akka.japi.function.Function<T,[View.QueryEffect](../view/View.QueryEffect.html "interface in akka.javasdk.view")<R>> methodRef)`

Pass in a View query method reference, e.g.

`<T,
A1,
R> [ComponentInvokeOnlyMethodRef1](ComponentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")<A1,R>`
`[method](#method(akka.japi.function.Function2))(akka.japi.function.Function2<T,A1,[View.QueryEffect](../view/View.QueryEffect.html "interface in akka.javasdk.view")<R>> methodRef)`

Pass in a View query method reference, e.g.

`<T,
R> [ViewStreamMethodRef](ViewStreamMethodRef.html "interface in akka.javasdk.client")<R>`
`[stream](#stream(akka.japi.function.Function))(akka.japi.function.Function<T,[View.QueryStreamEffect](../view/View.QueryStreamEffect.html "interface in akka.javasdk.view")<R>> methodRef)`

Pass in a View query method reference, e.g.

`<T,
A1,
R> [ViewStreamMethodRef1](ViewStreamMethodRef1.html "interface in akka.javasdk.client")<A1,R>`
`[stream](#stream(akka.japi.function.Function2))(akka.japi.function.Function2<T,A1,[View.QueryStreamEffect](../view/View.QueryStreamEffect.html "interface in akka.javasdk.view")<R>> methodRef)`

Pass in a View query method reference, e.g.

- ## Method Details

	- ### method
	
	
	\<T,
	R\> [ComponentInvokeOnlyMethodRef](ComponentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")\<R\> method(akka.japi.function.Function\<T,[View.QueryEffect](../view/View.QueryEffect.html "interface in akka.javasdk.view")\<R\>\> methodRef)
	Pass in a View query method reference, e.g. `UserByCity::find` If no result is found, the
	 result of the request will be a [`NoEntryFoundException`](NoEntryFoundException.html "class in akka.javasdk.client")
	- ### method
	
	
	\<T,
	A1,
	R\> [ComponentInvokeOnlyMethodRef1](ComponentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")\<A1,R\> method(akka.japi.function.Function2\<T,A1,[View.QueryEffect](../view/View.QueryEffect.html "interface in akka.javasdk.view")\<R\>\> methodRef)
	Pass in a View query method reference, e.g. `UserByCity::find`
	If no result is found, the result of the request will be a [`NoEntryFoundException`](NoEntryFoundException.html "class in akka.javasdk.client")
	- ### stream
	
	
	\<T,
	R\> [ViewStreamMethodRef](ViewStreamMethodRef.html "interface in akka.javasdk.client")\<R\> stream(akka.japi.function.Function\<T,[View.QueryStreamEffect](../view/View.QueryStreamEffect.html "interface in akka.javasdk.view")\<R\>\> methodRef)
	Pass in a View query method reference, e.g. `UserByCity::findAllInCity`
	- ### stream
	
	
	\<T,
	A1,
	R\> [ViewStreamMethodRef1](ViewStreamMethodRef1.html "interface in akka.javasdk.client")\<A1,R\> stream(akka.japi.function.Function2\<T,A1,[View.QueryStreamEffect](../view/View.QueryStreamEffect.html "interface in akka.javasdk.view")\<R\>\> methodRef)
	Pass in a View query method reference, e.g. `UserByCity::findAllInCity`
	
	Type Parameters:
	`A1` \- the type of parameter expected by the call

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/NoEntryFoundException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.QueryEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.QueryStreamEffect.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewClient.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewClient.html)*