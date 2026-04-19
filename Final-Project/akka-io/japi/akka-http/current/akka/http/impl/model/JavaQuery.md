---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/JavaQuery.html
title: JavaQuery
---

# JavaQuery

## Content

Package [akka.http.impl.model](package-summary.html)
## Class JavaQuery

- java.lang.Object
- - [akka.http.javadsl.model.Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")
	- - akka.http.impl.model.JavaQuery

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class JavaQuery
extends [Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.model.JavaQuery)

- - ### Field Summary
	
	
		- ### Fields inherited from class akka.http.javadsl.model.[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")
		
		
		`[EMPTY](../../javadsl/model/Query.html#EMPTY)`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JavaQuery](#%3Cinit%3E(akka.http.scaladsl.model.Uri.Query))​([Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") query)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `java.util.Optional<java.lang.String>` | `[get](#get(java.lang.String))​(java.lang.String key)` | Returns the value of the first parameter with the given key if it exists. |
	| `java.util.List<java.lang.String>` | `[getAll](#getAll(java.lang.String))​(java.lang.String key)` | Returns the value of all parameters with the given key. |
	| `java.lang.String` | `[getOrElse](#getOrElse(java.lang.String,java.lang.String))​(java.lang.String key,  java.lang.String _default)` | Returns the value of the first parameter with the given key or the provided default value. |
	| `[Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[query](#query())()` |  |
	| `java.lang.String` | `[render](#render(akka.http.javadsl.model.HttpCharset))​([HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model") charset)` | Renders this Query into its string representation using the given charset. |
	| `java.lang.String` | `[render](#render(akka.http.javadsl.model.HttpCharset,akka.parboiled2.CharPredicate))​([HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model") charset,  akka.parboiled2.CharPredicate keep)` | Renders this Query into its string representation using the given charset and char predicate. |
	| `java.util.List<akka.japi.Pair<java.lang.String,​java.lang.String>>` | `[toList](#toList())()` | Returns a \`List\` of all parameters of this Query. |
	| `java.util.Map<java.lang.String,​java.lang.String>` | `[toMap](#toMap())()` | Returns a key/value map of the parameters of this Query. |
	| `java.util.Map<java.lang.String,​java.util.List<java.lang.String>>` | `[toMultiMap](#toMultiMap())()` | Returns a \`Map\` of all parameters of this Query. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")` | `[withParam](#withParam(java.lang.String,java.lang.String))​(java.lang.String key,  java.lang.String value)` | Returns a copy of this instance with a query parameter added. |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")
		
		
		`[create](../../javadsl/model/Query.html#create(akka.japi.Pair...)), [create](../../javadsl/model/Query.html#create(java.lang.Iterable)), [create](../../javadsl/model/Query.html#create(java.lang.String)), [create](../../javadsl/model/Query.html#create(java.lang.String,akka.http.scaladsl.model.Uri.ParsingMode)), [create](../../javadsl/model/Query.html#create(java.lang.String,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode)), [create](../../javadsl/model/Query.html#create(java.util.Map))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### JavaQuery
		
		
		
		```
		public JavaQuery​([Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") query)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### query
		
		
		
		```
		public [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") query()
		```
		- #### get
		
		
		
		```
		public java.util.Optional<java.lang.String> get​(java.lang.String key)
		```
		
		Description copied from class: `[Query](../../javadsl/model/Query.html#get(java.lang.String))`
		Returns the value of the first parameter with the given key if it exists.
		
		Specified by:
		`[get](../../javadsl/model/Query.html#get(java.lang.String))` in class `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")`
		- #### toMap
		
		
		
		```
		public java.util.Map<java.lang.String,​java.lang.String> toMap()
		```
		
		Description copied from class: `[Query](../../javadsl/model/Query.html#toMap())`
		Returns a key/value map of the parameters of this Query. Use
		 the \`toList()\` method to return all parameters if keys may occur
		 multiple times.
		
		Specified by:
		`[toMap](../../javadsl/model/Query.html#toMap())` in class `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")`
		- #### toList
		
		
		
		```
		public java.util.List<akka.japi.Pair<java.lang.String,​java.lang.String>> toList()
		```
		
		Description copied from class: `[Query](../../javadsl/model/Query.html#toList())`
		Returns a \`List\` of all parameters of this Query. Use the \`toMap()\`
		 method to filter out entries with duplicated keys.
		
		Specified by:
		`[toList](../../javadsl/model/Query.html#toList())` in class `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")`
		- #### getOrElse
		
		
		
		```
		public java.lang.String getOrElse​(java.lang.String key,
		                                  java.lang.String _default)
		```
		
		Description copied from class: `[Query](../../javadsl/model/Query.html#getOrElse(java.lang.String,java.lang.String))`
		Returns the value of the first parameter with the given key or the provided default value.
		
		Specified by:
		`[getOrElse](../../javadsl/model/Query.html#getOrElse(java.lang.String,java.lang.String))` in class `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")`
		- #### toMultiMap
		
		
		
		```
		public java.util.Map<java.lang.String,​java.util.List<java.lang.String>> toMultiMap()
		```
		
		Description copied from class: `[Query](../../javadsl/model/Query.html#toMultiMap())`
		Returns a \`Map\` of all parameters of this Query. Use the \`toMap()\`
		 method to filter out entries with duplicated keys.
		
		Specified by:
		`[toMultiMap](../../javadsl/model/Query.html#toMultiMap())` in class `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")`
		- #### getAll
		
		
		
		```
		public java.util.List<java.lang.String> getAll​(java.lang.String key)
		```
		
		Description copied from class: `[Query](../../javadsl/model/Query.html#getAll(java.lang.String))`
		Returns the value of all parameters with the given key.
		
		Specified by:
		`[getAll](../../javadsl/model/Query.html#getAll(java.lang.String))` in class `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### withParam
		
		
		
		```
		public [Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model") withParam​(java.lang.String key,
		                       java.lang.String value)
		```
		
		Description copied from class: `[Query](../../javadsl/model/Query.html#withParam(java.lang.String,java.lang.String))`
		Returns a copy of this instance with a query parameter added.
		
		Specified by:
		`[withParam](../../javadsl/model/Query.html#withParam(java.lang.String,java.lang.String))` in class `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")`
		- #### render
		
		
		
		```
		public java.lang.String render​([HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model") charset)
		```
		
		Description copied from class: `[Query](../../javadsl/model/Query.html#render(akka.http.javadsl.model.HttpCharset))`
		Renders this Query into its string representation using the given charset.
		
		Specified by:
		`[render](../../javadsl/model/Query.html#render(akka.http.javadsl.model.HttpCharset))` in class `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")`
		- #### render
		
		
		
		```
		public java.lang.String render​([HttpCharset](../../javadsl/model/HttpCharset.html "class in akka.http.javadsl.model") charset,
		                               akka.parboiled2.CharPredicate keep)
		```
		
		Description copied from class: `[Query](../../javadsl/model/Query.html#render(akka.http.javadsl.model.HttpCharset,akka.parboiled2.CharPredicate))`
		Renders this Query into its string representation using the given charset and char predicate.
		
		Specified by:
		`[render](../../javadsl/model/Query.html#render(akka.http.javadsl.model.HttpCharset,akka.parboiled2.CharPredicate))` in class `[Query](../../javadsl/model/Query.html "class in akka.http.javadsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Query.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/JavaQuery.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/JavaQuery.html)*