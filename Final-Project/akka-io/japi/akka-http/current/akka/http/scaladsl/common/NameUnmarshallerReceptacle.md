---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html
title: NameUnmarshallerReceptacle
---

# NameUnmarshallerReceptacle

## Content

Package [akka.http.scaladsl.common](package-summary.html)
## Class NameUnmarshallerReceptacle\<T\>

- java.lang.Object
- - akka.http.scaladsl.common.NameUnmarshallerReceptacle\<T\>

- ---

```
public class NameUnmarshallerReceptacle<T>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NameUnmarshallerReceptacle](#%3Cinit%3E(java.lang.String,akka.http.scaladsl.unmarshalling.Unmarshaller))​(java.lang.String name,  [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")> um)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<B> [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<B>` | `[as](#as(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle"),​B> unmarshaller)` | Extract the value as the specified type. |
	| `java.lang.String` | `[name](#name())()` |  |
	| `[NameOptionUnmarshallerReceptacle](NameOptionUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")>` | `[optional](#optional())()` | Extract the optional value as `Option[T]`. |
	| `[RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")>` | `[repeated](#repeated())()` | Extract multiple occurrences as `Iterable[String]`. |
	| `[RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")>` | `[requiredValue](#requiredValue(T))​([T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle") requiredValue)` | Require the given value and extract nothing. |
	| `[Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")>` | `[um](#um())()` |  |
	| `[NameDefaultUnmarshallerReceptacle](NameDefaultUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")>` | `[withDefault](#withDefault(T))​([T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle") default_)` | Extract the optional value as `T`, if it is missing use the given default value. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NameUnmarshallerReceptacle
		
		
		
		```
		public NameUnmarshallerReceptacle​(java.lang.String name,
		                                  [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")> um)
		```

	- ### Method Detail
	
	
	
		- #### as
		
		
		
		```
		public <B> [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<B> as​([Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle"),​B> unmarshaller)
		```
		
		Extract the value as the specified type.
		 You need a matching [`Unmarshaller`](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling") in scope for that to work.
		
		Parameters:
		`unmarshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### optional
		
		
		
		```
		public [NameOptionUnmarshallerReceptacle](NameOptionUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")> optional()
		```
		
		Extract the optional value as `Option[T]`.
		 Symbolic alias for [`optional()`](#optional()).
		
		Returns:
		(undocumented)
		- #### repeated
		
		
		
		```
		public [RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")> repeated()
		```
		
		Extract multiple occurrences as `Iterable[String]`.
		
		Returns:
		(undocumented)
		- #### requiredValue
		
		
		
		```
		public [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")> requiredValue​([T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle") requiredValue)
		```
		
		Require the given value and extract nothing.
		 Reject if it is missing or has a different value.
		
		Parameters:
		`requiredValue` \- (undocumented)
		Returns:
		(undocumented)
		- #### um
		
		
		
		```
		public [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")> um()
		```
		- #### withDefault
		
		
		
		```
		public [NameDefaultUnmarshallerReceptacle](NameDefaultUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<[T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle")> withDefault​([T](NameUnmarshallerReceptacle.html "type parameter in NameUnmarshallerReceptacle") default_)
		```
		
		Extract the optional value as `T`, if it is missing use the given default value.
		
		Parameters:
		`default_` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameDefaultUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameOptionUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/RequiredValueUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html)*