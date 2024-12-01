(ns hello-bundler.core
  (:require [react]
            [react-dom]
            [mapbox-gl]))

(.log js/console (str "hello."))
(.log js/console react/Component)
(.log js/console (str "goodbye."))


(.render js/ReactDOM
         (.createElement js/React "h2" nil "This part is dynamically generated.")
         (.getElementById js/document "app"))


