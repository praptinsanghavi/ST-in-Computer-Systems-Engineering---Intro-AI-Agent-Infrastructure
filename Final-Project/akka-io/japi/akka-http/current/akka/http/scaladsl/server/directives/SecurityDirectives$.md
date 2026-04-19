---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/SecurityDirectives$.html
title: SecurityDirectives$
---

# SecurityDirectives$

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class SecurityDirectives$

- java.lang.Object
- - akka.http.scaladsl.server.directives.SecurityDirectives$

- All Implemented Interfaces:
`[SecurityDirectives](SecurityDirectives.html "interface in akka.http.scaladsl.server.directives")`

---

```
public class SecurityDirectives$
extends java.lang.Object
implements [SecurityDirectives](SecurityDirectives.html "interface in akka.http.scaladsl.server.directives")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SecurityDirectives$](SecurityDirectives$.html "class in akka.http.scaladsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SecurityDirectives$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[SecurityDirectives](SecurityDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[authenticateBasic](SecurityDirectives.html#authenticateBasic(java.lang.String,scala.Function1)), [authenticateBasicAsync](SecurityDirectives.html#authenticateBasicAsync(java.lang.String,scala.Function1)), [authenticateBasicPF](SecurityDirectives.html#authenticateBasicPF(java.lang.String,scala.PartialFunction)), [authenticateBasicPFAsync](SecurityDirectives.html#authenticateBasicPFAsync(java.lang.String,scala.PartialFunction)), [authenticateOAuth2](SecurityDirectives.html#authenticateOAuth2(java.lang.String,scala.Function1)), [authenticateOAuth2Async](SecurityDirectives.html#authenticateOAuth2Async(java.lang.String,scala.Function1)), [authenticateOAuth2PF](SecurityDirectives.html#authenticateOAuth2PF(java.lang.String,scala.PartialFunction)), [authenticateOAuth2PFAsync](SecurityDirectives.html#authenticateOAuth2PFAsync(java.lang.String,scala.PartialFunction)), [authenticateOrRejectWithChallenge](SecurityDirectives.html#authenticateOrRejectWithChallenge(scala.Function1)), [authenticateOrRejectWithChallenge](SecurityDirectives.html#authenticateOrRejectWithChallenge(scala.Function1,scala.reflect.ClassTag)), [authorize](SecurityDirectives.html#authorize(scala.Function0)), [authorize](SecurityDirectives.html#authorize(scala.Function1)), [authorizeAsync](SecurityDirectives.html#authorizeAsync(scala.Function0)), [authorizeAsync](SecurityDirectives.html#authorizeAsync(scala.Function1)), [extractCredentials](SecurityDirectives.html#extractCredentials()), [extractCredentialsAndAuthenticateOrRejectWithChallenge](SecurityDirectives.html#extractCredentialsAndAuthenticateOrRejectWithChallenge(akka.http.scaladsl.server.Directive,scala.Function1))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SecurityDirectives$](SecurityDirectives$.html "class in akka.http.scaladsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SecurityDirectives$
		
		
		
		```
		public SecurityDirectives$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/SecurityDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/SecurityDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/SecurityDirectives$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/SecurityDirectives$.html)*