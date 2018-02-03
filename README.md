# shen-on-java
Shen Lisp to Java source transpiler/compiler.

This is an old project I made to compile Shen Lisp to Java source.

Generally, the code here is released under the Apache license except anything required under the Shen license: http://www.shenlanguage.org/ . The files under kl are copied from shenlanguage.org and used under that license.

This uses the Kryo library: https://github.com/EsotericSoftware/kryo

It is functional but the code is messy and I didn't completely finish it. I tried to write much of the compiler in Shen itself and so bootstrap it, but this became rather messy over time. I think if doing it again, I would write a complete compiler in Java, and then maybe try to bootstrap it completely as a separate thing. The hybrid approach was messy.
