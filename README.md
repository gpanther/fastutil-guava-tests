# fastutil-guava-tests

A combination of the [fastutil](http://fastutil.di.unimi.it/) library with [guava-testlib](https://github.com/google/guava/tree/master/guava-testlib)
to try to suss out any bugs in the former.

The libraries are available under their respective licenses.

The test code is available under the Apache License 2.0.

Currently uses ECJ for compilation since javac (even with the latest Java 8 version) seems to get confused with some of the generic declarations.

When running it is recommended to give more memory to Maven and redirect its output:

````
export MAVEN_OPTS=-Xmx6000m
mvn clean test

````

