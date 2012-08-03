(defproject foo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"local" ~(str (.toURI (java.io.File. "vendor/mvn")))}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.scarytom.test/dummy "1.0.0"]])
