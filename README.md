# hello-bundler

Following documentation on:

- [https://clojurescript.org/guides/quick-start](ClojureScript Quick Start)
- [https://clojurescript.org/guides/webpack](ClojureScript with Webpack)
- [https://figwheel.org/tutorial](Figwheel Tutorial)
- [https://figwheel.org/docs/create_a_build.html](Figwheel: create a build)

## Run

```
make run
```

Or to make sure you are starting from scratch:

```
make clean run
```

This will first `npm install` the dependencies listed in
package.json's `dependencies` section, and then run `clj` with the
appropriate arguments, then open
[http://localhost:9000/?rel=some-timestamp](http://localhost:9000/?rel=some-timestamp)
in a browser, and in the terminal, start the REPL.
You can now edit `src/hello_bundler/core.cljs` and to see the results in the browser, run in the repl:

```
(require '[hello-bundler.core :as hello] :reload)
```




