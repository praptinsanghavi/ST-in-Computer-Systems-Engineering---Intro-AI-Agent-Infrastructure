---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl.html
title: JwtSettingsImpl
---

# JwtSettingsImpl

## Content

Package [akka.http.jwt.internal](package-summary.html)
## Class JwtSettingsImpl

- java.lang.Object
- - [akka.http.jwt.javadsl.JwtSettings](../javadsl/JwtSettings.html "class in akka.http.jwt.javadsl")
	- - akka.http.jwt.internal.JwtSettingsImpl

- All Implemented Interfaces:
`[JwtSettings](../scaladsl/JwtSettings.html "interface in akka.http.jwt.scaladsl")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class JwtSettingsImpl
extends [JwtSettings](../javadsl/JwtSettings.html "class in akka.http.jwt.javadsl")
implements [JwtSettings](../scaladsl/JwtSettings.html "interface in akka.http.jwt.scaladsl"), scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.jwt.internal.JwtSettingsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JwtSettingsImpl](#%3Cinit%3E(akka.http.jwt.internal.JwtSupport,java.lang.String,boolean))​([JwtSupport](JwtSupport.html "interface in akka.http.jwt.internal") jwtSupport,  java.lang.String realm,  boolean devMode)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `boolean` | `[devMode](#devMode())()` |  |
	| `static [JwtSettingsImpl](JwtSettingsImpl.html "class in akka.http.jwt.internal")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config inner)` |  |
	| `[JwtSupport](JwtSupport.html "interface in akka.http.jwt.internal")` | `[jwtSupport](#jwtSupport())()` | INTERNAL API |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[realm](#realm())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### JwtSettingsImpl
		
		
		
		```
		public JwtSettingsImpl​([JwtSupport](JwtSupport.html "interface in akka.http.jwt.internal") jwtSupport,
		                       java.lang.String realm,
		                       boolean devMode)
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [JwtSettingsImpl](JwtSettingsImpl.html "class in akka.http.jwt.internal") fromSubConfig​(com.typesafe.config.Config root,
		                                            com.typesafe.config.Config inner)
		```
		- #### prefix
		
		
		
		```
		protected static java.lang.String prefix()
		```
		- #### apply
		
		
		
		```
		public static T apply​(akka.actor.ActorSystem system)
		```
		- #### apply
		
		
		
		```
		public static T apply​(java.lang.String configOverrides)
		```
		- #### apply
		
		
		
		```
		public static T apply​(com.typesafe.config.Config config)
		```
		- #### jwtSupport
		
		
		
		```
		public [JwtSupport](JwtSupport.html "interface in akka.http.jwt.internal") jwtSupport()
		```
		
		Description copied from interface: `[JwtSettings](../scaladsl/JwtSettings.html#jwtSupport())`
		INTERNAL API
		
		Specified by:
		`[jwtSupport](../scaladsl/JwtSettings.html#jwtSupport())` in interface `[JwtSettings](../scaladsl/JwtSettings.html "interface in akka.http.jwt.scaladsl")`
		- #### realm
		
		
		
		```
		public java.lang.String realm()
		```
		
		
		Specified by:
		`[realm](../scaladsl/JwtSettings.html#realm())` in interface `[JwtSettings](../scaladsl/JwtSettings.html "interface in akka.http.jwt.scaladsl")`
		Specified by:
		`[realm](../javadsl/JwtSettings.html#realm())` in class `[JwtSettings](../javadsl/JwtSettings.html "class in akka.http.jwt.javadsl")`
		- #### devMode
		
		
		
		```
		public boolean devMode()
		```
		
		
		Specified by:
		`[devMode](../scaladsl/JwtSettings.html#devMode())` in interface `[JwtSettings](../scaladsl/JwtSettings.html "interface in akka.http.jwt.scaladsl")`
		Specified by:
		`[devMode](../javadsl/JwtSettings.html#devMode())` in class `[JwtSettings](../javadsl/JwtSettings.html "class in akka.http.jwt.javadsl")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/JwtSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/JwtSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl.html)*