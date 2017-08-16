## Instructions

Build the ClojureScript JAR from the ClojureScript repo:

```
./script/uberjar
```

Copy the JAR into this repo and build the project:

```
java -cp cljs.jar:src clojure.main script/build.clj
```
