# foo

A Clojure library designed to ... well, that part is up to you.

## Local Maven Repo
Adding jars to the local maven repo in `vendor/mvn`

```bash
mvn --debug deploy:deploy-file -Dfile=/full/path/to/dummy.jar -DartifactId=dummy -Dversion=1.0.0 -DgroupId=com.scarytom.test -Dpackaging=jar -Durl=file:vendor/mvn
```

## Usage

FIXME

## License

Copyright © 2012 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
