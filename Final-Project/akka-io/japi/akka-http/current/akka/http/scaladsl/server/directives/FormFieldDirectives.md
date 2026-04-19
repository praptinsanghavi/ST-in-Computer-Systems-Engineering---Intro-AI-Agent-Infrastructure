---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.Impl$.html
title: FormFieldDirectives.Impl$
---

# FormFieldDirectives.Impl$

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class FormFieldDirectives.Impl$

- java.lang.Object
- - akka.http.scaladsl.server.directives.FormFieldDirectives.Impl$

- Enclosing interface:
[FormFieldDirectives](FormFieldDirectives.html "interface in akka.http.scaladsl.server.directives")

---

```
public static class FormFieldDirectives.Impl$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FormFieldDirectives.Impl$](FormFieldDirectives.Impl$.html "class in akka.http.scaladsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Impl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<T>>` | `[fieldOfForm](#fieldOfForm(java.lang.String,akka.http.scaladsl.unmarshalling.Unmarshaller))​(java.lang.String fieldName,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<[StrictForm.Field](../../common/StrictForm.Field.html "interface in akka.http.scaladsl.common")>,​T> fu)` |  |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[filter](#filter(java.lang.String,akka.http.scaladsl.unmarshalling.Unmarshaller))​(java.lang.String fieldName,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<[StrictForm.Field](../../common/StrictForm.Field.html "interface in akka.http.scaladsl.common")>,​T> fu)` |  |
	| `protected <T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[handleFieldResult](#handleFieldResult(java.lang.String,scala.concurrent.Future))​(java.lang.String fieldName,  scala.concurrent.Future<T> result)` |  |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.Iterable<T>>>` | `[repeatedFilter](#repeatedFilter(java.lang.String,akka.http.scaladsl.unmarshalling.Unmarshaller))​(java.lang.String fieldName,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[StrictForm.Field](../../common/StrictForm.Field.html "interface in akka.http.scaladsl.common"),​T> fu)` |  |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[requiredFilter](#requiredFilter(java.lang.String,akka.http.scaladsl.unmarshalling.Unmarshaller,java.lang.Object))​(java.lang.String fieldName,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<[StrictForm.Field](../../common/StrictForm.Field.html "interface in akka.http.scaladsl.common")>,​T> fu,  java.lang.Object requiredValue)` |  |
	| `[Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[StrictForm.Field](../../common/StrictForm.Field.html "interface in akka.http.scaladsl.common"),​java.lang.String>` | `[stringFromStrictForm](#stringFromStrictForm())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FormFieldDirectives.Impl$](FormFieldDirectives.Impl$.html "class in akka.http.scaladsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Impl$
		
		
		
		```
		public Impl$()
		```

	- ### Method Detail
	
	
	
		- #### handleFieldResult
		
		
		
		```
		protected <T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> handleFieldResult​(java.lang.String fieldName,
		                                                           scala.concurrent.Future<T> result)
		```
		- #### stringFromStrictForm
		
		
		
		```
		public [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[StrictForm.Field](../../common/StrictForm.Field.html "interface in akka.http.scaladsl.common"),​java.lang.String> stringFromStrictForm()
		```
		- #### fieldOfForm
		
		
		
		```
		public <T> scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<T>> fieldOfForm​(java.lang.String fieldName,
		                                                                                        [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<[StrictForm.Field](../../common/StrictForm.Field.html "interface in akka.http.scaladsl.common")>,​T> fu)
		```
		- #### filter
		
		
		
		```
		public <T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> filter​(java.lang.String fieldName,
		                                             [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<[StrictForm.Field](../../common/StrictForm.Field.html "interface in akka.http.scaladsl.common")>,​T> fu)
		```
		- #### repeatedFilter
		
		
		
		```
		public <T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.Iterable<T>>> repeatedFilter​(java.lang.String fieldName,
		                                                                                [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[StrictForm.Field](../../common/StrictForm.Field.html "interface in akka.http.scaladsl.common"),​T> fu)
		```
		- #### requiredFilter
		
		
		
		```
		public <T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> requiredFilter​(java.lang.String fieldName,
		                                                             [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<[StrictForm.Field](../../common/StrictForm.Field.html "interface in akka.http.scaladsl.common")>,​T> fu,
		                                                             java.lang.Object requiredValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.Field.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.Impl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.Impl$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.Impl$.html)*