(ns hello-bundler.core
  (:require [react]))

(.log js/console (str "hello."))
(.log js/console react/Component)
(.log js/console (str "goodbye."))
