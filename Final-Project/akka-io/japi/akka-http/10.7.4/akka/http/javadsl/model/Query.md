---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Query.html
title: Query
---

# Query

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class Query

- java.lang.Object
- - akka.http.javadsl.model.Query

- Direct Known Subclasses:
`[JavaQuery](../../impl/model/JavaQuery.html "class in akka.http.impl.model")`

---

```
public abstract class Query
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Query](Query.html "class in akka.http.javadsl.model")` | `[EMPTY](#EMPTY)` | Returns an empty Query. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Query](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Query](Query.html "class in akka.http.javadsl.model")` | `[create](#create(akka.japi.Pair...))​(akka.japi.Pair<java.lang.String,​java.lang.String>... params)` | Returns a Query from the given parameters. |
	| `static [Query](Query.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.Iterable))​(java.lang.Iterable<akka.japi.Pair<java.lang.String,​java.lang.String>> params)` | Returns a Query from the given parameters. |
	| `static [Query](Query.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.String))​(java.lang.String rawQuery)` | Returns a Query created by parsing the given undecoded string representation. |
	| `static [Query](Query.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.String,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String rawQuery,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)` | Returns a Query created by parsing the given undecoded string representation with the provided parsing mode. |
	| `static [Query](Query.html "class in akka.http.javadsl.model")` | `[create](#create(java.lang.String,java.nio.charset.Charset,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String rawQuery,  java.nio.charset.Charset charset,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)` | Returns a Query created by parsing the given undecoded string representation with the provided charset and parsing mode. |
	| `static [Query](Query.html "class in akka.http.javadsl.model")` | `[create](#create(java.util.Map))​(java.util.Map<java.lang.String,​java.lang.String> params)` | Returns a Query from the given parameters. |
	| `abstract java.util.Optional<java.lang.String>` | `[get](#get(java.lang.String))​(java.lang.String key)` | Returns the value of the first parameter with the given key if it exists. |
	| `abstract java.util.List<java.lang.String>` | `[getAll](#getAll(java.lang.String))​(java.lang.String key)` | Returns the value of all parameters with the given key. |
	| `abstract java.lang.String` | `[getOrElse](#getOrElse(java.lang.String,java.lang.String))​(java.lang.String key,  java.lang.String _default)` | Returns the value of the first parameter with the given key or the provided default value. |
	| `abstract java.lang.String` | `[render](#render(akka.http.javadsl.model.HttpCharset))​([HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset)` | Renders this Query into its string representation using the given charset. |
	| `abstract java.lang.String` | `[render](#render(akka.http.javadsl.model.HttpCharset,akka.parboiled2.CharPredicate))​([HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset,  akka.parboiled2.CharPredicate keep)` | Renders this Query into its string representation using the given charset and char predicate. |
	| `abstract java.util.List<akka.japi.Pair<java.lang.String,​java.lang.String>>` | `[toList](#toList())()` | Returns a \`List\` of all parameters of this Query. |
	| `abstract java.util.Map<java.lang.String,​java.lang.String>` | `[toMap](#toMap())()` | Returns a key/value map of the parameters of this Query. |
	| `abstract java.util.Map<java.lang.String,​java.util.List<java.lang.String>>` | `[toMultiMap](#toMultiMap())()` | Returns a \`Map\` of all parameters of this Query. |
	| `abstract [Query](Query.html "class in akka.http.javadsl.model")` | `[withParam](#withParam(java.lang.String,java.lang.String))​(java.lang.String key,  java.lang.String value)` | Returns a copy of this instance with a query parameter added. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### EMPTY
		
		
		
		```
		public static final [Query](Query.html "class in akka.http.javadsl.model") EMPTY
		```
		
		Returns an empty Query.

	- ### Constructor Detail
	
	
	
		- #### Query
		
		
		
		```
		public Query()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public abstract java.util.Optional<java.lang.String> get​(java.lang.String key)
		```
		
		Returns the value of the first parameter with the given key if it exists.
		- #### getOrElse
		
		
		
		```
		public abstract java.lang.String getOrElse​(java.lang.String key,
		                                           java.lang.String _default)
		```
		
		Returns the value of the first parameter with the given key or the provided default value.
		- #### getAll
		
		
		
		```
		public abstract java.util.List<java.lang.String> getAll​(java.lang.String key)
		```
		
		Returns the value of all parameters with the given key.
		- #### toList
		
		
		
		```
		public abstract java.util.List<akka.japi.Pair<java.lang.String,​java.lang.String>> toList()
		```
		
		Returns a \`List\` of all parameters of this Query. Use the \`toMap()\`
		 method to filter out entries with duplicated keys.
		- #### toMap
		
		
		
		```
		public abstract java.util.Map<java.lang.String,​java.lang.String> toMap()
		```
		
		Returns a key/value map of the parameters of this Query. Use
		 the \`toList()\` method to return all parameters if keys may occur
		 multiple times.
		- #### toMultiMap
		
		
		
		```
		public abstract java.util.Map<java.lang.String,​java.util.List<java.lang.String>> toMultiMap()
		```
		
		Returns a \`Map\` of all parameters of this Query. Use the \`toMap()\`
		 method to filter out entries with duplicated keys.
		- #### withParam
		
		
		
		```
		public abstract [Query](Query.html "class in akka.http.javadsl.model") withParam​(java.lang.String key,
		                                java.lang.String value)
		```
		
		Returns a copy of this instance with a query parameter added.
		- #### render
		
		
		
		```
		public abstract java.lang.String render​([HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset)
		```
		
		Renders this Query into its string representation using the given charset.
		- #### render
		
		
		
		```
		public abstract java.lang.String render​([HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset,
		                                        akka.parboiled2.CharPredicate keep)
		```
		
		Renders this Query into its string representation using the given charset and char predicate.
		- #### create
		
		
		
		```
		public static [Query](Query.html "class in akka.http.javadsl.model") create​(java.lang.String rawQuery)
		```
		
		Returns a Query created by parsing the given undecoded string representation.
		- #### create
		
		
		
		```
		public static [Query](Query.html "class in akka.http.javadsl.model") create​(java.lang.String rawQuery,
		                           [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)
		```
		
		Returns a Query created by parsing the given undecoded string representation with the provided parsing mode.
		- #### create
		
		
		
		```
		public static [Query](Query.html "class in akka.http.javadsl.model") create​(java.lang.String rawQuery,
		                           java.nio.charset.Charset charset,
		                           [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") parsingMode)
		```
		
		Returns a Query created by parsing the given undecoded string representation with the provided charset and parsing mode.
		- #### create
		
		
		
		```
		@SafeVarargs
		public static [Query](Query.html "class in akka.http.javadsl.model") create​(akka.japi.Pair<java.lang.String,​java.lang.String>... params)
		```
		
		Returns a Query from the given parameters.
		- #### create
		
		
		
		```
		public static [Query](Query.html "class in akka.http.javadsl.model") create​(java.lang.Iterable<akka.japi.Pair<java.lang.String,​java.lang.String>> params)
		```
		
		Returns a Query from the given parameters.
		- #### create
		
		
		
		```
		public static [Query](Query.html "class in akka.http.javadsl.model") create​(java.util.Map<java.lang.String,​java.lang.String> params)
		```
		
		Returns a Query from the given parameters.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/model/JavaQuery.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Query.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.ParsingMode.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Query.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Query.html)*