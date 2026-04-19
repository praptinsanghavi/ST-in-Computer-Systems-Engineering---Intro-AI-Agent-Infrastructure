---
description: Akka 2.10.17 - akka.actor.SupervisorStrategy.Directive
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:55:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/SupervisorStrategy$$Directive.html
title: Akka 2.10.17 - akka.actor.SupervisorStrategy.Directive
---

# Akka 2.10.17 - akka.actor.SupervisorStrategy.Directive

> **Summary:** Akka 2.10.17 - akka.actor.SupervisorStrategy.Directive

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/SupervisorStrategy$.html "Permalink")  object [SupervisorStrategy](SupervisorStrategy$.html) extends [SupervisorStrategyLowPriorityImplicits](SupervisorStrategyLowPriorityImplicits.html)Definition Classes[actor](index.html)
- Directive
- [Escalate](SupervisorStrategy$$Escalate$.html "Escalates the failure to the supervisor of the supervisor, by rethrowing the cause of the failure, i.e.")
- [Restart](SupervisorStrategy$$Restart$.html "Discards the old Actor instance and replaces it with a new, then resumes message processing.")
- [Resume](SupervisorStrategy$$Resume$.html "Resumes message processing for the failed Actor")
- [Stop](SupervisorStrategy$$Stop$.html "Stops the Actor")
t[akka](../index.html).[actor](index.html).[SupervisorStrategy](SupervisorStrategy$.html)

# Directive[**](../../akka/actor/SupervisorStrategy$$Directive.html "Permalink")

### 

#### sealed  trait Directive extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[FaultHandling.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/FaultHandling.scala#L108)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Escalate](SupervisorStrategy$$Escalate$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Directive
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/actor/SupervisorStrategy$$Directive.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/SupervisorStrategy$$Directive.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/SupervisorStrategy$$Directive.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Directive toany2stringadd\[Directive] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/SupervisorStrategy$$Directive.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Directive, B)ImplicitThis member is added by an implicit conversion from Directive toArrowAssoc\[Directive] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/SupervisorStrategy$$Directive.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/SupervisorStrategy$$Directive.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/SupervisorStrategy$$Directive.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/SupervisorStrategy$$Directive.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Directive) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DirectiveImplicitThis member is added by an implicit conversion from Directive toEnsuring\[Directive] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/SupervisorStrategy$$Directive.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Directive) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DirectiveImplicitThis member is added by an implicit conversion from Directive toEnsuring\[Directive] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/SupervisorStrategy$$Directive.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DirectiveImplicitThis member is added by an implicit conversion from Directive toEnsuring\[Directive] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/SupervisorStrategy$$Directive.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DirectiveImplicitThis member is added by an implicit conversion from Directive toEnsuring\[Directive] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/SupervisorStrategy$$Directive.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/SupervisorStrategy$$Directive.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/actor/SupervisorStrategy$$Directive.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/actor/SupervisorStrategy$$Directive.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/SupervisorStrategy$$Directive.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/actor/SupervisorStrategy$$Directive.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/actor/SupervisorStrategy$$Directive.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/SupervisorStrategy$$Directive.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/SupervisorStrategy$$Directive.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/actor/SupervisorStrategy$$Directive.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/actor/SupervisorStrategy$$Directive.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/actor/SupervisorStrategy$$Directive.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/actor/SupervisorStrategy$$Directive.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/SupervisorStrategy$$Directive.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/SupervisorStrategy$$Directive.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Directive toStringFormat\[Directive] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/SupervisorStrategy$$Directive.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Directive, B)ImplicitThis member is added by an implicit conversion from Directive toArrowAssoc\[Directive] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDirective to any2stringadd\[Directive]

### Inherited by implicit conversion StringFormat fromDirective to StringFormat\[Directive]

### Inherited by implicit conversion Ensuring fromDirective to Ensuring\[Directive]

### Inherited by implicit conversion ArrowAssoc fromDirective to ArrowAssoc\[Directive]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy$$Directive.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy$$Escalate$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy$$Restart$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy$$Resume$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy$$Stop$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategyLowPriorityImplicits.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy$$Directive.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy$$Directive.html)*