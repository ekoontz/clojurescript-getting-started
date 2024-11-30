(ns hello-bundler.core
  (:require [react]
            [mapbox-gl]))

(.log js/console (str "hello."))
(.log js/console react/Component)
(.log js/console (str "goodbye."))
