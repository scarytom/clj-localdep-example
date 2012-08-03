# clj-localdep-example

A dummy Clojure project designed to demonstrate building with locally checked-in binary dependencies.

## Prerequisites

Works with Leiningen v2+ and Maven v3+

## Local Maven Repo

Adding jars to the local maven repo in `vendor/mvn` is as simple as running this:

```bash
mvn --debug deploy:deploy-file -Dfile=/full/path/to/dummy.jar -DartifactId=dummy -Dversion=1.0.0 -DgroupId=com.scarytom.test -Dpackaging=jar -Durl=file:vendor/mvn
```

## Usage

```bash
lein deps
```

## License

Copyright © 2012 Tom Denley

Distributed under the Eclipse Public License, the same as Clojure.
