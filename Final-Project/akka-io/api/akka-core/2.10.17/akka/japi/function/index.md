---
description: Akka 2.10.17 - akka.japi.function
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:03:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/function/index.html
title: Akka 2.10.17 - akka.japi.function
---

# Akka 2.10.17 - akka.japi.function

> **Summary:** Akka 2.10.17 - akka.japi.function

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/japi/index.html "Permalink")  package [japi](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/japi/function/index.html "Permalink")  package functionDefinition Classes[japi](../index.html)
- [Creator](Creator.html "A constructor/factory, takes no parameters but creates a new value of type T every call.")
- [Effect](Effect.html "An executable piece of code that takes no parameters and doesn't return any value.")
- [Function](Function.html "A Function interface.")
- [Function10](Function10.html "A Function interface.")
- [Function11](Function11.html "A Function interface.")
- [Function12](Function12.html "A Function interface.")
- [Function13](Function13.html "A Function interface.")
- [Function14](Function14.html "A Function interface.")
- [Function15](Function15.html "A Function interface.")
- [Function16](Function16.html "A Function interface.")
- [Function17](Function17.html "A Function interface.")
- [Function18](Function18.html "A Function interface.")
- [Function19](Function19.html "A Function interface.")
- [Function2](Function2.html "A Function interface.")
- [Function20](Function20.html "A Function interface.")
- [Function21](Function21.html "A Function interface.")
- [Function22](Function22.html "A Function interface.")
- [Function3](Function3.html "A Function interface.")
- [Function4](Function4.html "A Function interface.")
- [Function5](Function5.html "A Function interface.")
- [Function6](Function6.html "A Function interface.")
- [Function7](Function7.html "A Function interface.")
- [Function8](Function8.html "A Function interface.")
- [Function9](Function9.html "A Function interface.")
- [Predicate](Predicate.html "Java API: Defines a criteria and determines whether the parameter meets this criteria.")
- [Procedure](Procedure.html "A Procedure is like a Function, but it doesn't produce a return value.")
- [Procedure10](Procedure10.html "A Consumer interface.")
- [Procedure11](Procedure11.html "A Consumer interface.")
- [Procedure12](Procedure12.html "A Consumer interface.")
- [Procedure13](Procedure13.html "A Consumer interface.")
- [Procedure14](Procedure14.html "A Consumer interface.")
- [Procedure15](Procedure15.html "A Consumer interface.")
- [Procedure16](Procedure16.html "A Consumer interface.")
- [Procedure17](Procedure17.html "A Consumer interface.")
- [Procedure18](Procedure18.html "A Consumer interface.")
- [Procedure19](Procedure19.html "A Consumer interface.")
- [Procedure2](Procedure2.html "A Consumer interface.")
- [Procedure20](Procedure20.html "A Consumer interface.")
- [Procedure21](Procedure21.html "A Consumer interface.")
- [Procedure22](Procedure22.html "A Consumer interface.")
- [Procedure3](Procedure3.html "A Consumer interface.")
- [Procedure4](Procedure4.html "A Consumer interface.")
- [Procedure5](Procedure5.html "A Consumer interface.")
- [Procedure6](Procedure6.html "A Consumer interface.")
- [Procedure7](Procedure7.html "A Consumer interface.")
- [Procedure8](Procedure8.html "A Consumer interface.")
- [Procedure9](Procedure9.html "A Consumer interface.")
- [**](../../../akka/japi/pf/index.html "Permalink")  package [pf](../pf/index.html)Definition Classes[japi](../index.html)
- [**](../../../akka/japi/tuple/index.html "Permalink")  package [tuple](../tuple/index.html)Definition Classes[japi](../index.html)
p[akka](../../index.html).[japi](../index.html)

# function[**](../../../akka/japi/function/index.html "Permalink")

#### package function

### Type Members

1. [**](../../../akka/japi/function/Creator.html "Permalink")  trait [Creator](Creator.html "A constructor/factory, takes no parameters but creates a new value of type T every call.")\[\+T] extends SerializableA constructor/factory, takes no parameters but creates a new value of type T every call.

A constructor/factory, takes no parameters but creates a new value of type T every call.
Supports throwing `Exception` in the apply, which the `java.util.function.Creator` counterpart does not.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
2. [**](../../../akka/japi/function/Effect.html "Permalink")  trait [Effect](Effect.html "An executable piece of code that takes no parameters and doesn't return any value.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)An executable piece of code that takes no parameters and doesn't return any value.

An executable piece of code that takes no parameters and doesn't return any value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.
Supports throwing `Exception` in the apply, which the `java.util.function.Effect` counterpart does not.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
3. [**](../../../akka/japi/function/Function.html "Permalink")  trait [Function](Function.html "A Function interface.")\[\-T, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.
Supports throwing `Exception` in the apply, which the `java.util.function.Function` counterpart does not.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
4. [**](../../../akka/japi/function/Function10.html "Permalink")  trait [Function10](Function10.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 10\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
5. [**](../../../akka/japi/function/Function11.html "Permalink")  trait [Function11](Function11.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 11\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
6. [**](../../../akka/japi/function/Function12.html "Permalink")  trait [Function12](Function12.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 12\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
7. [**](../../../akka/japi/function/Function13.html "Permalink")  trait [Function13](Function13.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 13\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
8. [**](../../../akka/japi/function/Function14.html "Permalink")  trait [Function14](Function14.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 14\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
9. [**](../../../akka/japi/function/Function15.html "Permalink")  trait [Function15](Function15.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 15\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
10. [**](../../../akka/japi/function/Function16.html "Permalink")  trait [Function16](Function16.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 16\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
11. [**](../../../akka/japi/function/Function17.html "Permalink")  trait [Function17](Function17.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 17\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
12. [**](../../../akka/japi/function/Function18.html "Permalink")  trait [Function18](Function18.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 18\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
13. [**](../../../akka/japi/function/Function19.html "Permalink")  trait [Function19](Function19.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 19\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
14. [**](../../../akka/japi/function/Function2.html "Permalink")  trait [Function2](Function2.html "A Function interface.")\[\-T1, \-T2, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 2\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.
Supports throwing `Exception` in the apply, which the `java.util.function.BiFunction` counterpart does not.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
15. [**](../../../akka/japi/function/Function20.html "Permalink")  trait [Function20](Function20.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19, \-T20, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 20\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
16. [**](../../../akka/japi/function/Function21.html "Permalink")  trait [Function21](Function21.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19, \-T20, \-T21, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 21\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
17. [**](../../../akka/japi/function/Function22.html "Permalink")  trait [Function22](Function22.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19, \-T20, \-T21, \-T22, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 22\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
18. [**](../../../akka/japi/function/Function3.html "Permalink")  trait [Function3](Function3.html "A Function interface.")\[\-T1, \-T2, \-T3, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 3\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
19. [**](../../../akka/japi/function/Function4.html "Permalink")  trait [Function4](Function4.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 4\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
20. [**](../../../akka/japi/function/Function5.html "Permalink")  trait [Function5](Function5.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 5\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
21. [**](../../../akka/japi/function/Function6.html "Permalink")  trait [Function6](Function6.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 6\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
22. [**](../../../akka/japi/function/Function7.html "Permalink")  trait [Function7](Function7.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 7\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
23. [**](../../../akka/japi/function/Function8.html "Permalink")  trait [Function8](Function8.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 8\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
24. [**](../../../akka/japi/function/Function9.html "Permalink")  trait [Function9](Function9.html "A Function interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Function interface.

A Function interface. Used to create 9\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
25. [**](../../../akka/japi/function/Predicate.html "Permalink")  trait [Predicate](Predicate.html "Java API: Defines a criteria and determines whether the parameter meets this criteria.")\[\-T] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Java API: Defines a criteria and determines whether the parameter meets this criteria.

Java API: Defines a criteria and determines whether the parameter meets this criteria.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.
Supports throwing `Exception` in the apply, which the `java.util.function.Predicate` counterpart does not.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
26. [**](../../../akka/japi/function/Procedure.html "Permalink")  trait [Procedure](Procedure.html "A Procedure is like a Function, but it doesn't produce a return value.")\[\-T] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Procedure is like a Function, but it doesn't produce a return value.

A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.
Supports throwing `Exception` in the apply, which the `java.util.function.Consumer` counterpart does not.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
27. [**](../../../akka/japi/function/Procedure10.html "Permalink")  trait [Procedure10](Procedure10.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 10\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
28. [**](../../../akka/japi/function/Procedure11.html "Permalink")  trait [Procedure11](Procedure11.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 11\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
29. [**](../../../akka/japi/function/Procedure12.html "Permalink")  trait [Procedure12](Procedure12.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 12\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
30. [**](../../../akka/japi/function/Procedure13.html "Permalink")  trait [Procedure13](Procedure13.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 13\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
31. [**](../../../akka/japi/function/Procedure14.html "Permalink")  trait [Procedure14](Procedure14.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 14\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
32. [**](../../../akka/japi/function/Procedure15.html "Permalink")  trait [Procedure15](Procedure15.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 15\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
33. [**](../../../akka/japi/function/Procedure16.html "Permalink")  trait [Procedure16](Procedure16.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 16\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
34. [**](../../../akka/japi/function/Procedure17.html "Permalink")  trait [Procedure17](Procedure17.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 17\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
35. [**](../../../akka/japi/function/Procedure18.html "Permalink")  trait [Procedure18](Procedure18.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 18\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
36. [**](../../../akka/japi/function/Procedure19.html "Permalink")  trait [Procedure19](Procedure19.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 19\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
37. [**](../../../akka/japi/function/Procedure2.html "Permalink")  trait [Procedure2](Procedure2.html "A Consumer interface.")\[\-T1, \-T2] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 2\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
38. [**](../../../akka/japi/function/Procedure20.html "Permalink")  trait [Procedure20](Procedure20.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19, \-T20] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 20\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
39. [**](../../../akka/japi/function/Procedure21.html "Permalink")  trait [Procedure21](Procedure21.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19, \-T20, \-T21] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 21\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
40. [**](../../../akka/japi/function/Procedure22.html "Permalink")  trait [Procedure22](Procedure22.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19, \-T20, \-T21, \-T22] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 22\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
41. [**](../../../akka/japi/function/Procedure3.html "Permalink")  trait [Procedure3](Procedure3.html "A Consumer interface.")\[\-T1, \-T2, \-T3] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 3\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
42. [**](../../../akka/japi/function/Procedure4.html "Permalink")  trait [Procedure4](Procedure4.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 4\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
43. [**](../../../akka/japi/function/Procedure5.html "Permalink")  trait [Procedure5](Procedure5.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 5\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
44. [**](../../../akka/japi/function/Procedure6.html "Permalink")  trait [Procedure6](Procedure6.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 6\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
45. [**](../../../akka/japi/function/Procedure7.html "Permalink")  trait [Procedure7](Procedure7.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 7\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
46. [**](../../../akka/japi/function/Procedure8.html "Permalink")  trait [Procedure8](Procedure8.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 8\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
47. [**](../../../akka/japi/function/Procedure9.html "Permalink")  trait [Procedure9](Procedure9.html "A Consumer interface.")\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Consumer interface.

A Consumer interface. Used to create 9\-arg consumers in Java.
A Procedure is like a Function, but it doesn't produce a return value.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function10.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function11.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function12.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function13.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function14.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function15.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function16.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function17.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function18.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function19.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function20.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function21.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function22.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function4.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function5.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function6.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function7.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function8.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Function9.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Predicate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure10.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure11.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure12.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure13.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure14.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure15.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure16.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure17.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure18.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure19.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure20.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure21.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure22.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure4.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure5.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure6.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure7.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure8.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/Procedure9.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/index.html)*