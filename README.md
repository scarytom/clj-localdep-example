# clj-localdep-example

A dummy Clojure project designed to demonstrate building with locally checked-in binary dependencies.

## Prerequisites

Works with Leiningen v2+ and Maven v3+

## Local Maven Repo

Adding jars to the local maven repo in `vendor/mvn` is as simple as running this:

```bash
mvn deploy:deploy-file -Dfile=/full/path/to/dummy.jar -DartifactId=dummy -Dversion=1.0.0 -DgroupId=com.scarytom.test -Dpackaging=jar -Durl=file:vendor/mvn
```

## Usage

```bash
lein deps
```

Output:
```bash
Retrieving com/scarytom/test/dummy/1.0.0/dummy-1.0.0.pom (1k)
    from file:/tmp/clj-localdep-example/vendor/mvn/
Could not find artifact com.scarytom.test:dummy:jar:1.0.0 in central (http://repo1.maven.org/maven2)
Could not find artifact com.scarytom.test:dummy:jar:1.0.0 in clojars (http://clojars.org/repo/)
Retrieving com/scarytom/test/dummy/1.0.0/dummy-1.0.0.jar (1k)
    from file:/tmp/clj-localdep-example/vendor/mvn/
```

## License

Copyright © 2012 Tom Denley

Distributed under the Eclipse Public License, the same as Clojure.
