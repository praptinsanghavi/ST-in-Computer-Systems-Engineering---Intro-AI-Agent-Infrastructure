---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/JwtSettings.html
title: JwtSettings
---

# JwtSettings

## Content

Package [akka.http.jwt.scaladsl](package-summary.html)
## Interface JwtSettings

- All Known Implementing Classes:
`[JwtSettingsImpl](../internal/JwtSettingsImpl.html "class in akka.http.jwt.internal")`

---

```
public interface JwtSettings
```

Public API but not intended for subclassing

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[devMode](#devMode())()` |  |
	| `[JwtSupport](../internal/JwtSupport.html "interface in akka.http.jwt.internal")` | `[jwtSupport](#jwtSupport())()` | INTERNAL API |
	| `java.lang.String` | `[realm](#realm())()` |  |

- - ### Method Detail
	
	
	
		- #### jwtSupport
		
		
		
		```
		[JwtSupport](../internal/JwtSupport.html "interface in akka.http.jwt.internal") jwtSupport()
		```
		
		INTERNAL API
		- #### realm
		
		
		
		```
		java.lang.String realm()
		```
		- #### devMode
		
		
		
		```
		boolean devMode()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/JwtSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/JwtSettings.html)*