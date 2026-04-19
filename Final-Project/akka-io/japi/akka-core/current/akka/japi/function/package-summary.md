---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:46:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/japi/function/package-summary.html
title: akka.japi.function
---

# akka.japi.function

## Content

# Package akka.japi.function

- Interface Summary 
| Interface | Description |
| [Creator](Creator.html "interface in akka.japi.function")\<T\> | A constructor/factory, takes no parameters but creates a new value of type T every call. |
| --- | --- |
| [Effect](Effect.html "interface in akka.japi.function") | An executable piece of code that takes no parameters and doesn't return any value. |
| [Function](Function.html "interface in akka.japi.function")\<T,​R\> | A Function interface. |
| [Function10](Function10.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​R\> | A Function interface. |
| [Function11](Function11.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​R\> | A Function interface. |
| [Function12](Function12.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​R\> | A Function interface. |
| [Function13](Function13.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​R\> | A Function interface. |
| [Function14](Function14.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​R\> | A Function interface. |
| [Function15](Function15.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​R\> | A Function interface. |
| [Function16](Function16.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​R\> | A Function interface. |
| [Function17](Function17.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​R\> | A Function interface. |
| [Function18](Function18.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​R\> | A Function interface. |
| [Function19](Function19.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​R\> | A Function interface. |
| [Function2](Function2.html "interface in akka.japi.function")\<T1,​T2,​R\> | A Function interface. |
| [Function20](Function20.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​R\> | A Function interface. |
| [Function21](Function21.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​R\> | A Function interface. |
| [Function22](Function22.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​R\> | A Function interface. |
| [Function3](Function3.html "interface in akka.japi.function")\<T1,​T2,​T3,​R\> | A Function interface. |
| [Function4](Function4.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​R\> | A Function interface. |
| [Function5](Function5.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​R\> | A Function interface. |
| [Function6](Function6.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​R\> | A Function interface. |
| [Function7](Function7.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​R\> | A Function interface. |
| [Function8](Function8.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​R\> | A Function interface. |
| [Function9](Function9.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​R\> | A Function interface. |
| [Predicate](Predicate.html "interface in akka.japi.function")\<T\> | Java API: Defines a criteria and determines whether the parameter meets this criteria. |
| [Procedure](Procedure.html "interface in akka.japi.function")\<T\> | A Procedure is like a Function, but it doesn't produce a return value. |
| [Procedure10](Procedure10.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10\> | A Consumer interface. |
| [Procedure11](Procedure11.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11\> | A Consumer interface. |
| [Procedure12](Procedure12.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12\> | A Consumer interface. |
| [Procedure13](Procedure13.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13\> | A Consumer interface. |
| [Procedure14](Procedure14.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14\> | A Consumer interface. |
| [Procedure15](Procedure15.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15\> | A Consumer interface. |
| [Procedure16](Procedure16.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16\> | A Consumer interface. |
| [Procedure17](Procedure17.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17\> | A Consumer interface. |
| [Procedure18](Procedure18.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18\> | A Consumer interface. |
| [Procedure19](Procedure19.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19\> | A Consumer interface. |
| [Procedure2](Procedure2.html "interface in akka.japi.function")\<T1,​T2\> | A Consumer interface. |
| [Procedure20](Procedure20.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20\> | A Consumer interface. |
| [Procedure21](Procedure21.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21\> | A Consumer interface. |
| [Procedure22](Procedure22.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22\> | A Consumer interface. |
| [Procedure3](Procedure3.html "interface in akka.japi.function")\<T1,​T2,​T3\> | A Consumer interface. |
| [Procedure4](Procedure4.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4\> | A Consumer interface. |
| [Procedure5](Procedure5.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5\> | A Consumer interface. |
| [Procedure6](Procedure6.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6\> | A Consumer interface. |
| [Procedure7](Procedure7.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7\> | A Consumer interface. |
| [Procedure8](Procedure8.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8\> | A Consumer interface. |
| [Procedure9](Procedure9.html "interface in akka.japi.function")\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9\> | A Consumer interface. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Effect.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function10.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function11.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function12.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function13.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function14.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function15.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function16.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function17.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function18.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function19.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function20.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function21.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function22.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function3.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function4.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function5.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function6.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function7.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function8.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Function9.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Predicate.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure10.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure11.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure12.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure13.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure14.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure15.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure16.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure17.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure18.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure19.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure2.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure20.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure21.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure22.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure3.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure4.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure5.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure6.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure7.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure8.html
- https://doc.akka.io/japi/akka-core/current/akka/japi/function/Procedure9.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/japi/function/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/japi/function/package-summary.html)*