# kodando libraries

Kotlin JS bindings and libraries.

## About the name

It's common in programming to use "coding" to refer to the action of programming, 
that is, the action of generating code by hand. If you change the 'c' with 'k', the
sound will be the same (see koding), but now we have a reference to the kotlin language. 
Bad or not, that's a common practice by the community that generate kotlin libraries like:

* https://github.com/mplatvoet/kovenant;
* Kotlin/ktor;
* TinyMission/kara;
* kohesive/kovert;
  
So, why 'kodando' and not 'koding'? That's because I'm brazilian and here, in Brazil, the 'ing' at
the end of words can be translated directly like 'ando', so some guys will say 'Estou codando!',
that is, 'I'm coding!'. The rest of the history is the same, 'c' to 'k' and we have 'kodando'.

Ok, maybe I had should thinking a little more, but...


## About the libraries

I have built some bindings and libraries to allow kotlin developers to code in kotlin but to use,
if they want, existing and good libraries in JS. All this related js libraries should be used with a bundler to
import directly from npm, or provided manually by you. I personally use the webpack, but the fuse-box 
is very attractive too. The SystemJS works as a loader too.

Every library will be published in https://bintray.com/danfma/maven, so you will be able to use
it with Maven, Gradle or other.

Right now, we have:

* **kodando-es6** - ES6 libraries and utilities;
* **kodando-rxjs** - Support to the `rxjs` library;
* **kodando-jest** - Support to the `jest` library;
* **kodando-history** - Support to the `history` library;
* **kodando-mobx** - Support to the `mobx` Library;
* **kodando-mobx-location** - Support to the `mobx-location` library;
* **kodando-mobx-react** - Support to the `mobx-react` library;
* **kodando-react** - Support to the `react` library;
* **kodando-react-dom** - Support to the `react-dom` library;
* **kodando-react-history** - Support to the `react-history` library;
* **kodando-react-router** - Support to the `react-router` library;
* **kodando-LIBRARY** - I think you understood the idea if you read until here... :D

More will be published. Almost all of these libraries are incomplete, but some are already useful 
and you are welcome to **contribute** to them and put what you need! So, let's make a huge
collection of JS libraries to kotlin here.


## The experience of Kotlin as a front-end language

I had been using **Kotlin as a front-end language** in a project with **React**, **Mobx**, **Rxjs** and 
built with **webpack**, but I already tested with **SystemJS** too. **Right now**, the most problematic library to 
work with among them is the **Mobx**, because Kotlin does not support decorators and its reflection API is incomplete, 
but you can do some workarounds and a little magic to make it work too. Sometimes, you will need to create fewer code 
than with TypeScript, or JavaScript ES6, sometimes a lot more.

**CycleJS** works very nice with Kotlin but I need to find where I put the initial bindings that I created for it :P.

**Knockout** is another one that will work good, but you could get some problems when using the templates or computed 
observables. 

Some libraries, like **Aurelia**, will be more difficult to work with but you can do it too. 

I will put some tutorials and examples as soon as I can 
(I'm a developer and a professor, thus I will disappear from time to time ;) .

Most of the problems to use kotlin will be related to decorators and its name mangling. While I understand why the 
compiler do that, most of the time, when interoping with existent libraries, it will be a tedious task to put 
a `@JsName()` over each member of your class.

Another problem is related to export you code as a library. Actually, your library could be exported as a Kotlin library,
with Maven or Gradle, to be consumed by another kotlin project. That works and you will have problem only when you 
need organize the generated code to create a bundle to your app (webpack or systemjs can help you with this task a lot).

If you intent to distribute your library as a NodeJS library, then you will have problems with the name mangling and
the package format. Keep in mind that a library in kotlin is a complete piece and can't be broken into parts or modules 
and that is the actual problem to make it work with aurelia and its dynamic loading of modules, if you intent to use 
SystemJS. You can handle this with some `JsName` annotations in your code and some scripts or bundlers too, 
but keep in mind that once exported as a JS package, you can't use it anymore as a Kotlin project, unless you create some
bindings again.

The kotlin ecosystem is not very friendly for pure JS developers right now, but the guys at JetBrains 
are working hard to make it better for us. In the end, you have some options and most of the time, 
the IDE and the language will make your job very pleasant, but
you need to keep in mind that there are some untamed problems around yet.

## SAMPLES

Give a look at the samples directory to see to how use these beasts!
