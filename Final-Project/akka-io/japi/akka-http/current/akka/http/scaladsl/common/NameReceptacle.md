---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html
title: NameReceptacle
---

# NameReceptacle

## Content

Package [akka.http.scaladsl.common](package-summary.html)
## Class NameReceptacle\<T\>

- java.lang.Object
- - akka.http.scaladsl.common.NameReceptacle\<T\>

- ---

```
public class NameReceptacle<T>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NameReceptacle](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<B> [NameReceptacle](NameReceptacle.html "class in akka.http.scaladsl.common")<B>` | `[as](#as())()` | Extract the value as the specified type. |
	| `<B> [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<B>` | `[as](#as(akka.http.scaladsl.unmarshalling.Unmarshaller,akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[T](NameReceptacle.html "type parameter in NameReceptacle"),​B> unmarshaller,  [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​[T](NameReceptacle.html "type parameter in NameReceptacle")> fsu)` | Extract the value as the specified type with the given [`Unmarshaller`](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling"). |
	| `java.lang.String` | `[name](#name())()` |  |
	| `[NameOptionReceptacle](NameOptionReceptacle.html "class in akka.http.scaladsl.common")<[T](NameReceptacle.html "type parameter in NameReceptacle")>` | `[optional](#optional())()` | Extract the optional value as `Option[String]`. |
	| `[RepeatedValueReceptacle](RepeatedValueReceptacle.html "class in akka.http.scaladsl.common")<[T](NameReceptacle.html "type parameter in NameReceptacle")>` | `[repeated](#repeated())()` | Extract multiple occurrences as `Iterable[String]`. |
	| `<B> [RequiredValueReceptacle](RequiredValueReceptacle.html "class in akka.http.scaladsl.common")<B>` | `[requiredValue](#requiredValue(B))​(B requiredValue)` | Require the given value and extract nothing. |
	| `<B> [NameDefaultReceptacle](NameDefaultReceptacle.html "class in akka.http.scaladsl.common")<B>` | `[withDefault](#withDefault(B))​(B default_)` | Extract the optional value as `String`, if it is missing use the given default value. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NameReceptacle
		
		
		
		```
		public NameReceptacle​(java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### as
		
		
		
		```
		public <B> [NameReceptacle](NameReceptacle.html "class in akka.http.scaladsl.common")<B> as()
		```
		
		Extract the value as the specified type.
		 You need a matching [`Unmarshaller`](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling") in scope for that to work.
		
		Returns:
		(undocumented)
		- #### as
		
		
		
		```
		public <B> [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")<B> as​([Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[T](NameReceptacle.html "type parameter in NameReceptacle"),​B> unmarshaller,
		                                            [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​[T](NameReceptacle.html "type parameter in NameReceptacle")> fsu)
		```
		
		Extract the value as the specified type with the given [`Unmarshaller`](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling").
		
		Parameters:
		`unmarshaller` \- (undocumented)
		`fsu` \- (undocumented)
		Returns:
		(undocumented)
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### optional
		
		
		
		```
		public [NameOptionReceptacle](NameOptionReceptacle.html "class in akka.http.scaladsl.common")<[T](NameReceptacle.html "type parameter in NameReceptacle")> optional()
		```
		
		Extract the optional value as `Option[String]`.
		
		Returns:
		(undocumented)
		- #### repeated
		
		
		
		```
		public [RepeatedValueReceptacle](RepeatedValueReceptacle.html "class in akka.http.scaladsl.common")<[T](NameReceptacle.html "type parameter in NameReceptacle")> repeated()
		```
		
		Extract multiple occurrences as `Iterable[String]`.
		
		Returns:
		(undocumented)
		- #### requiredValue
		
		
		
		```
		public <B> [RequiredValueReceptacle](RequiredValueReceptacle.html "class in akka.http.scaladsl.common")<B> requiredValue​(B requiredValue)
		```
		
		Require the given value and extract nothing.
		 Reject if it is missing or has a different value.
		
		Parameters:
		`requiredValue` \- (undocumented)
		Returns:
		(undocumented)
		- #### withDefault
		
		
		
		```
		public <B> [NameDefaultReceptacle](NameDefaultReceptacle.html "class in akka.http.scaladsl.common")<B> withDefault​(B default_)
		```
		
		Extract the optional value as `String`, if it is missing use the given default value.
		
		Parameters:
		`default_` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameDefaultReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/RepeatedValueReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/RequiredValueReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html)*