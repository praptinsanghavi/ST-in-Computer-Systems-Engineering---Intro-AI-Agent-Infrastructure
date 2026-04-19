---
description: 'declaration: package: akka.javasdk.client, interface: KeyValueEntityClient'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:27Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/KeyValueEntityClient.html
title: KeyValueEntityClient
---

# KeyValueEntityClient

> **Summary:** declaration: package: akka.javasdk.client, interface: KeyValueEntityClient

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface KeyValueEntityClient

---

@DoNotInherit
public interface KeyValueEntityClient
Not for user extension

- ## Method Summary

Modifier and Type
Method
Description
`<T,
R> [ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")<R>`
`[method](#method(akka.japi.function.Function))(akka.japi.function.Function<T,[KeyValueEntity.Effect](../keyvalueentity/KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")<R>> methodRef)`

Pass in a Key Value Entity command handler method reference, e.g.

`<T,
A1,
R> [ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")<A1,R>`
`[method](#method(akka.japi.function.Function2))(akka.japi.function.Function2<T,A1,[KeyValueEntity.Effect](../keyvalueentity/KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")<R>> methodRef)`

Pass in a Key Value Entity command handler method reference, e.g.

- ## Method Details

	- ### method
	
	
	\<T,
	R\> [ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")\<R\> method(akka.japi.function.Function\<T,[KeyValueEntity.Effect](../keyvalueentity/KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")\<R\>\> methodRef)
	Pass in a Key Value Entity command handler method reference, e.g. `UserEntity::create`
	- ### method
	
	
	\<T,
	A1,
	R\> [ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")\<A1,R\> method(akka.japi.function.Function2\<T,A1,[KeyValueEntity.Effect](../keyvalueentity/KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")\<R\>\> methodRef)
	Pass in a Key Value Entity command handler method reference, e.g. `UserEntity::update`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/KeyValueEntityClient.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/KeyValueEntityClient.html)*